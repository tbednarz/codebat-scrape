# TO DO
# 1. Login to site to get users answers

# you need these two to scrape
from bs4 import BeautifulSoup
import requests
import os.path
from os import path


urlHalf = 'codingbat.com'

# get login info
print("what is your email")
inputOne = input()
print("password")
inputTwo = input()

# login
login_url = "https://codingbat.com/login"
request_url = "https://codingbat.com/java/Warmup-1"
post_params = {
    "uname": inputOne,
    "pw": inputTwo,
}


# scrape answers and write to answers.txt


def scrape():
    f = open('answers.txt', 'w')
    with requests.Session() as session:
        post = session.post(login_url, data=post_params)
        r = session.get(request_url)

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
        f.write(i + ": " + linkList[i] + "\n\n")
        f.write(aceDiv.text + "\n")


scrape()
