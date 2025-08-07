import requests

data = {
    'ids': ['181', '182']
}

response = requests.post('http://localhost:60000/api/v2/group/delete', json=data)
print(response.text) 