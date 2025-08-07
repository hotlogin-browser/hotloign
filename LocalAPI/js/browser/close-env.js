const axios = require('axios');

const envId = '181';

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/env/close',
  headers: { },
  data: {
    id: envId
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 