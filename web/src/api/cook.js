import http from "../utils/request";
export default {
  async getDailyHotCook() {
    return await http.getRest("cook/dailyhotcook");
  },
  async getCookDetail(params) {
    return await http.post("cook/cookdetail", params);
  },
  async getAuthorInfo(params) {
    return await http.post("cook/authorinfo", params);
  },
  async getMaterialInfo(params) {
    return await http.post("cook/material", params);
  },
  async uploadCookInfo(params) {
    return await http.post("cook/uploadcookinfo", params);
  },
  async getCookList(params) {
    return await http.post("cook/cooklist",params);
  },
  async getCookListByType(params) {
    return await http.post("cook/cooklistbytype",params);
  },
  async getCookListByUerId(params) {
    return await http.post("cook/cooklistbyuserid",params);
  },
};
