import requests

data = {
    'id': '181',
    'openIpTab': 1
}

response = requests.post('http://localhost:60000/api/v2/env/start', json=data)
print(response.text) 