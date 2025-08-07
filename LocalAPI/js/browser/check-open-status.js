const axios = require('axios');

const config = {
  method: 'get',
  url: 'http://localhost:60000/api/v2/env/checkOpenStatus',
  headers: { }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 