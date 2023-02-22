import http from "../utils/request";
export default {
  async upload(params) {
    return await http.post2("/files/uploadfile",params);
  },
};
