import requests

response = requests.get('http://localhost:60000/api/v2/status')
print(response.text) 