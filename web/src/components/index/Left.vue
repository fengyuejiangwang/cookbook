<template>
  <div id="left">
    <!-- 大家都在搜 -->
    <h2 class="title">大家都在搜</h2>
    <div class="all_search">
      <a href="https://www.360kuai.com/mob/subject/400?sign=ex_28e676e3" rel="nofollow" target="_blank" class="A"><span class="B">新型肺炎实时疫情追踪</span>
      </a>
    </div>
    <!-- 食材 -->
    <h2 class="title">热门食材<router-link class="more" to="">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt=""></router-link></h2>
    <ul class="material-list br8">
      <li class="item" v-for="o in hotFood">
        <router-link to=""><img class="br4" :src="o.picture" >{{o.name}}</router-link>
      </li>
    </ul>
    <!-- 主题站文章 -->
    <h2 class="title">精彩主题文章<router-link class="more" to="">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt=""></router-link></h2>
    <div class="article">
      <ul class="alist clearfix">
        <div class="hot-article clearfix">
          <a class="cover br8" href="/article/detail/4096" target="_blank" style="background:url(https://cp1.douguo.com/upload/post/5/6/2/56228c4d2da02a2df47f82f4c874bac2.jpg) no-repeat center center;background-size:cover;">
          </a>
          <div class="info">
            <a class="name" style="max-height:60px;overflow:hidden;text-overflow: ellipsis;display: -webkit-box;-webkit-line-clamp: 2;-webkit-box-orient: vertical;" href="/article/detail/4096" target="_blank">新品发布会，智宴释放出这几个绝佳优势…</a>
            <p class="sour-auth">
              <span class="source">来自：食界大咖秀</span>
              作者：<a href="/u/u37568840674622.html">少油少盐</a>
            </p>
          </div>
        </div>
        <li><strong>·</strong><a href="/article/detail/4083" target="_blank"> 200元一斤的草莓？这个红遍全日本的奶茶品牌上新， 原料简直壕无人性！</a></li>
        <li class="ar"><strong>·</strong><a href="/article/detail/4082" target="_blank"> 健康开心果，全民开心GO！</a></li>
      </ul>
    </div>
    <!-- 大家的作品 -->
    <h2 class="title">大家的作品</h2>
    <ul class="zp-list">
      <li class="clearfix"  v-for="(val,key,index) in hotWork">
        <div class="left">
          <a class="zp br8" v-for="(val2,key2,index) in val">
            <img width="110" height="110" :src="val2.picture1">
          </a>
          <a class="zpinfo" href="/alldish/966669" >
            <p>{{key}}的作品</p>
            <p class="dishnum">对照菜谱做出来的作品 <span>9795</span> 个</p>
          </a>
          <div class="left zpwork" style="margin-left: -30px" v-for="(val2,key2,index) in val">
            <router-link class="zp br8" :to="'/notedetail?id='+(val2.id)" v-for="i in 3" style="background:#f9f9f9 url('https://cp1.douguo.com/upload/note/4/3/c/200x200_43696c7f21aa336a4951a94d57c5200c.jpg') no-repeat left center;background-size: 100%;margin: 0px 10px 30px 0px" ></router-link>
          </div>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
import noteApi from "../../api/note";
import foodApi from "../../api/food"
export default {
  name: "Left",
  data(){
    return {
      hotFood:[],
      hotWork:'',
    };
  },
  created(){
    this.getHotFood();
    this.getHotWork();
  },
  methods: {
    async getHotFood() {
      let res = await foodApi.getHotFood();
      res = res.data;
      if (res.code == 200) {
        this.hotFood = res.data;
      }
    },
    async getHotWork() {
      let res = await noteApi.getHotNote();
      res = res.data;
      if (res.code == 200) {
        this.hotWork = res.data;
        console.log(this.hotWork);
      }
    },
  }
}
</script>

<style scoped>
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
#left {
  width: 750px;
  float: left;
}
.all_search {
  width: 725px;
  margin-top: 25px;
}
.all_search span {
  border: 1px solid #000;
  border-radius: 8px;
  padding: 6px 24px;
  display: inline-block;
  margin: 12px 12px;
  font: 12px Noto Sans,"思源黑体";
}
.B:hover{
    color:#84b92c ;
    border: 1px solid #84b92c;
}
.title{
  font-size: 20px;
  color: #333;
  font-weight: bold;
  margin-top: 40px;
  line-height: 20px;
}
h2 {
  display: block;
  font-size: 1.2em;
  margin-block-start: 0.83em;
  margin-block-end: 0.83em;
  margin-inline-start: 0px;
  margin-inline-end: 45px;
  font-weight: bold;
}
.A:hover{
  color: #84b92c;
}
.more {
  font-size: 13px;
  color: #256DC6;
  float: right;
  height: 20px;
  line-height: 20px;
  font-weight: normal;
}
.more img {
  height: 10px;
  vertical-align: middle;
  position: relative;
  top: -1px;
}
.material-list {
  width: 690px;
  height: 250px;
  background: #F1F7FA;
  margin-top: 20px;
  padding: 6px 3px 24px;
}
.br8 {
  border-radius: 8px;
}
ol, ul, li {
  list-style: none;
}
.zp-list{
  display: block;
  list-style-type: disc;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start:-38px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
}
.alist{
  display: block;
  list-style-type: disc;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start:-38px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
}
.material-list .item {
  margin: 20px 17px 0;
  width: 80px;
  height: 104px;
  float: left;
  text-align: center;
  overflow: hidden;
  font-size: 13px;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
}
.material-list .item {
  margin: 20px 17px 0;
  width: 80px;
  height: 104px;
  float: left;
  text-align: center;
  overflow: hidden;
  font-size: 13px;
}
.material-list .item img {
  width: 80px;
  height: 80px;
  margin-bottom: 5px;
  display: block;
}
.material-list .item a:hover{
  color: #84b92c;
}
.br4 {
  border-radius: 4px;
}
img {
  vertical-align: bottom;
}
a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
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
.hot-article {
  height: 112px;
  margin: 20px 0 30px;
}
.hot-article .cover {
  width: 200px;
  height: 112px;
  float: left;
  overflow: hidden;
}
.br8 {
  border-radius: 8px;
}
.hot-article .info {
  width: 478px;
  height: 112px;
  margin: 3px 0 0 12px;
  float: left;
}
element.style {
  max-height: 60px;
  overflow: hidden;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}
.hot-article .name {
  font-size: 16px;
  line-height: 30px;
  display: block;
  height: 60px;
}
.hot-article .sour-auth {
  margin-top: 25px;
  font-size: 13px;
  line-height: 13px;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.hot-article .source {
  margin-right: 55px;
}
.hot-article .sour-auth {
  margin-top: 25px;
  font-size: 13px;
  line-height: 13px;
}
.alist li {
  width: 320px;
  float: left;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
  font-size: 13px;
  line-height: 16px;
  margin: 10px 0;
}
strong {
  font-weight: bold;
}
.alist .ar {
  margin-left: 50px;
}
.zp-list {
  margin-top: 25px;
}

 .zp {
  display: inline-block;
  width: 125px;
  height: 125px;
  float: left;
  overflow: hidden;
}
 .zpinfo {
  float: left;
  width: 202px;
  height: 110px;
  margin-left: 6px;
   margin-right: 10px;
  font-size: 13px;
  color: #333;
  padding-top: 15px;
}
 .dishnum {
  margin-top: 23px;
}
 .dishnum span {
  color: #000;
  font-weight: bold;
}
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
</style>
