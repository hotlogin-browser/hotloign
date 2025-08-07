#!/bin/bash
 
curl -X POST "http://localhost:60000/api/v2/env/clearCache" \
  -H "Content-Type: application/json" \
  -d '{"id":"181","cacheList":["indexedDB","localStorage","cookies"],"clearEnvFolder":0}' 