import http from "../utils/request";
export default {
  async getGourmetDaren() {
    return await http.getRest("user/gourmetdaren");
  },
  async getUser(params) {
    return await http.post("user/getuser",params);
  },
  async getUserList(params) {
    return await http.post("user/getuserlist",params);
  },
};
