<template>
  <div id="right">
    <div style="width:280px;margin-top:40px;overflow-x: hidden;">
    </div>
    <!-- 达人 -->
    <h2 class="title">食为天达人<a class="more" href="/user/pro">更多 <img src="https://cp1.douguo.com/static/nweb/images//more2.png?1" alt=""></a></h2>
    <ul class="dr-list br8">
      <li class="clearfix" v-for="(o,index) in gourmetDaren">
        <router-link :to="'/user?id='+(o.id)" class="headicon left" >
          <img class="br5" :src="o.avatar" height="46" width="46" >
        </router-link>
        <div class="info">
          <div>
            <router-link to="'/user?id='+(o.id)" class="nickname text-lips"  target="_blank">{{o.username}}</router-link>
          </div>
          <p class="fans">{{o.followerCount}}粉丝</p>
        </div>
        <a class="gz" data-action="add" href="javascript:void(0)" @click="guanZhu()" v-if="0"><span class="addicon">＋</span> 关注</a>
        <a class="gz" data-action="add" href="javascript:void(0)" @click="guanZhu()" v-else><span class="addicon"></span> 已关注</a>
      </li>
    </ul>

    <!-- 商城精选 -->
    <h2 class="title">商城精选<a class="more" href="/mall?f=main">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt=""></a></h2>
    <ul class="mall-list br8">
      <li class="clearfix">
        <a class="left" href="/mall/item/40675" target="_blank">
          <img class="br5" src="https://cp1.douguo.com/upload/tuan/a/6/c/448_a6a6b2a8289bc205c7ed39e0dbab0dec.jpg" height="88" width="88" alt="圣迪乐村可生食鲜鸡蛋30枚">
        </a>
        <div class="info left">
          <a class="name text-clamp" href="/mall/item/40675" target="_blank">圣迪乐村可生食鲜鸡蛋30枚</a>
          <p class="price">￥69.80</p>
          <p class="count">月售2346</p>
        </div>
      </li>
    </ul>
    <!-- 食为天实验室 -->
    <h2 class="title">食为天实验室</h2>
    <ul class="test-list">
      <li><strong>·</strong><a href="/caipu/randRecipe"> 智能找菜</a></li>
      <li><strong>·</strong><a href="/ceshi/test"> 食为天测试题</a></li>
      <li><strong>·</strong><a href="http://web198.daix.cn:8779" target="_blank"> 药品</a></li>
    </ul>
  </div>
</template>

<script>
import userApi from "../../api/user";

export default {
  name: "Right",
  data(){
    return {
      gourmetDaren:[],
    };
  },
  created(){
    this.getGourmetDaren();
  },
  methods: {
    async getGourmetDaren() {
      let res = await userApi.getGourmetDaren();
      res = res.data;
      if (res.code == 200) {
        this.gourmetDaren = res.data;
      }
    },
  }
}
</script>

<style scoped>
#right {
  width: 280px;
  float: right;
  font: 12px Noto Sans,"思源黑体";
}
element.style {
  width: 280px;
  margin-top: 40px;
  overflow-x: hidden;
}
 .title {
  font-size: 20px;
  color: #333;
  font-weight: bold;
  margin-top: 40px;
  line-height: 20px;
}
h2 {
  display: block;
  font-size: 1.5em;
  margin-block-start: 0.83em;
  margin-block-end: 0.83em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
}
 .more {
  font-size: 13px;
  color: #256DC6;
  float: right;
  height: 20px;
  line-height: 20px;
  font-weight: normal;
}
ol, ul, li {
  list-style: none;
}
ul {
  display: block;
  list-style-type: disc;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: -38px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
}
a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
}
.more img {
  height: 10px;
  vertical-align: middle;
  position: relative;
  top: -1px;
}
.dr-list {
  margin-top: -10px;
  width: 280px;
  height: 355px;
  overflow: hidden;
}
.br8 {
  border-radius: 8px;
}
.dr-list li {
  margin-top: 20px;
  height: 46px;
}
.clearfix {
  zoom: 1;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
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
.dr-list .headicon {
  width: 46px;
  height: 46px;
  overflow: hidden;
}
.left {
  float: left;
}
.br5 {
  border-radius: 5px;
}
img {
  vertical-align: bottom;
}
.dr-list .info {
  margin-left: 6px;
  width: 130px;
  height: 100%;
  float: left;
}
.dr-list .nickname {
  display: inline-block;
  max-width: 120px;
  font-size: 15px;
  vertical-align: middle;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.dr-list .fans {
  font-size: 12px;
  color: #999;
  margin-top: 8px;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.dr-list .gz {
  float: right;
  color: #333;
  border: 1px solid #333;
  width: 73px;
  height: 30px;
  line-height: 28px;
  text-align: center;
  margin-top: 8px;
  border-radius: 4px;
}
.dr-list .addicon {
  font-size: 14px;
}
.mall-list {
  margin-top: -10px;
  width: 280px;
  height: 324px;
  overflow: hidden;
}
.mall-list li {
  margin-top: 20px;
  height: 88px;
}
.left {
  float: left;
}
.br5 {
  border-radius: 5px;
}
img[Attributes Style] {
  height: 88px;
  aspect-ratio: auto 88 / 88;
  width: 88px;
}
.mall-list .info {
  margin-left: 6px;
  width: 186px;
  height: 100%;
}
.mall-list .name {
  width: 100%;
  font-size: 15px;
  color: #333;
  line-height: 20px;
  height: 40px;
}
.text-clamp {
  word-break: break-all;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}
.mall-list .price {
  font-size: 16px;
  color: #FF4C44;
  margin-top: 4px;
}
.mall-list .count {
  font-size: 12px;
  color: #999;
  margin-top: -8px;
}
.dm-list {
  padding-top: 5px;
}
.test-list li, .dm-list li {
  margin-top: 20px;
  font-size: 13px;
  line-height: 13px;
  color: #333;
}
strong {
  font-weight: bold;
}

</style>
