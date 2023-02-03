import http from "../utils/request";
export default {
  async getGourmetDaren() {
    return await http.getRest("user/gourmetdaren");
  },
  async getUserName(params) {
    return await http.post("user/getusername",params);
  },
};
