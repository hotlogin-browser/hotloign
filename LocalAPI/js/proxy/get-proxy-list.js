const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/proxy/list',
  headers: { },
  data: {
    page: 1,
    size: 10,
    provider: 1,
    type: "SOCKS5",
    status: 1,
    address: "1678",
    remark: "remark"
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 