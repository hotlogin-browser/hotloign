const axios = require('axios');

const config = {
  method: 'post',
  url: 'http://localhost:60000/api/v2/group/update',
  headers: { },
  data: {
    id: "182",
    name: "group_name_updated",
    remark: "备注_updated"
  }
};

axios(config)
.then((response) => {
  console.log(JSON.stringify(response.data));
})
.catch((error) => {
  console.log(error);
}); 