import Vue from 'vue'
import Router from 'vue-router'
import Index from "../components/index"
import Login from "../components/user/Login";
import Register from "../components/user/Register";
import DailyNote from "../components/index/DailyNote";
import Home from "../components/Home";

Vue.use(Router);

export default new Router({
   mode:'history',
  routes: [
    {path: '/', redirect: '/index'},
    {
      path: '/home',
      name:'主页',
      meta:{title: '主页'},
      component: Home,
      children: [
        {
          path: '/index',
          name:'首页',
          meta:{title: '首页'},
          component: Index,
        },
       ]
    },
    {
      path:"/login",
      name:'登录',
      meta:{title: '登录'},
      component:Login
    },
    {
      path:"/register",
      name:'注册',
      meta:{title: '注册'},
      component:Register
    },
  ]
})
