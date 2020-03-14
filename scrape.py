from bs4 import BeautifulSoup
import requests

url = 'codingbat.com'
response = requests.get('https://codingbat.com/java/Warmup-1', timeout=5)
content = BeautifulSoup(response.content, "html.parser")


links = content.find_all("a", href=lambda href: href and "prob" in href)
for link in links:
    backUrl = link.get("href")
    realUrl = url + backUrl
    f = open("links.txt", "a")
    f.write(realUrl + "\n")
    f.close
# indent = content.find('div', attrs={"class": "indent"})
# table = indent.find('table')
# links = table.find("tr")
# data = links.find('td')
# realLinks = data.findAll('a')

# for links in table:
#     for data in links:
#         for realLinks in data:
#             print(realLinks)
