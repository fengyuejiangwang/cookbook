<template>
  <div id="content" class="clearfix">
    <div class="person-info clearfix mt30">
      <router-link :to="'/user?id='+(user.id)" :style="'background:url('+user.avatar+') no-repeat center center;background-size:cover'" class="person-img left">

      </router-link>
      <div class="info left">
        <router-link class="nickname" :to="'/user?id='+(user.id)">{{user.username}}</router-link>
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
            <router-link to="/friends">
              <p class="count"> {{user.followeeCount}}  </p>
              <p class="text">关注</p>
            </router-link>
          </div>
          <div class="left">
            <router-link to="/fans">
              <p class="count"> {{user.followerCount}} </p>
              <p class="text">粉丝</p>
            </router-link>
          </div>
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/recipe">
              <p class="count"> {{user.cookCount}}  </p>
              <p class="text">菜谱</p>
            </a>
          </div>
          <div class="left">
            <a href="http://www.douguo.com/u/u67996224849052/dish">
              <p class="count"> {{user.noteCount}}  </p>
              <p class="text">笔记</p>
            </a>
          </div>
        </div>
      </div>
    </div>
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="概览" name="概览">
        <div v-if="user.cookCount>0||user.MenuCount>0||user.NoteCount>0">
        <div v-if="user.cookCount>0">
        <h3 class="mini-title">
        <router-link to="/cook">
          发布的菜谱 <span style="color: #999;
    font-weight: normal;">({{user.cookCount}})</span>
        </router-link>
      </h3>
        <el-row>
          <li class="left" v-for="(item,index) in cookList" key="item" style="list-style: none;margin-bottom: 0">
            <router-link class="cook-img relative" :to="'/cookdetail?id='+item.id">
              <img :src="item.cover" :alt="item.cookTitle">
            </router-link>
            <router-link class="cookname" :to="'/cookdetail?id='+item.id">{{item.cookTitle}}</router-link>
            <p><i class="read"></i>
              <span v-if="item.views<10000">{{item.views}}</span>
              <span v-else>{{(item.views/10000).toFixed(1)}}万</span>
              <i class="star"></i>
              <span v-if="item.collections<10000">{{item.collections}}</span>
              <span v-else>{{(item.collections/10000).toFixed(1)}}万</span></p>
          </li>
          </el-row>
        </div>
        <div v-if="user.MenuCount>0">
        <h3 class="mini-title">
          <router-link to="/cook">
            发布的菜单 <span style="color: #999;
    font-weight: normal;">(4)</span>
          </router-link>
        </h3>
        <ul class="menu-list clearfix">
          <li>
            <a href="/nccaidan/10592653.html?f=sjmy" target="_blank">
              <img src="https://cp1.douguo.com/upload/caiku/0/c/e/400x266_0c562b4f7c5509de7d353878db0d61de.jpg" alt="asd">
              <div class="des-menu">
                <p class="name text-lips">asd</p>
                <p class="rnum text-lips">2道菜谱</p>
              </div>
            </a>
          </li>
        </ul>
        </div>
        <div v-if="user.noteCount>0">
        <h3 class="mini-title">
          <router-link to="/cook">
            发布的笔记 <span style="color: #999;
    font-weight: normal;">({{user.noteCount}})</span>
          </router-link>
        </h3>
        <rol style="margin-right: 25px" v-for="(item,index) in noteList" :key="item">
          <div class="note-list">
            <div class="note">
              <router-link  :to="'/notedetail?id='+item.id" class="note-cover" style="display:inline-block;width:240px;height:250px">
                <img :src="item.picture1" alt="" height="250" >
              </router-link>
              <div class="note-info clearfix">
                <router-link  :to="'/notedetail?id='+item.id" class="note-name"  style="height: 40px">{{item.noteTitle}}</router-link>
                <span class="not-like right" data-like="not-like" onclick="setLike(31407977,this,'K0snn029WIBSivK9XB1n84BiPYLwX9uVfDZhIb8s')">{{item.likes}}</span>
              </div>
            </div>
          </div>
        </rol>
        </div>
        </div>
        <h3 class="not-menu" v-else>暂无数据～</h3>
      </el-tab-pane >
      <el-tab-pane label="菜谱" name="菜谱">
        <el-row v-if="user.cookCount>0">
            <li class="left" v-for="(item,index) in cookList" key="item" style="list-style: none;margin-bottom: 0">
              <router-link class="cook-img relative" :to="'/cookdetail?id='+item.id">
                <img :src="item.cover" :alt="item.cookTitle">
              </router-link>
              <router-link class="cookname" :to="'/cookdetail?id='+item.id">{{item.cookTitle}}</router-link>
              <p><i class="read"></i>
                <span v-if="item.views<10000">{{item.views}}</span>
                <span v-else>{{(item.views/10000).toFixed(1)}}万</span>
                <i class="star"></i>
                <span v-if="item.collections<10000">{{item.collections}}</span>
                <span v-else>{{(item.collections/10000).toFixed(1)}}万</span></p>
            </li>
      </el-row>
        <h3 class="not-menu" v-else>暂无菜谱～</h3>
      </el-tab-pane>
      <el-tab-pane label="菜单" name="菜单">
        <ul class="menu-list clearfix" v-if="user.menuCount>0">
          <li>
            <a href="/nccaidan/10592653.html?f=sjmy" target="_blank">
              <img src="https://cp1.douguo.com/upload/caiku/0/c/e/400x266_0c562b4f7c5509de7d353878db0d61de.jpg" alt="asd">
              <div class="des-menu">
                <p class="name text-lips">asd</p>
                <p class="rnum text-lips">2道菜谱</p>
              </div>
            </a>
          </li>
        </ul>
        <h3 class="not-menu" v-else>暂无菜单～</h3>
      </el-tab-pane>
      <el-tab-pane label="笔记" name="笔记">
        <rol v-if="user.noteCount>0" style="margin-right: 25px" v-for="(item,index) in noteList" :key="item">
          <div class="note-list">
            <div class="note">
              <router-link  :to="'/notedetail?id='+item.id" class="note-cover" style="display:inline-block;width:240px;height:250px">
                <img :src="item.picture1" alt="" height="250" >
              </router-link>
              <div class="note-info clearfix">
                <router-link  :to="'/notedetail?id='+item.id" class="note-name"  style="height: 40px">{{item.noteTitle}}</router-link>
                <span class="not-like right" data-like="not-like" onclick="setLike(31407977,this,'K0snn029WIBSivK9XB1n84BiPYLwX9uVfDZhIb8s')">{{item.likes}}</span>
              </div>
            </div>
          </div>
        </rol>
        <h3 class="not-menu" v-else>暂无笔记～</h3>
      </el-tab-pane>
      <el-tab-pane label="收藏" name="收藏"><div class="collect-type">
        <router-link to="/u/u67996224849052/collect" class="one active">收藏的菜谱</router-link> |
        <router-link to="/u/u67996224849052/collectd">收藏的菜单</router-link> |
        <router-link to="/u/u67996224849052/collectnote">收藏的笔记</router-link>
      </div><h3 class="not-menu">暂无菜单～</h3></el-tab-pane>
    </el-tabs>
    <p class="fcc" style="padding-top:60px;">
      你当前的位置：<a href="/" target="_blank">食为天美食</a> &gt; 个人中心
    </p>
  </div>
