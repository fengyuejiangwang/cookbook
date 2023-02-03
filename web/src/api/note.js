import http from "../utils/request";
export default {
  async getHotNote() {
    return await http.getRest("note/hotnote");
  },
  async getNoteList(params) {
    return await http.post("note/notelist",params);
  },
};
