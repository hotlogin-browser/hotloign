import requests

data = {
    'ids': ['181', '182'],
    'clearEnvFolder': 0
}

response = requests.post('http://localhost:60000/api/v2/env/delete', json=data)
print(response.text) 