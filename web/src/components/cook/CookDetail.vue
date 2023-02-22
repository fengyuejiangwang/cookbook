<template>
  <div style=" width: 1000px;
  margin: 0 auto;margin-top: 30px">
 <div id="left">
  <div class="relative">
    <div id="banner" class="cboxElement cboxElement1">
        <el-image
          style="
           max-width: 720px;
           max-height: 600px;"
          :src="cook.cover"
          :preview-src-list="srcList">
        </el-image>
      <router-link  v-if="cook.video" to="/"  style="display:inline-block;position: absolute;bottom: 169px;right: 319px;width: 52px;
                ;cursor: pointer; z-index: 3">
        <img style="width:52px;display:block;" src="https://cp1.douguo.com/static/nweb/images/video_icon.png">
      </router-link>
    </div>
  </div>
   <div class="rinfo relative" style="width: 700px">
     <h1 class="title text-lips" style="display: inline-block;margin-top: 0px">{{cook.cookTitle}}</h1>
     <div class="boutiExclu">
       <span class="bouti">精品</span>
     </div>
     <div class="vcnum relative">
       <span>{{cook.views}}</span> 浏览
       <span class="collectnum">{{cook.collections}}</span>收藏 <div class="absolute operate">
       <a class="btn-collect" href="javascript:void(0);" >收藏</a>
     </div>
     </div>
     <div class="clearfix aut-info relative">
       <div class="clearfix left">
         <router-link to="" class="author-img left" href="/u/u02369349224948.html" >
           <img class="br50" :src="author.avatar"  width="30" height="30">
         </router-link>
         <div class="author-info left">
           <router-link to="" class="nickname text-lips">{{author.username}}</router-link>

         </div>
         <a class="gz" data-action="add" href="javascript:void(0)" onclick=" guanzhu(this,'4568726','e5qJHEJaq89k9GVj1ejFRjw1VOUI98BZObSDCp2M',0)  "><span class="addicon">＋</span> 关注</a>
       </div>
     </div>
     <p class="intro">
       {{cook.description}}
     </p>
     <!-- 个人中心可编辑 -->
   </div>
   <el-row class="metarial">
     <h2 class="mini-title">{{cook.cookTitle}}用料</h2>
     <table width="690" border="0" cellspacing="0" cellpadding="0" class="retamr br8 table">
       <tbody><tr v-for="count in parseInt(((materials.length+1)/2))">
         <td class="lirre" style="border-top:0;">
           <span class="scname" v-if="materials[2*count-2].foodId!=''"><router-link to="">{{materials[2*count-2].foodName}}</router-link></span>
           <span class="scname" v-else>{{materials[2*count-2].foodName}}</span>
           <span class="right scnum">{{materials[2*count-2].consumption}}</span>
         </td>
         <td style="border-top:0;" v-if="2*count-1<=materials.length-1">
           <span class="scname" v-if="materials[2*count-1].foodId!=''"><router-link to="" target="_blank">{{materials[2*count-1].foodName}}</router-link></span>
           <span class="scname" v-else>{{materials[2*count-1].foodName}}</span>
           <span class="right scnum">{{materials[2*count-1].consumption}}</span>
         </td>
         <td style="border-top:0;" v-else>
           <span class="scname"></span>
           <span class="right scnum"></span>
         </td>
       </tr>
       </tbody></table>
   </el-row>

   <el-row style="display: flex;flex-direction: column" >
     <h2 class="mini-title">{{cook.cookTitle}}的做法</h2>
     <div class="stepcont clearfix" v-for="(o, index) in steps"  :key="o">
       <router-link to="">
       <el-image
          style="width: 200px;
          height: 200px;"
         :src="o.picture"
         :preview-src-list="srcList"
          fit="cover">
       </el-image>
       </router-link>
       <div class="stepinfo">
         <p>步骤{{index+1}}</p>
         {{o.description}}
       </div>
     </div>
   </el-row>

   <div class="tips">
     <h2 class="mini-title" style="margin-top: 0px">{{cook.cookTitle}}的烹饪技巧</h2>
     <p><br>{{cook.skill}}</p>
   </div>
   <p class="creattime"><span id="creattime">创建时间 : {{cook.createTime}}</span> </p>
   <div class="fenlei">
     分类：
     <span><a href="/caipu/咸鲜" target="_blank">咸鲜</a></span>
     <span><a href="/caipu/咸" target="_blank">咸</a></span>
     <span><a href="/caipu/煎" target="_blank">煎</a></span>
     <span><a href="/caipu/煮" target="_blank">煮</a></span>
     <span><a href="/caipu/鲁菜" target="_blank">鲁菜</a></span>
   </div>
   <div >
     <h2 class="title">{{cook.cookTitle}}的其他做法
       <a class="more" href="">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt=""></a>
     </h2>
     <ul class="recipe-list clearfix">
       <li class="item" v-for="(item, index) in 9" :key="item">
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
   <el-row id="comment" class="comment" style="width: 690px">
     <div id="comment-text"><h2 class="mini-title">评论</h2><div class="in-comment clearfix"><div class="author-img"><img class="br50" width="30" height="30" src="https://tx1.douguo.com/upload/photo/1/1/1/70_004976861ec13b4af62b1d8db8c5c9f7.png" alt="夸张的羊肚菌很慢悠悠"> </div><textarea class="comm-txt left" id="commentContent"></textarea><a href="javascript:;"  class="comm-btn">发表评论</a></div></div>
     <ul id="comments">
       <li class="clearfix" onclick="comments.addReply('角落里的鲅鱼很爱潜水', 'u04567164764971', '26090964', '8987052',0)">
       <a class="author-img" href="/u/u04567164764971.html" target_="blank">
         <img src="https://cp1.douguo.com/upload/photo/1/1/1/70_5ef4441f687d47f348f17b4b7a982c15.png" alt="角落里的鲅鱼很爱潜水">
       </a>
       <div class="author-comment">
         <a class="nickname" href="/u/u04567164764971.html" target_="blank">角落里的鲅鱼很爱潜水</a>
         <p class="commtxt">@<a href="/u/u4747700070718.html">Nauyux</a> 看着应该很好看？可以研究一下把味道做好吃点👍🌹🌹🌹🌹🌹💯</p>
         <p class="time">1天前 甘肃省</p>
         <a class="reply-btn" href="javascript:;" onclick="comments.addReply('角落里的鲅鱼很爱潜水', 'u04567164764971', '26090964', '8987052',0)">回复</a>
       </div>

     </li>
       <li class="clearfix" onclick="comments.addReply('2018滨州移动互联网交流论坛', 'u40382253669607', '22835525', '8986482',0)">
       <a class="author-img" href="/u/u40382253669607.html" target_="blank">
         <img src="https://i1.douguo.com/static/img/70.jpg" alt="2018滨州移动互联网交流论坛">
       </a>
       <div class="author-comment">
         <a class="nickname" href="/u/u40382253669607.html" target_="blank">2018滨州移动互联网交流论坛</a>
         <p class="commtxt">把土豆切出8个角的形状</p>
         <p class="time">4天前 山东</p>
         <a class="reply-btn" href="javascript:;" onclick="comments.addReply('2018滨州移动互联网交流论坛', 'u40382253669607', '22835525', '8986482',0)">回复</a>
       </div>
     </li>
       <li class="clearfix" onclick="comments.addReply('贝丫头_', 'u42913552927627', '11421291', '8985544',0)">
       <a class="author-img" href="/u/u42913552927627.html" target_="blank">
         <img src="https://cp1.douguo.com/upload/photo/d/1/f/70_u42913552927627182345.jpg" alt="贝丫头_">
       </a>
       <div class="author-comment">
         <a class="nickname" href="/u/u42913552927627.html" target_="blank">贝丫头_</a>
         <p class="commtxt">@<a href="/u/u42639680732842.html">颖子菇凉</a> 也可以。我没放也味道不错</p>
         <p class="time">7天前 山西</p>
         <a class="reply-btn" href="javascript:;" >回复</a>
       </div>
     </li>
     </ul>
   </el-row>
   <div class="readMore" style="display: block;">查看更多评论</div>
