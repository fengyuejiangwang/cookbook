import http from "../utils/request";
export default {
  async getGourmetDaren() {
    return await http.getRest("user/gourmetdaren");
  },
};
