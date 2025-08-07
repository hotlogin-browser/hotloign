#!/bin/bash

curl -X POST "http://localhost:60000/api/v2/env/arrangeWindows" \
  -H "Content-Type: application/json" \
  -d '{"auto":true,"mode":1}' 