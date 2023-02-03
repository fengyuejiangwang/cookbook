import http from "../utils/request";
export default {
  async getHotFood() {
    return await http.getRest("food/hotfood");
  },
};