</div>
  </div>
</template>

<script>

import cookApi from "../../api/cook";
import stepApi from "../../api/step";
export default {
  name: "CookDetail",
  data(){
    return{
      id:'',
      cook:'',
      author:'',
      materials:[],
      steps:[],
      srcList:[],
      imgStyle:{
        maxWidth:'720px',
        maxHeight:'600px'
      }
    };
  },
  created(){
    this.id=this.$route.query.id;
    this.getCookDetail();
    this.getAuthorInfo();
    this.getMaterialInfo();
    this.getStepInfo();
  },
  methods: {
    async getCookDetail() {
      let res = await cookApi.getCookDetail({id:this.id});
      res = res.data;
      if (res.code == 200) {
        this.cook = res.data;
        this.srcList.push(this.cook.cover);
      }
    },
    async getAuthorInfo() {
      let res = await cookApi.getAuthorInfo({id:this.id});
      res = res.data;
      if (res.code == 200) {
        this.author = res.data;
      }
    },
    async getMaterialInfo() {
      let res = await cookApi.getMaterialInfo({id:this.id});
      res = res.data;
      if (res.code == 200) {
        this.materials = res.data;
      }
    },
    async getStepInfo() {
      let res = await stepApi.getStepInfo({id:this.id});
      res = res.data;
      if (res.code == 200) {
        this.steps = res.data;
        for(let i=0;i<this.steps.length;i++)
          this.srcList.push(this.steps[i].picture);
      }
    },
  }
}
</script>

