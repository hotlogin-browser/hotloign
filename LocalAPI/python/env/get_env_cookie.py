import requests

data = {
    'id': '181'
}

response = requests.post('http://localhost:60000/api/v2/env/getCookie', json=data)
print(response.text) 