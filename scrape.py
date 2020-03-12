from bs4 import BeautifulSoup
import requests

url = 'https://codingbat.com/java/Warmup-1'
response = requests.get(url, timeout=5)
content = BeautifulSoup(response.content, "html.parser")

for ana in content.findAll('a'):
    if ana.parent.name == "td":
        print(ana)

# indent = content.find('div', attrs={"class": "indent"})
# table = indent.find('table')
# links = table.find("tr")
# data = links.find('td')
# realLinks = data.findAll('a')

# for links in table:
#     for data in links:
#         for realLinks in data:
#             print(realLinks)
