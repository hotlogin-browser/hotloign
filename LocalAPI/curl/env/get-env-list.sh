#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/env/list" \
  -H "Content-Type: application/json" \
  -d '{"page":1,"size":10}' 