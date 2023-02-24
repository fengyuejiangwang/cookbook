import http from "../utils/request";
export default {
  async collect(parms) {
    return await http.post("/likes/collect",parms);
  },
  async attention(parms) {
    return await http.post("/likes/attention",parms);
  },
  async judgeCollect(parms) {
    return await http.post("/likes/judgecollect",parms);
  },
  async judgeAttention(parms) {
    return await http.post("/likes/judgeattention",parms);
  },
  async deCollect(parms) {
    return await http.post("/likes/decollect",parms);
  },
  async deAttention(parms) {
    return await http.post("/likes/deattention",parms);
  },
}
