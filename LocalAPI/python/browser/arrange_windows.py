import requests

data = {
    'auto': True,
    'mode': 1
}

response = requests.post('http://localhost:60000/api/v2/env/arrangeWindows', json=data)
print(response.text) 