<template>
  <div >
    <h2 class="title">每日精选菜谱
      <router-link to="/cook" class="more" >更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt="" style="
   height: 10px;
   vertical-align: middle;
   position: relative;
   top: -2px;"></router-link>
    </h2>
    <ul class="recipe-list clearfix" style="margin-top: 0px">
      <li class="item" v-for="(val,key, index) in dailyHotCook" >
        <router-link :to="'/cookdetail?id='+(val.id)" class="cover br8">
          <img width="220" height="220" :src="val.cover" :alt="val.cookTitle" >
        </router-link>
        <div>
          <router-link :to="'/cookdetail?id='+(val.id)" class="name text-lips">{{val.description}}
          </router-link >
          <p class="author text-lips">by
            <router-link :to="'/user?+id='+(val.userId)" class="text-lips" style="display: inline-block;max-width: 184px;vertical-align: middle; ">{{key}}
            </router-link>
          </p>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
import cookApi from "../../api/cook"
export default {
  name: "DailyCook",
  data() {
    return {
      dailyHotCook:'',
    };
  },
  created(){
    this.getDailyHotCook();
  },
  methods:{
    async getDailyHotCook(){
        let res = await cookApi.getDailyHotCook();
        res=res.data;
        if(res.code==200) {
          this.dailyHotCook = res.data;
        }
    }
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
.title{
  font-size: 20px;
  color: #333;
  font-weight: bold;
  margin-top: 40px;
  line-height: 20px;
  margin-bottom: 0px;
  margin-right: 0px;
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
  margin-right:45px;
}
a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
}
a:hover{
  color: #84b92c;
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
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
  padding: 0;
  margin-bottom: 0;
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
