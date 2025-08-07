const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/env/detail',
  headers: { },
  data: {
    id: "181"
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 