<style scoped>
body{
  background: #fff;
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  padding-top: 60px;
}
#banner{
  display: block;
  width: 690px;
  height: 390px;
  overflow: hidden;
  border-radius: 8px;
}

.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.rinfo {
  margin-top: 20px;
  padding: 9px 0 40px;
}

.rinfo .title {
  font-size: 22px;
  color: #333;
  font-weight: bold;
  line-height: 24px;
}
.title {
  font-size: 20px;
  line-height: 20px;
  font-weight: bold;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
h1, h2, h3, h4, h5, h6 {
  font-weight: normal;
}
h1 {
  display: block;
  font-size: 2em;
  margin-block-start: 0.67em;
  margin-block-end: 0.67em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
}
.boutiExclu {
  margin-top: 10px;
  font-size: 0;
}
.boutiExclu span {
  display: inline-block;
  margin-right: 16px;
  font-size: 14px;
  color: #fff;
  text-align: center;
  width: 42px;
  box-sizing: border-box;
  height: 22px;
  line-height: 22px;
  border-radius: 2px;
}
.bouti {
  background: #FFB31A;
}
.vcnum {
  font-size: 13px;
  color: #333;
  margin-top: 20px;
}
.vcnum span {
  font-size: 24px;
  color: #FFB31A;
  position: relative;
  top: 2px;
}
.vcnum .collectnum {
  margin-left: 40px;
}
.operate {
  right: 0;
  display: inline-block;
  top: -3px;
}
.operate .btn-collect {
  display: inline-block;
  width: 80px;
  height: 34px;
  border-radius: 4px;
  color: #fff;
  border: 1px solid #FFB31A;
  font-size: 15px;
  text-align: center;
  text-decoration: none;
  line-height: 32px;
  background: #FFB31A url(../../assets/like.png) no-repeat 10px 6px;
  background-size: 20px 20px;
  padding-left: 20px;
  margin-left: 320px;
}
.rinfo .aut-info {
  font-size: 16px;
  color: #666;
  margin: 25px 0;
}
.rinfo .author-info {
  font-size: 16px;
  color: #666;
  margin-left: 6px;
  position: relative;
  margin-right: 20px;
}

.br50 {
  border-radius: 50%;
}

img {
  vertical-align: bottom;
}
.rinfo .nickname {
   font-size: 13px;
   color: #333;
   display: inline-block;
   line-height: 30px;
   vertical-align: middle;
 }
.left {
  float: left;
}
.rinfo .gz {
  float: left;
  height: 30px;
  width: 73px;
  line-height: 28px;
  text-align: center;
  color: #333;
  border: 1px solid #333;
  border-radius: 4px;
  font-size: 12px;

}
.rinfo .gz {
  float: left;
  height: 30px;
  width: 73px;
  line-height: 28px;
  text-align: center;
  color: #333;
  border: 1px solid #333;
  border-radius: 4px;
  font-size: 12px;
}
a {
  color: #333;
  text-decoration: none;
}
.rinfo .intro {
  font-size: 15px;
  color: #333;
  line-height: 27px;
}
.metarial {
  padding-bottom: 40px;
}
.metarial table {
  margin-left: 1px;
  color: #999;
  border-collapse: collapse;
  border-spacing: 0;
  overflow: hidden;
}

.br8 {
  border-radius: 8px;
}
.metarial tr {
  background: #F1F7FA;
  color: #333;
}
.metarial .lirre {
  width: 343px;
  border-right: 1px solid #e5e5e5;
}
.metarial .scnum {
  display: inline-block;
  max-width: 90px;
  text-align: right;
  padding-left: 0;
}

.metarial td {
  border-top: 1px solid #e5e5e5;
  padding: 16px 0;
  width: 344px;
}
.metarial .scname {
  display: inline-block;
  width: 254px;
  padding-right: 5px;
}

.metarial span {
  padding: 0 18px;
  font-size: 15px;
}

.metarial a {
  color: #12937c;
  text-decoration: none;
  font-size: 15px;
}
.right {
  float: right;
}
.mini-title {
  font-size: 18px;
  color: #333;
  line-height: 18px;
  font-weight: bold;
  margin: 30px 0 20px;
}
.stepcont {
 margin-bottom: 40px;
}
.stepcont a {
   float: left;
 }
.stepcont .stepinfo {
  float: left;
  padding: 0;
  width: 300px;
  height: 200px;
  word-wrap: break-word;
  margin-left: 10px;
  font-size: 15px;
  color: #333;
  line-height: 27px;
  overflow: hidden;
}
.stepcont .stepinfo p {
  font-weight: bold;
}
.tips {
  padding-bottom: 40px;

}
.tips p {
  font-size: 15px;
  color: #333;
  line-height: 27px;
}
#left {
  width: 700px;
 float: left;
}
.creattime {
  font-size: 12px;
  color: #999;
}
.creattime {
  font-size: 12px;
  color: #999;
}
.fenlei {
  font-size: 15px;
  font-weight: bold;
  line-height: 34px;
  margin-top: 25px;
}
.fenlei span {
  font-size: 13px;
  height: 34px;
  line-height: 32px;
  padding: 0 16px;
  border: 1px solid #333;
  border-radius: 4px;
  display: inline-block;
  margin-right: 4px;
  font-weight: normal;
}
#comment .in-comment {
  padding-bottom: 20px;
  position: relative;
}

