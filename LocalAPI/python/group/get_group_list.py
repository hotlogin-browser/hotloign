import requests

data = {
    'page': 1,
    'size': 10
}

response = requests.post('http://localhost:60000/api/v2/group/list', json=data)
print(response.text) 