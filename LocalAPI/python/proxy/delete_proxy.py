import requests

data = {
    'ids': ["182","183"]
}

response = requests.post('http://localhost:60000/api/v2/proxy/delete', json=data)
print(response.text) 