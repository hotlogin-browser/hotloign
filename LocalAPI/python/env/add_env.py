import requests

data = {
    'name': 'P-1',
    'groupId': '1828956',
    'remark': 'remark1',
    'proxyConfig': {
        'provider': 1,
        'type': 'SOCKS5',
        'address': '38.56.78.156',
        'port': 7890,
        'hostAccount': 'username',
        'hostPassword': 'password'
    },
    'accountInfo': {
        'openUrl': ['https://www.baidu.com']
    },
    'fingerprint': {
        'browserType': 'chrome',
        'kernelVersion': 128,
        'system': 0,
        'osVersion': 'Windows 11'
    },
    'advancedSetting': {
        'autoTimeZone': 1,
        'webRtcType': 'BAN',
        'geoLocationType': 'ASK',
        'autoGeoLocation': 1,
        'autoLanguage': 1,
        'autoInterfaceLanguage': 1,
        'resolutionType': 'BASE_ON_UA',
        'fontType': 'DEFAULT',
        'canvasType': 'NOISE',
        'webglImageType': 'NOISE',
        'webglMetaType': 'NOISE',
        'webGpuType': 'BASEONWEBGL',
        'audioContextType': 'NOISE',
        'mediaDeviceType': 'NOISE',
        'matchDeviceNum': 1,
        'speechVoiceType': 'NOISE',
        'clientRectsType': 'NOISE',
        'hardwareConcurrencyNum': 4,
        'deviceMemory': 8,
        'deviceNameType': 'CUSTOM',
        'deviceName': 'DESKTOP-N3TSAO2',
        'deviceMacType': 'CUSTOM',
        'deviceMac': '50:a6:7f:10:9f:b6',
        'trackType': 'DEFAULT',
        'protectScanPort': 1
    }
}

response = requests.post('http://localhost:60000/api/v2/env/add', json=data)
print(response.text) 