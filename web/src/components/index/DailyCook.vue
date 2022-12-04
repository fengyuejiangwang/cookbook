<template>
  <div >
    <h2 class="title">每日精选菜谱
      <a class="more" href="">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt=""></a>
    </h2>
    <ul class="recipe-list clearfix">
      <li class="item" v-for="(item, index) in 8" :key="item">
        <a class="cover br8" href="/cookbook/3227162.html" target="_blank">
          <img width="220" height="220" src="https://cp1.douguo.com/upload/caiku/2/a/0/220x220_2aa99f35b3f1a6135450f5cd2ac316d0.jpg" alt="酥皮大泡芙——自用多年零失败配方分享">
        </a>
        <div>
          <a class="name text-lips" target="_blank" href="/cookbook/3227162.html" >酥皮大泡芙——自用多年零失败配方分享
          </a>
          <p class="author text-lips">by
            <a class="text-lips" style="display: inline-block;max-width: 184px;vertical-align: middle; " target="_blank" href="/u/u86645476792551.html">累并-快乐
            </a>
          </p>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "DailyCook",
  data() {
    return {
      cookList: [{id:"ass",mainimage:"qqq",subtitle:"ass"},{id:"11",mainimage: "as"}],
    };
  },
}
</script>

<style scoped>
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
.more {
  font-size: 13px;
  color: #256DC6;
  float: right;
  height: 20px;
  line-height: 20px;
  font-weight: normal;
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
.clearfix {
  zoom: 1;
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
.recipe-list .item {
  width: 222px;
  height: 270px;
  float: left;
  display: inline-block;
  margin: 25px 40px 0 0;
}
.recipe-list .cover, .note-list .cover {
  width: 220px;
  height: 220px;
  display: block;
  overflow: hidden;
  position: relative;
}
.br8 {
  border-radius: 8px;
}
img {
  vertical-align: bottom;
}
img[Attributes Style] {
  width: 220px;
  aspect-ratio: auto 220 / 220;
  height: 220px;
}
.recipe-list .name {
  display: block;
  width: 220px;
  height: 35px;
  line-height: 35px;
  font-size: 15px;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.recipe-list .author {
  display: block;
  font-size: 12px;
  height: 16px;
  line-height: 13px;
  margin-top: 0px;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
</style>
