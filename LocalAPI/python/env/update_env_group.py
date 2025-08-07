import requests

data = {
    'ids': ['181', '182'],
    'groupId': '1111'
}

response = requests.post('http://localhost:60000/api/v2/env/updateGroup', json=data)
print(response.text) 