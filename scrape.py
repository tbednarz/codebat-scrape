# you need these two to scrape
from bs4 import BeautifulSoup
import requests

# provide url to requests.get() to get the sites data
urlHalf = 'codingbat.com'
# turn the response into soup

# provide a url "https://codingbat.com/python OR java /Warmup-1, Warmup-2 etc"


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
    return(linkList)


print(make_link('https://codingbat.com/python/Warmup-1'))


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