</template>

<script>
import cookApi from '../../api/cook'
import noteApi from '../../api/note'
export default {
  name: "User",
  data(){
    return{
      user:'',
      activeName:'概览',
      cookList:[],
      noteList:[],
      type:'概览',
    }
  },
  created() {
    this.user=JSON.parse(window.sessionStorage.getItem("user"));
    this.getCookListByUerId();
    this.getNoteListByUerId();
  },
  methods:{
    async getCookListByUerId(){
      let res=await cookApi.getCookListByUerId({
        userId:this.user.id
      });
      res=res.data;
      if(res.success){
        this.cookList=res.data;
      }
    },
    async getNoteListByUerId(){
      let res=await noteApi.getNoteListByUserId({
        userId:this.user.id
      });
      res=res.data;
      if(res.success){
        this.noteList=res.data;
      }
    },
    handleClick(tab){
      this.type = tab.name;
      if(this.type=="概览"){
        this.getCookListByUerId();
        this.getNoteListByUerId();
      }
      if(this.type=="菜谱"){ this.getCookListByUerId();}
      if(this.type=="菜单"){}
      if(this.type=="笔记"){this.getNoteListByUerId();}

    }
  }
}
</script>

<style scoped>
.des-menu .name {
  font-weight: bold;
  padding-top: 62px;
  font-size: 20px;
}

