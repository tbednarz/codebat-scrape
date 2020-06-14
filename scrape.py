
from bs4 import BeautifulSoup
import requests
import getpass

DOMAIN = 'codingbat.com'

# urls to use
BASE_URL = "https://" + DOMAIN
LOGIN_URL = BASE_URL + "/login"
JAVA_URL = BASE_URL + "/java/"


def get_problem_directories():
    print("Getting directories")
    href_array = []
    initial = requests.get(BASE_URL)
    soup = BeautifulSoup(initial.content, "lxml")
    tab_data = soup.find(class_="floatleft")
    hrefs = tab_data.find_all(class_="h2")
    for href in hrefs:
        href_array.append(href.text)
    return href_array


def gather_links():
    directories = get_problem_directories()
    link_array = []
    print("Getting problem links")
    for directory in directories:
        response = requests.get(JAVA_URL + directory)
        # get links to problems
        content = BeautifulSoup(response.content, "lxml")
        links = content.find_all(
            "a", href=lambda href: href and "prob" in href)
        link_array.append(links)
    return link_array


def join_links():
    link_list = gather_links()
    new_link_list = {}
    print("Joining links")
    for link in link_list:
        for each in link:
            text = each.text
            back_url = each.get("href")
            real_url = "https://" + DOMAIN + back_url
            new_link_list.update({text: real_url})
    return new_link_list


def scrape_data():
    link_dict = join_links()
    with open('answers/answers.java', 'w') as f:
        with requests.Session() as session:
            post = session.post(LOGIN_URL, data=post_params)
            for title, url in link_dict.items():
                print("Scraping: " + title)
                response = session.get(link_dict[title])
                content = BeautifulSoup(response.content, "lxml")
                indentDiv = content.find(class_="indent")
                table = indentDiv.find("form", {"name": "codeform"})
                aceDiv = table.find("div", id="ace_div")
                f.write("//" + title + ": " + link_dict[title] + "\n\n")
                f.write(aceDiv.text + "\n")
            print("done")


if __name__ == "__main__":
    print("what is your email")
    input_one = input(">")
    print("Password")
    input_two = getpass.getpass()
    post_params = {
        "uname": input_one,
        "pw": input_two,
    }
    scrape_data()
