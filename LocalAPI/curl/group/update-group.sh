#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/group/update" \
  -H "Content-Type: application/json" \
  -d '{"id":"182","name":"group_name_updated","remark":"备注_updated"}' 