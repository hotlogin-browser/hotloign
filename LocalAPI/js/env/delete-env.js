const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/env/delete',
  headers: { },
  data: {
    ids: ["181", "182"],
    clearEnvFolder: 0
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 