import axios from "axios";

// create an axios instance
const service = axios.create({
  baseURL: "http://localhost:8881/", // url = base url + request url
  // withCredentials: true, // send cookies when cross-domain requests
  timeout: 5000 // request timeout
});
const http = {
  // post请求提交
  post(url, params) {
    return service.post(url, params, {
      transformRequest: [
        params => {
          // 将请求参数转换成json格式
          return JSON.stringify(params);
        }
      ],
      headers: {
        "Content-Type": "application/json"
      }
    });
  },
  // put请求
  put(url, params) {
    return service.put(url, params, {
      transformRequest: [
        params => {
          return JSON.stringify(params);
        }
      ],
      headers: {
        "Content-Type": "application/json"
      }
    });
  },
  // rest风格的get请求
  getRest(url, params) {
    let _params;
    if (Object.is(params, undefined || null)) {
      _params = "";
    } else {
      _params = "/";
      for (const key in params) {
        if (
          params.hasOwnProperty(key) &&
          params[key] !== null &&
          params[key] !== ""
        ) {
          _params += `${params[key]}/`;
        }
      }
      _params = _params.substr(0, _params.length - 1);
    }
    if (_params) {
      return service.get(`${url}${_params}`);
    } else {
      return service.get(url);
    }
  },
  // 删除请求
  delete(url, params) {
    let _params;
    if (Object.is(params, undefined || null)) {
      _params = "";
    } else {
      _params = "/";
      for (const key in params) {
        if (
          params.hasOwnProperty(key) &&
          params[key] !== null &&
          params[key] !== ""
        ) {
          _params += `${params[key]}/`;
        }
      }
      _params = _params.substr(0, _params.length - 1);
    }
    if (_params) {
      return service.delete(`${url}${_params}`).catch(err => {
        message.error(err.message);
        return Promise.reject(err);
      });
    } else {
      return service.delete(url).catch(err => {
        message.error(err.message);
        return Promise.reject(err);
      });
    }
  }
};
export default http;
