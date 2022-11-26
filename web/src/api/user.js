import http from "../utils/request";
export default {
  async getUserInfo(params) {
    return await http.post("user/info", params);
  },
};
