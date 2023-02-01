import Vue from 'vue'
import Router from 'vue-router'
import Index from "../components/index"
import Login from "../components/user/Login";
import Register from "../components/user/Register";
import Home from "../components/Home";
import UploadCook from "../components/cook/UploadCook";
import CookDetail from "../components/cook/CookDetail";
import UserProfile from "../components/user/UserProfile";
import User from "../components/user/User"
Vue.use(Router);

export default new Router({
   mode:'history',
  routes: [
    {path: '/', redirect: '/index'},
    {path: '/home', redirect: '/index'},
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
        {
          path: '/uploadcook',
          name:'发布菜谱',
          meta:{title: '发布菜谱'},
          component: UploadCook,
        },
        {
          path: '/cookdetail',
          name:'菜谱详情',
          meta:{title: '菜谱详情'},
          component: CookDetail,
        },
        {
          path: '/user',
          name:'个人中心',
          meta:{title: '个人中心'},
          component: User,
        },
        {
          path: '/userprofile',
          name:'个人资料',
          meta:{title: '个人资料'},
          component: UserProfile,
        }
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
