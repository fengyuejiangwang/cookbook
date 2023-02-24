<template>
  <div id="header" class="">
    <div class="header clearfix">
      <router-link class="logo left" to="/index"><img src="../../assets/logo.png" alt=""></router-link>
      <ul class="nav">
        <li :class="{'act':0 ==checkindex}" @click="click(0)"><router-link to="/index">首页</router-link></li>
        <li :class="{'act':1 ==checkindex}" @click="click(1)" @mouseover="cookShow=!cookShow" @mouseout="cookShow=!cookShow">
          <router-link to="/cook" class="cookLi">菜谱 <span class="naww"></span></router-link>
          <div class="ctip" v-show="cookShow" >
            <span class="arwwj"> </span>
            <div class="ctab clearfix">
              <a href="/jingxuan/" target="_blank"><img src="https://cp1.douguo.com/static/nweb/images/jx3.png" alt=""> 精选</a>
              <a href="/zuixin/" target="_blank"><img src="https://i1.douguo.com/upload/banner/1585648022.png" alt="" style="margin-right:4px;">最新</a>
              <a href="/caidan" target="_blank"><img src="https://cp1.douguo.com/static/nweb/images/menu3.png" alt=""> 菜单</a>
            </div>
            <div class="cblok clearfix">
              <div class="citem clearfix">
                <span>常见菜式</span>
                <div class="imublo clearfix">
                  <a href="/caipu/家常菜" target="_blank">家常菜</a>
                  <a href="/caipu/热菜" target="_blank">热菜</a>
                  <a href="/caipu/凉菜" target="_blank">凉菜</a>
                  <a href="/caipu/主食" target="_blank">主食</a>
                  <a href="/caipu/汤" target="_blank">汤</a>
                  <a href="/caipu/早餐" target="_blank">早餐</a>
                  <a href="/caipu/午餐" target="_blank">午餐</a>
                  <a href="/caipu/海鲜" target="_blank">海鲜</a>
                  <a href="/caipu/孕妇" target="_blank">孕妇</a>
                  <a href="/caipu/甜品" target="_blank">甜品</a>
                  <a href="/caipu/粥" target="_blank">粥</a>
                  <a href="/caipu/宝宝食谱" target="_blank">宝宝食谱</a>
                  <a href="/caipu/糕点" target="_blank">糕点</a>
                  <a href="/caipu/微波炉" target="_blank">微波炉</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>中国菜系</span>
                <div class="imublo clearfix">
                  <a href="/caipu/川菜" target="_blank">川菜</a>
                  <a href="/caipu/粤菜" target="_blank">粤菜</a>
                  <a href="/caipu/东北菜" target="_blank">东北菜</a>
                  <a href="/caipu/湘菜" target="_blank">湘菜</a>
                  <a href="/caipu/鲁菜" target="_blank">鲁菜</a>
                  <a href="/caipu/浙菜" target="_blank">浙菜</a>
                  <a href="/caipu/湖北菜" target="_blank">湖北菜</a>
                  <a href="/caipu/清真菜" target="_blank">清真菜</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>外国食谱</span>
                <div class="imublo clearfix">
                  <a href="/caipu/韩国" target="_blank">韩国</a>
                  <a href="/caipu/日本料理" target="_blank">日本料理</a>
                  <a href="/caipu/法国" target="_blank">法国</a>
                  <a href="/caipu/意大利餐" target="_blank">意大利餐</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>各地小吃</span>
                <div class="imublo clearfix">
                  <a href="/caipu/四川小吃" target="_blank">四川小吃</a>
                  <a href="/caipu/广东小吃" target="_blank">广东小吃</a>
                  <a href="/caipu/北京小吃" target="_blank">北京小吃</a>
                  <a href="/caipu/陕西小吃" target="_blank">陕西小吃</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>烘焙大全</span>
                <div class="imublo clearfix">
                  <a href="/caipu/蛋糕" target="_blank">蛋糕</a>
                  <a href="/caipu/面包" target="_blank">面包</a>
                  <a href="/caipu/饼干" target="_blank">饼干</a>
                  <a href="/caipu/披萨" target="_blank">披萨</a>
                  <a href="/caipu/甜品" target="_blank">甜品</a>
                </div>
              </div>
            </div>
            <div class="cmore">
              <a href="/fenlei" target="_blank">查看全部分类 <img src="https://cp1.douguo.com/static/nweb/images/more2.png" alt=""></a>
            </div>
          </div>
        </li>
        <li :class="{'act':2 ==checkindex }" @click="click(2)" @mouseover="healthyShow=!healthyShow" @mouseout="healthyShow=!healthyShow">
          <router-link to="/article" class="healthyLi">饮食健康<span class="naww"></span></router-link>
          <div class="healthy" v-show="healthyShow">
            <span class="arwwj"> </span>
            <div class="cblok clearfix">
              <div class="diet clearfix">
                <span>饮食健康</span>
                <div class="imublo clearfix">
                  <a href="/article" target="_blank">饮食新闻</a>
                  <a href="/caipu/美容瘦身" target="_blank">美容瘦身</a>
                  <a href="/caipu/饮食小常识" target="_blank">饮食小常识</a>
                  <a href="/caipu/养生秘方" target="_blank">养生秘方</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>功能性调理</span>
                <div class="imublo clearfix">
                  <a href="/caipu/清热去火" target="_blank">清热去火</a>
                  <a href="/caipu/减肥" target="_blank">减肥</a>
                  <a href="/caipu/祛痰" target="_blank">祛痰</a>
                  <a href="/caipu/乌发" target="_blank">乌发</a>
                  <a href="/caipu/滋阴壮阳" target="_blank">滋阴壮阳</a>
                  <a href="/caipu/健脾养胃" target="_blank">健脾养胃</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>人群膳食</span>
                <div class="imublo clearfix">
                  <a href="/caipu/孕妇" target="_blank">孕妇</a>
                  <a href="/caipu/老人" target="_blank">老人</a>
                  <a href="/caipu/产妇" target="_blank">产妇</a>
                  <a href="/caipu/哺乳期" target="_blank">哺乳期</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>疾病调理</span>
                <div class="imublo clearfix">
                  <a href="/caipu/糖尿病" target="_blank">糖尿病</a>
                  <a href="/caipu/高血压" target="_blank">高血压</a>
                  <a href="/caipu/痛风" target="_blank">痛风</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>功效营养</span>
                <div class="imublo clearfix">
                  <a href="/caipu/补钙" target="_blank">补钙</a>
                  <a href="/caipu/贫血" target="_blank">贫血</a>
                  <a href="/caipu/提高免疫力" target="_blank">提高免疫力</a>
                  <a href="/caipu/养胃" target="_blank">养胃</a>
                  <a href="/caipu/防雾霾" target="_blank">防雾霾</a>
                  <a href="/caipu/润肺止咳" target="_blank">润肺止咳</a>
                  <a href="/caipu/养颜" target="_blank">养颜</a>
                  <a href="/caipu/失眠" target="_blank">失眠</a>
                  <a href="/caipu/抗癌" target="_blank">抗癌</a>
                </div>
              </div>
            </div>
          </div>
        </li>
        <li :class="{'act':3 ==checkindex }" @click="click(3)"><router-link to="/note" class="noteLi">笔记</router-link></li>
        <li><router-link to="/mall" class="mallLi">商城</router-link></li>
      </ul>
      <form class="search br4 left" method="POST" id="searchForm" action="/caipu/" accept-charset="utf-8" onsubmit="document.charset='utf-8';return Search();">
        <input type="text" id="global_search_inpt" class="sput" name="keywords" :value="value" lang="zh-CN" autocomplete="off"
               @focus="value=''"
               @blur="value='搜索菜谱、菜单、食材、用户';searchShow=!searchShow"
               @click="searchShow=!searchShow">
        <input type="submit" value=" " class="lib">
        <div class="sugg2" id="mysu2" v-show="searchShow">
          <ul style="width:220px;margin: 0;padding: 0">
            <li><router-link to="" class="s">1.减肥餐</router-link></li>
            <li><router-link to="" class="s">2.家常菜</router-link></li>
            <li><router-link to="" class="s">3.南瓜</router-link></li>
            <li><router-link to="" class="s">4.月子餐</router-link></li>
            <li><router-link to="" class="s">5.饼干</router-link></li>
            <li><router-link to="" class="s">6.宵夜</router-link></li>
            <li><router-link to="" class="s">7.土豆</router-link></li>
            <li><router-link to="" class="s">8.快手菜</router-link></li>
            <li><router-link to="" class="s">9.早餐</router-link></li>
            <li><router-link to="" class="s">10.口水鸡</router-link></li>
          </ul>
        </div>
      </form>
      <div class="pubt" @mouseover="releaseShow=!releaseShow" @mouseout="releaseShow=!releaseShow">
        <a class="btn-pubt" href="javascript:void(0);">发布</a>
        <div class="pubt-box br8" v-show="releaseShow">
          <span class="arwwj"> </span>
          <router-link to="/uploadcook">发布菜谱</router-link>
          <router-link to="/addMenu">创建菜单</router-link>
        </div>
      </div>
      <div v-if="loginSate" class="myinfo relative" @mouseover="myInfoShow=!myInfoShow" @mouseout="myInfoShow=!myInfoShow">
        <div style="display:flex ">
        <router-link class="headicon" :to="'/user?id='+(user.id)">
        <img class="wb100 br50" :src="user.avatar"> </router-link>
       <router-link :to="'/user?id='+(user.id)"><span style="display: inline-block;margin-top: 3px;margin-left: 10px">{{user.username}}</span></router-link>
      </div>
        <div class="myedit br8" v-show="myInfoShow">
          <span class="arwwj"> </span>
          <router-link class="relative" to="">消息提醒</router-link>
          <router-link to="/userprofile">账号设置</router-link>
          <router-link to="/" @click.native="exit">退出</router-link>
        </div>
      </div>
      <div class="perinfo" v-else>
        <router-link class="login" to="/login"> 登录 </router-link> |
        <router-link class="register" to="/register" > 注册 </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Header",
  data() {
    return {
      cookShow: false,
      healthyShow: false,
      releaseShow: false,
      myInfoShow: false,
      searchShow: false,
      value: '搜索菜谱、菜单、食材、用户',
      loginSate: '',
      user: '',
      checkindex: 0,
    }
  },
  created() {
    this.loginSate = window.sessionStorage.getItem('loginState');
    if(this.loginSate)
      this.user = JSON.parse(window.sessionStorage.getItem('user'));
  },
  methods:{
    click(index){
      this.checkindex=index;
    },
    exit() {
      window.sessionStorage.setItem('loginState', 'false');
      this.$data.loginSate = false;
    },
  },

}
</script>