#comment .in-comment .author-img {
  width: 30px;
  height: 30px;
  margin-right: 12px;
  overflow: hidden;
}

#comment .author-img, .author-comment {
  float: left;
}
#comment .in-comment .comm-txt {
  width: 648px;
  height: 112px;
  resize: none;
  padding: 12px;
  border: 1px solid #E5E3DF;
  border-radius: 4px;
}
.readMore {
  color: #256DC6;
  font-weight: 500;
  line-height: 33px;
  font-size: 15px;
  text-align: center;
  margin-top: -15px;
  display: none;
  cursor: pointer;
}
.left {
  float: left;
}
input, textarea, select, button {
  font: 12px Noto Sans,"思源黑体";
  outline: 0;
}
#comment .in-comment > .comm-btn {
  float: right;
  color: #FFB31A;
  right: 0;
  margin-top: 10px;
  display: inline-block;
  border-radius: 4px;
  height: 34px;
  width: 104px;
  text-align: center;
  line-height: 34px;
  font-size: 15px;
  border: 1px solid #FFB31A;
}
#comments {
  padding-bottom: 30px;
}
#comments li {
  padding: 20px 0;
  border-bottom: 1px solid #E5E3DF;
  position: relative;
}
ol, ul, li {
  list-style: none;
}
* {
  box-sizing: border-box;
}
.br50 {
  border-radius: 50%;
}
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
#comments .author-img img {
  width: 30px;
  height: 30px;
  border-radius: 50%;
}
#comments .author-comment .commtxt {
  font-size: 15px;
  color: #333;
  margin-top: 6px;
  line-height: 24px;
}
.nickname {
  display: inline-block;
  vertical-align: middle;
}
#comments .author-comment .time {
  font-size: 13px;
  color: #999;
  margin-top: 14px;
}
#comments .author-comment .reply-btn {
  display: inline-block;
  position: absolute;
  bottom: 20px;
  right: 0;
  color: #256DC6;
  font-size: 13px;
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
.more {
  font-size: 13px;
  color: #256DC6;
  float: right;
  height: 20px;
  line-height: 20px;
  font-weight: normal;
  margin-right: -30px;
}
.more img{
  vertical-align: middle;
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
  margin: 25px 10px 0 0;
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
</style>
