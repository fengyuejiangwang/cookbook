import http from "../utils/request";
export default {
  async uploadMaterial(params) {
    return await http.post("material/uploadMaterial");
  },
}
