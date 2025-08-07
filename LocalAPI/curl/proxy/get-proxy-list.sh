#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/proxy/list" \
  -H "Content-Type: application/json" \
  -d '{
    "page": 1,
    "size": 10,
    "provider": 1,
    "type": "SOCKS5",
    "status": 1,
    "address": "1678",
    "remark": "remark"
  }' 