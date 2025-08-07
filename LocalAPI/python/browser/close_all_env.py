import requests

response = requests.post('http://localhost:60000/api/v2/env/closeAll')
print(response.text) 