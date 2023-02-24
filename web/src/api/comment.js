import http from "../utils/request";
export default {
  async getComment(parms) {
    return await http.post("comment/getcomment",parms);
  },
  async publishComment(parms) {
    return await http.post("comment/publishcomment",parms);
  },
}
