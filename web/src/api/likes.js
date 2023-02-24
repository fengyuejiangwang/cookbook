import http from "../utils/request";
export default {
  async collect(parms) {
    return await http.post("/likes/collect",parms);
  },
  async attention(parms) {
    return await http.post("/likes/attention",parms);
  },
}
