import requests

data = {
    'id': '181',
    'cacheList': ['indexedDB', 'localStorage', 'cookies'],
    'clearEnvFolder': 0
}

response = requests.post('http://localhost:60000/api/v2/env/clearCache', json=data)
print(response.text) 