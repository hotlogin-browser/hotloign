#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/group/add" \
  -H "Content-Type: application/json" \
  -d '{"name":"group_name","remark":"备注"}' 