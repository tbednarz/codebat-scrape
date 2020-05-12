# TO DO
# 1. Login to site to get users answers

# you need these two to scrape
from bs4 import BeautifulSoup
import requests
# import array

# provide url to requests.get() to get the sites data
urlHalf = 'codingbat.com'


# provide a url "https://codingbat.com/python OR java /Warmup-1, Warmup-2 etc"
# still need to implement


print("Would you like Python or java solutions?")
question_one_answer = input()


def make_link(url):
    response = requests.get(url, timeout=5)
    content = BeautifulSoup(response.content, "html.parser")
    links = content.find_all("a", href=lambda href: href and "prob" in href)
    linkList = {}
    for link in links:
        text = link.text
        backUrl = link.get("href")
        realUrl = "http://" + urlHalf + backUrl
        linkList.update({text: realUrl})
    return linkList


def get_answers(links):
    for i in links:
        response = requests.get(links[i])
        content = BeautifulSoup(response.content, "lxml")

        indentDiv = content.find(class_="indent")
        table = indentDiv.find("form", {"name": "codeform"})
        aceDiv = table.find("div", id="ace_div")

        # aceLayer = aceDiv.find("div", class_="ace_line")
        print(aceDiv.text)


# just for helping during testing
if question_one_answer == "python":
    get_answers(make_link("https://codingbat.com/python/Warmup-1"))
else:
    get_answers(make_link("https://codingbat.com/java/Warmup-1"))

# linkList.append(link.text, realUrl)
# # f = open("links.txt", "a")
# # f.write(text + "\n\n" + realUrl + "\n\n")
# f.close

# HERE I WAS TRYING TO FIGURE OUT BEAUTIFUL SOUP AND HOW TO CRAWL AROUND
# indent = content.find('div', attrs={"class": "indent"})
# table = indent.find('table')
# links = table.find("tr")
# data = links.find('td')
# realLinks = data.findAll('a')

# for links in table:
#     for data in links:
#         for realLinks in data:
#             print(realLinks)
