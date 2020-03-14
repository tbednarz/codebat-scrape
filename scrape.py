# you need these two to scrape
from bs4 import BeautifulSoup
import requests

# provide url to requests.get() to get the sites data
url = 'codingbat.com'
response = requests.get('https://codingbat.com/java/Warmup-1', timeout=5)

# turn the response into soup
content = BeautifulSoup(response.content, "html.parser")

# find every link on the page, filtering for only links that include "prob" in the href
links = content.find_all("a", href=lambda href: href and "prob" in href)

# for each link, get the href aka the backUrl, sinces its the second half
# join the backUrl with the url from above
# then write the result to links.txt
for link in links:
    backUrl = link.get("href")
    realUrl = url + backUrl
    f = open("links.txt", "a")
    f.write(realUrl + "\n")
    f.close

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
