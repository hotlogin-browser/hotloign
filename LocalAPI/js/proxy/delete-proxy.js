const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/proxy/delete',
  headers: { },
  data: {
    ids: ["182","183"]
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 