<style scoped>
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
* {
  box-sizing: border-box;
}
#header .nav li>a:hover, #header .pubt-box a:hover, #header .myedit a:hover, #header .perinfo a:hover
{
  color:#84b92c;
}
a:hover{
  text-decoration: none;
}
user agent stylesheet
div {
  display: block;
}
body {
  background: #fff;
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  padding-top: 60px;
}
#header {
  box-shadow: 0 2px 4px 0 rgb(0 0 0 / 8%);
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 99;
  background: #fff;
}
#header .header {
  width: 1000px;
  height: 60px;
  padding: 15px 0;
  margin: 0 auto;
}
.clearfix {
  zoom: 1;
}
.clearfix:after {
  clear: both;
  content: ".";
  display: block;
  font-size: 0;
  height: 0;
  line-height: 0;
  visibility: hidden;
}
#header .logo {
  height: 30px;
}
.left {
  float: left;
}
a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
}
#header .logo>img {
  height: 30px;
}
img {
  vertical-align: bottom;
}
#header .nav {
  float: left;
  margin-left: 20px;
  display: inline-block;
  margin-top: 0;
  margin-bottom: 0;
}
ol, ul, li {
  list-style: none;
}
ul {
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
}
#header .nav li.act {
  border-radius: 8px 8px 0 0;
}
.cookLi:hover,.healthyLi:hover,.noteLi:hover,.mallLi:hover{
  color:#84b92c;
}
.relative {
  position: relative;
}
#header .nav li {
  float: left;
  height: 30px;
  line-height: 30px;
  font-size: 15px;
  color: #333;
  padding: 0 12px;
}
#header .nav li.act>a {
  color: #84b92c;
  font-weight: bold;
  border-bottom: 2px solid #84b92c;
}
#header .nav li>a {
  display: block;
  width: auto;
  height: 30px;
  line-height: 30px;
  letter-spacing: 1px;
}
#header .nav .naww {
  display: inline-block;
  width: 12px;
  height: 6px;
  background: url(https://cp1.douguo.com/static/nweb/images/more1-1.png);
  vertical-align: middle;
}
.nav .ctip {
  box-shadow: 0 2px 5px 0 rgb(64 71 81 / 10%);
  border-bottom-right-radius: 8px;
  border-bottom-left-radius: 8px;
  font-size: 14px;
  text-align: left;
  width: 800px;
  background: #fff;
  position: absolute;
  top: 60px;
  left: 270px;
  z-index: 99;
  padding-left: 16px;
}
.nav .ctip .arwwj {
  height: 15px;
  width: 492px;
  position: absolute;
  display: block;
  left: 0;
  top: -15px;
}
.nav .ctab {
  line-height: 55px;
}
.nav .ctab img {
  display: inline-block;
  height: 16px;
}
.nav .ctip img {
  vertical-align: middle;
  position: relative;
  top: -1px;
}
.nav .ctab a {
  display: inline-block;
  color: #383830;
  margin-right: 43px;
}
.nav .citem, .nav .diet {
  margin-bottom: 32px;
}
.nav .citem>span {
  float: left;
  width: 100px;
  text-align: center;
  font-weight: bold;
  margin-right: 16px;
  line-height: 30px;
  color: #333;
}
.nav .citem>div {
  float: left;
  width: 666px;
}
.nav .citem a {
  width: 95px;
  display: inline-block;
  float: left;
  line-height: 30px;
}
.nav .cmore {
  line-height: 52px;
  text-align: center;
  border-top: 1px solid #E5E3DF;
  margin-right: 16px;
}
.nav .imore, .nav .cmore a {
  color: #256DC6;
}
.nav .healthy {
  box-shadow: 0 2px 5px 0 rgb(64 71 81 / 10%);
  border-bottom-right-radius: 8px;
  border-bottom-left-radius: 8px;
  font-size: 14px;
  text-align: left;
  width: 702px;
  background: #fff;
  position: absolute;
  top: 60px;
  left: 300px;
  z-index: 99;
  padding-left: 16px;
}
.nav .healthy .arwwj {
  height: 15px;
  width: 492px;
  position: absolute;
  display: block;
  left: 0;
  top: -15px;
}
.nav .diet>span {
  float: left;
  width: 100px;
  text-align: center;
  font-weight: bold;
  margin-right: 16px;
  line-height: 30px;
  color: #333;
}
.nav .diet>div {
  float: left;
  width: 570px;
}
.nav .diet a {
  width: 95px;
  display: inline-block;
  float: left;
  line-height: 30px;
}
#header .search {
  height: 30px;
  display: inline-block;
  margin-left: 15px;
  position: relative;
}
.br4 {
  border-radius: 4px;
}
.left {
  float: left;
}
#header .search .sput {
  float: left;
  width: 182px;
  height: 30px;
  line-height: 16px;
  padding: 7px 10px;
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
  background: #F7F7F7;
  color: #999;
  font-size: 12px;
}
input, textarea, select, button {
  font: 12px Noto Sans,"思源黑体";
  outline: 0;
}
#header .search .lib {
  float: left;
  width: 38px;
  height: 30px;
  border-top-right-radius: 4px;
  border-bottom-right-radius: 4px;
  background: #eee url(https://cp1.douguo.com/static/nweb/images/search2.png) no-repeat 12px 8px;
  cursor: pointer;
}
.sugg2 {
  height: 300px;
  overflow: hidden;
  position: absolute;
  top: 30px;
  left: 0;
  box-shadow: 0 0 5px 0 rgb(64 71 81 / 10%);
  background: #fff;
}
#header .pubt {
  float: left;
  margin-left: 15px;
  position: relative;
}
#header .btn-pubt {
  display: block;
  width: 60px;
  height: 30px;
  text-align: center;
  line-height: 30px;
  background: #84b92c;
  color: #fff;
  font-size: 14px;
  border-radius: 4px;
}
#header .btn-pubt a:hover{
cursor: pointer;
}
#header .pubt-box {
  width: 130px;
  background: #fff;
  box-shadow: 0 0 5px 0 rgb(64 71 81 / 10%);
  position: absolute;
  z-index: 999;
  top: 44px;
  left: -35px;
  padding: 8px;
}
#header .pubt-box .arwwj {
  height: 15px;
  width: 130px;
  position: absolute;
  display: block;
  left: 0;
  top: -15px;
}
#header .pubt-box a {
  line-height: 36px;
  display: block;
  text-align: center;
  font-size: 13px;
}
.br8 {
  border-radius: 8px;
}
#header .myinfo {
  margin-left: 47px;
  float: left;
}
#header .headicon {
  width: 30px;
  height: 30px;
  display: inline-block;
  overflow: hidden;
}
.br50 {
  border-radius: 50%;
}
.wb100 {
  display: block;
  width: 100%;
}
#header .myedit {
  width: 130px;
  padding: 8px;
  background: #fff;
  position: absolute;
  z-index: 99;
  top: 45px;
  left: -50px;
  box-shadow: 0 0 5px 0 rgb(64 71 81 / 10%);
}
#header .myinfo .arwwj {
  height: 15px;
  width: 130px;
  position: absolute;
  display: block;
  left: 0;
  top: -15px;
}
#header .myedit a {
  line-height: 36px;
  display: block;
  text-align: center;
  font-size: 13px;
}
#header .perinfo {
  float: left;
  display: inline-block;
  margin-left: 40px;
  height: 30px;
  line-height: 30px;
}
#header .perinfo .login, #header .perinfo .register {
  font-size: 15px;
  color: #000;
  font-weight: normal;
}
.s{
  height: 30px;
  display: block;
  margin: 0px;
  font: 12px Noto Sans,"思源黑体";
  color:black;
  padding: 5px;
}
.s:hover{
 background-color:#f2f2f2 ;
}
/deep/ .el-input__inner {
  border-bottom-right-radius:0px;
  border-top-right-radius:0px;
  border-right: none;
}
/deep/ .el-input__inner:focus {
 border-color:#DCDFE6;
}
</style>
