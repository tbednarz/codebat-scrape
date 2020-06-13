
from bs4 import BeautifulSoup
import requests


urlHalf = 'codingbat.com'

print("what is your email")
inputOne = input(">")
print("password")
inputTwo = input(">")

post_params = {
    "uname": inputOne,
    "pw": inputTwo,
}

# urls to use
base_url = "https://codingbat.com"
login_url = "https://codingbat.com/login"
java_url = "https://codingbat.com/java/"


def get_href():
    print("Getting directories")
    href_array = []
    initial = requests.get(base_url)
    soup = BeautifulSoup(initial.content, "lxml")
    tab_data = soup.find(class_="floatleft")
    hrefs = tab_data.find_all(class_="h2")
    for href in hrefs:
        href_array.append(href.text)
    return(href_array)


def gather_links():
    directories = get_href()
    print("Getting problem links")
    link_array = []
    for directory in directories:
        r = requests.get(java_url + directory)
        # get links to problems
        content = BeautifulSoup(r.content, "lxml")
        links = content.find_all(
            "a", href=lambda href: href and "prob" in href)
        link_array.append(links)
    return(link_array)


def join_links():
    linkList = gather_links()
    new_link_list = {}
    print("Joining links")
    for link in linkList:
        for each in link:
            text = each.text
            backUrl = each.get("href")
            realUrl = "http://" + urlHalf + backUrl
            new_link_list.update({text: realUrl})
    return new_link_list


def scrape_data():
    f = open('answers/answers.java', 'w')
    linkList = join_links()
    with requests.Session() as session:
        post = session.post(login_url, data=post_params)
    for i in linkList:
        print("Scraping: " + i)
        response = session.get(linkList[i])
        content = BeautifulSoup(response.content, "lxml")
        indentDiv = content.find(class_="indent")
        table = indentDiv.find("form", {"name": "codeform"})
        aceDiv = table.find("div", id="ace_div")
        f.write("//" + i + ": " + linkList[i] + "\n\n")
        f.write(aceDiv.text + "\n")
    print("done")


if __name__ == "__main__":
    scrape_data()
