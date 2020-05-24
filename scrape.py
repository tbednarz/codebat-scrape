# you need these two to scrape
from bs4 import BeautifulSoup
import requests



urlHalf = 'codingbat.com'

# get login info
print("what is your email")
inputOne = input(">")
print("password")
inputTwo = input()
# print("Which language would you like to scrape? Java or Python?")
# which_lang = input()

# subsections of java
end_urls = ["Warmup-1", "Warmup-2", "Array-1"]

# login
login_url = "https://codingbat.com/login"
post_params = {
    "uname": inputOne,
    "pw": inputTwo,
}

request_url = "https://codingbat.com/java/"

# scrape answers and write to answers.txt


def scrape_java():
    f = open('answers/answers.java', 'w')
    with requests.Session() as session:
        post = session.post(login_url, data=post_params)
        for ends in end_urls:
            r = session.get(request_url + ends)
            # get links to problems
            content = BeautifulSoup(r.content, "lxml")
            links = content.find_all(
                "a", href=lambda href: href and "prob" in href)
            linkList = {}
            for link in links:
                text = link.text
                backUrl = link.get("href")
                realUrl = "http://" + urlHalf + backUrl
                linkList.update({text: realUrl})
                # print(linkList)

    # get solutions
            for i in linkList:
                response = session.get(linkList[i])
                content = BeautifulSoup(response.content, "lxml")
                indentDiv = content.find(class_="indent")
                table = indentDiv.find("form", {"name": "codeform"})
                aceDiv = table.find("div", id="ace_div")
                f.write("//" + i + ": " + linkList[i] + "\n\n")
                f.write(aceDiv.text + "\n")


scrape_java()