.des-menu p {
  width: 298px;
  font-size: 15px;
  color: #FFF;
  text-shadow: 0 1px 2px rgba(0,0,0,0.28);
  margin: 0 auto;
  padding-top: 10px;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.des-menu {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,.14);
  text-align: center;
}
.menu-list img {
  width: 100%;
}

img {
  vertical-align: bottom;
}
.menu-list li {
  width: 324px;
  height: 182px;
  border-radius: 8px;
  float: left;
  position: relative;
  margin-right: 14px;
  overflow: hidden;
  margin-bottom: 34px;
}
.note-list {
  display: inline-block;
  width: 240px;
  vertical-align: top;
}
.note-list .note {
  margin-bottom: 20px;
  position: relative;
}
element.style {
  display: inline-block;
  width: 240px;
  height: 319.875px;
}
.note-list .note-cover {
  background: #eee;
  border-top-right-radius: 8px;
  border-top-left-radius: 8px;
}
.note-list a {
  display: inline-block;
  vertical-align: top;
}
a {
  color: #333;
  text-decoration: none;
}
.note-list img {
  width: 240px;
  vertical-align: top;
  border-top-right-radius: 8px;
  border-top-left-radius: 8px;
}
.note-list .note-info {
  padding: 10px 10px 13px;
  border-bottom-right-radius: 8px;
  border-bottom-left-radius: 8px;
  box-shadow: 1px 1px 4px rgb(124 131 140 / 4%), 1px 1px 4px rgb(124 131 140 / 4%), -1px 1px 4px rgb(124 131 140 / 4%), -1px 1px 4px rgb(124 131 140 / 4%);
}
.note-list .note-name {
  display: block;
  max-height: 40px;
  font-size: 15px;
  line-height: 20px;
  text-overflow: ellipsis;
  overflow: hidden;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  margin-bottom: 10px;
}
.note-list .user-head img {
  width: 22px;
  height: 22px;
  border-radius: 100%;
}
.note-list .user-name {
  max-width: 120px;
  margin-left: 4px;
  font-size: 12px;
  line-height: 20px;
  vertical-align: middle;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.note-list .not-like {
  background:  url(../../assets/love.png) no-repeat left 1px;
  _background-image: none;
  background-size: 15px;

}

.note-list .like, .note-list .not-like {
  -webkit-touch-callout: none;
  -webkit-tap-highlight-color: transparent;
  -webkit-user-select: none;
  padding-left: 19px;
  font-size: 12px;
  cursor: pointer;
  background-size: 15px;
  display: inline-block;
  height: 15px;
  position: absolute;
  right: 10px;
  bottom: 16px;
}
.right {
  float: right;
}
.note-list.ml13 {
  margin-left: 13px;
}
.note-list.ml14 {
  margin-left: 14px;
}
.clearfix {
  zoom: 1;
}
li {
  position: relative;
  width: 319px;
  margin-right: 14px;
  margin-bottom: 34px;
}
.cook-img {
  display: inline-block;
  width: 324px;
  height: 182px;
  border-radius: 8px;
  overflow: hidden;
}
a {
  color: #333;
  text-decoration: none;
}
.cook-img img {
  display: block;
  width: 100%;
}
 .cookname {
  display: block;
  font-size: 15px;
  height: 35px;
  line-height: 35px;
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
}
.cook-list p {
  font-size: 12px;
  height: 12px;
  line-height: 12px;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.read {
  vertical-align: middle;
  display: inline-block;
  width: 17px;
  height: 12px;
  background: url(https://cp1.douguo.com/static/static/nweb/images/view.png?4) no-repeat;
  background-size: 100%;
  position: relative;
  top: -1px;
}
.star {
  vertical-align: middle;
  display: inline-block;
  width: 14px;
  height: 13px;
  margin-left: 10px;
  background: url(https://cp1.douguo.com/static/static/nweb/images/favorite.png?4) no-repeat;
  background-size: 100%;
  position: relative;
  top: -1px;
}
.cook-list .cookname {
  display: block;
  font-size: 15px;
  height: 35px;
  line-height: 35px;
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
}
a {
  color: #333;
  text-decoration: none;
}
.mini-title {
  margin: 20px 0 18px;
  font-size: 18px;
  line-height: 22px;
  font-weight: bold;
}
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
