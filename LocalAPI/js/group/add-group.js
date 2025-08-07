const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/group/add',
  headers: { },
  data: {
    name: "group_name",
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