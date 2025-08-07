#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/env/start" \
  -H "Content-Type: application/json" \
  -d '{"id":"181","openIpTab":1}' 