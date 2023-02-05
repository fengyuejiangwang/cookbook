import http from "../utils/request";
export default {
  async getHotNote() {
    return await http.getRest("note/hotnote");
  },
  async getNoteList(params) {
    return await http.post("note/notelist",params);
  },
  async getNoteDetail(params) {
    return await http.post("note/notedetail", params);
  },
  async getNoteAuthorInfo(params) {
    return await http.post("note/noteauthorinfo", params);
  },
  async getHotWork(params) {
    return await http.post("note/hotnote",params);
  },
};
