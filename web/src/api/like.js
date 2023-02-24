import http from "../utils/request";
export default {
  async collect(parms) {
    return await http.post("/like/collect",parms);
  },
}
