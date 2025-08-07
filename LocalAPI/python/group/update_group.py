import requests

data = {
    'id': '182',
    'name': 'group_name_updated',
    'remark': '备注_updated'
}

response = requests.post('http://localhost:60000/api/v2/group/update', json=data)
print(response.text) 