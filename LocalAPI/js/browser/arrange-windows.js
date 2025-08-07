const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/env/arrangeWindows',
  headers: { },
  data: {
    auto: true,
    mode: 1
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 