#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/proxy/delete" \
  -H "Content-Type: application/json" \
  -d '{
    "ids": ["182","183"]
  }' 