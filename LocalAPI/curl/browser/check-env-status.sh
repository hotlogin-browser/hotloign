#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/env/checkStatus" \
  -H "Content-Type: application/json" \
  -d '{"id":"181"}' 