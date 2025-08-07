import requests

data = {
    'name': 'group_name',
    'remark': '备注'
}

response = requests.post('http://localhost:60000/api/v2/group/add', json=data)
print(response.text) 