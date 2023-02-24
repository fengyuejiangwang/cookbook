// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueResource from 'vue-resource'
import App from './App'
import Axios from 'axios';
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css';
import router from './router'
import Less from 'less'

Vue.prototype.$http = Axios
Vue.config.productionTip = false;
Vue.use(ElementUI);
Vue.use(VueResource);
Vue.use(Less);

//将前端发送的json数据模拟成普通数据格式，后台可以使用@RequestParam接收数据
Vue.http.options.emulateJSON = true;

// 监听路由跳转生命周期钩子方法
router.beforeEach(function (to, from, next) {
  let loginState = window.sessionStorage.getItem("loginState");
  if (loginState === null || !loginState) {
    // 未登录
    window.sessionStorage.setItem("loginState",false);
    next({path:"/login"});
  }else {
    next();
  }
});

//跳转页面，重置滚动条置顶部
router.afterEach((to,from,next) => {
  window.scrollTo(0,0); //切换路由之后滚动条始终在最顶部
});

new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
});
