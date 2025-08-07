#!/bin/bash
 
curl -X POST "http://localhost:60000/api/v2/env/updateGroup" \
  -H "Content-Type: application/json" \
  -d '{"ids":["181","182"],"groupId":"1111"}' 