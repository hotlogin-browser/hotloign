import requests

data = {
    'provider': 1,
    'type': 'SOCKS5',
    'agentGroupName': '默认分组',
    'address': '38.56.78.156',
    'port': 7890,
    'hostAccount': 'username',
    'hostPassword': 'password',
    'refreshUrl': 'https://www.a.com',
    'queryChannel': 'IP2Location',
    'remark': '备注'
}

response = requests.post('http://localhost:60000/api/v2/proxy/add', json=data)
print(response.text) 