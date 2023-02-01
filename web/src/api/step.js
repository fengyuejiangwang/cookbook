import http from "../utils/request";
export default {
  async getStepInfo(params) {
    return await http.post("step/stepinfo",params);
  },
};
