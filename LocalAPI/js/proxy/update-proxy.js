const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/proxy/update',
  headers: { },
  data: {
    id: "181",
    provider: 1,
    type: "SOCKS5",
    agentGroupName: "默认分组",
    address: "38.56.78.156",
    port: 7890,
    hostAccount: "username",
    hostPassword: "password",
    refreshUrl: "https://www.a.com",
    queryChannel: "IP2Location",
    remark: "备注"
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 