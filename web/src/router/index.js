import Vue from 'vue'
import Router from 'vue-router'
import Home from "../components/Home"
import Login from "../components/user/Login";


Vue.use(Router);

export default new Router({
   mode:'history',
  routes: [
    {path: '/', redirect: '/home'},
    {
      path: '/home',
      name:'首页',
      meta:{title: '首页'},
      component: Home,
      children: [
       ]
    },
    {
      path:"/login",
      name:'登录',
      meta:{title: '登录'},
      component:Login
    }
  ]
})
