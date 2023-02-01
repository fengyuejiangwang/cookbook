import http from "../utils/request";
export default {
  async getHotNote() {
    return await http.getRest("note/hotnote");
  },
};
