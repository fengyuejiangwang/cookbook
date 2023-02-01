<template>
  <div id="content" class="clearfix">
    <div class="person-info clearfix mt30">
      <a href="/u/u67996224849052.html" style="background: url(https://tx1.douguo.com/upload/photo/1/1/1/140_7171e40c70b2052bbf0a72a187633c6a.png) no-repeat center center;background-size:cover;" class="person-img left">

      </a>
      <div class="info left">
        <a class="nickname" href="/u/u67996224849052.html">不喜欢豆类很欢欢乐乐</a>
        <p class="sex"><i class="male"></i> </p>
        <p class="relative point">经验值：35
        </p>
        <p class="relative point"> IP属地:
          · 江西

        </p>
        <p class="intro">
          <span></span>
        </p>
      </div>
      <div class="right">
        <div class="fav-fans">
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/friends">
              <p class="count"> 0  </p>
              <p class="text">关注</p>
            </a>
          </div>
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/fans">
              <p class="count"> 0 </p>
              <p class="text">粉丝</p>
            </a>
          </div>
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/recipe">
              <p class="count"> 0  </p>
              <p class="text">菜谱</p>
            </a>
          </div>
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/dish">
              <p class="count"> 0  </p>
              <p class="text">笔记</p>
            </a>
          </div>
        </div>
      </div>
    </div>
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="概览" name="first"><h3 class="not-menu">暂无数据～</h3></el-tab-pane>
      <el-tab-pane label="菜谱" name="second"><h3 class="not-menu">暂无菜谱～</h3></el-tab-pane>
      <el-tab-pane label="菜单" name="third"><h3 class="not-menu">暂无菜单～</h3></el-tab-pane>
      <el-tab-pane label="笔记" name="fourth"><h3 class="not-menu">暂无笔记～</h3></el-tab-pane>
      <el-tab-pane label="收藏" name="fifth"><div class="collect-type">
        <a href="/u/u67996224849052/collect" class="one active">收藏的菜谱</a> |
        <a href="/u/u67996224849052/collectd">收藏的菜单</a> |
        <a href="/u/u67996224849052/collectnote">收藏的笔记</a>
      </div><h3 class="not-menu">暂无收藏～</h3></el-tab-pane>
    </el-tabs>
    <p class="fcc" style="padding-top:60px;">
      你当前的位置：<a href="/" target="_blank">豆果美食</a> &gt; 个人中心
    </p>
  </div>
</template>

<script>
export default {
  name: "User"
}
</script>

<style scoped>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
body {
  background: #fff;
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  padding-top: 60px;
}
#content {
  width: 1000px;
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
.person-info {
  margin: 40px 0 20px;
  padding-bottom: 40px;
}
.person-info .person-img {
  display: inline-block;
  width: 120px;
  height: 120px;
  margin-right: 12px;
  border-radius: 50%;
  overflow: hidden;
}
.left {
  float: left;
}
.fav-fans .count {
  font-size: 15px;
  line-height: 15px;
}

a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
}
.person-info .info {
  width: 480px;
  position: relative;
}
.person-info .info .nickname {
  display: inline-block;
  max-width: 296px;
  margin-top: 9px;
  font-size: 20px;
  line-height: 24px;
  font-weight: bold;
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
  vertical-align: middle;
}
a {
  color: #333;
  text-decoration: none;
}
.person-info .info .sex {
  margin-top: 8px;
}
.person-info .info p {
  margin-top: 11px;
  font-size: 12px;
  line-height: 16px;
  color: #666;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-size: 10px;
}
.person-info i {
  display: inline-block;
  width: 16px;
  height: 18px;
  margin-right: 3px;
  vertical-align: sub;
}
.male {
  background: url(https://cp1.douguo.com/static/nweb/images/male.png) no-repeat;
  background-size: 100% 100%;
}
.person-info .info .point {
  overflow: visible;
}
.relative {
  position: relative;
}
.right {
  float: right;
}
.person-info .fav-fans {
  width: 320px;
  height: 62px;
  padding: 15px 0;
  border-radius: 4px;
  background: #F1F7FA;
  text-align: center;
}
.person-info .fav-fans > div {
  width: 80px;
  border-right: 1px solid #D1DFE6;
}
.person-info .fav-fans > div:last-child {
  border-right: 0;
}
.fav-fans .count {
  font-size: 15px;
  line-height: 15px;
  margin: 0;
}
.fav-fans .text {
  margin-top: 4px;
  margin-bottom: 0;
}
.not-menu {
  width: 1000px;
  margin: 80px 0 330px;
  font-size: 13px;
  text-align: center;
}
h1, h2, h3, h4, h5, h6 {
  font-weight: normal;
}
.type-head {
  margin-bottom: 34px;
}
.type-head {
  font-size: 14px;
  text-align: center;
  width: auto;
  margin: 0 auto;
  display: inline-block;
}
.type-head a.active {
  border-bottom: 2px solid #383830;
  font-weight: bold;
  color: #383830;
}

.type-head a {
  display: inline-block;
  float: left;
  color: #383830;
  height: 42px;
  line-height: 42px;
  margin-right: 30px;
}
.collect-type {
  line-height: 14px;
  margin-bottom: 25px;
  font-size: 14px;
  color: #999;
  margin-top: 25px;
}
.collect-type .one {
   padding-left: 0;
 }
.collect-type a {
  font-size: 14px;
  color: #999;
  padding: 0 10px;
}
.collect-type .active {
  color: #333;
  font-weight: bold;
}
</style>
