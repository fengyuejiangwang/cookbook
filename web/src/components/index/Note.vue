<template>
  <div>
    <h2 class="title">笔记
      <router-link to="/note" class="more"  style="text-decoration: none;color: #333;">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt="">
      </router-link>
    </h2>
    <ul class="note-list clearfix" style="  margin-top: 20px;">
      <el-row>
      <el-col  v-for="(val,key,index) in hotNote"  :span="6">
        <el-card v-for="(val2,key2,index) in val" :body-style="{ padding: '0px' }"style="border-radius: 10px;width: 220px;height: 290px">
          <router-link :to="'/notedetail?id='+(val2.id)"><img :src="val2.picture1" class="image"></router-link>
            <div class="info">
              <router-link :to="'/notedetail?id='+(val2.id)" class="name text-lips"  style="  color: #333;
  text-decoration: none;">{{val2.noteTitle}}</router-link>
              <router-link :to="'/user?id='+(val2.userId)" class="author" href="/u/u5708454643.html" style="  color: #333;
  text-decoration: none;">
                <img class="headicon br50" :src="key2" >
                <span style="" class="nickname text-lips">{{key}}</span>
              </router-link>
            </div>
        </el-card>
      </el-col>
      </el-row>
    </ul>
  </div>
</template>

<script>
import noteApi from "../../api/note";

export default {
  name: "Note",
  data(){
    return {
      hotNote:'',
    };
  },
  created(){
    this.getHotNote();
  },
  methods: {
    async getHotNote() {
      let res = await noteApi.getHotNote();
      res = res.data;
      if (res.code == 200) {
        this.hotNote = res.data;
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

a:-webkit-any-link {
  color: -webkit-link;
  cursor: pointer;
  text-decoration: underline;
}
.more img {
  height: 10px;
  vertical-align: middle;
  position: relative;
  top: -1px;
}
.info {
  padding: 0 10px;
  height: 80px;
  overflow: hidden;
  border-bottom-right-radius: 8px;
  border-bottom-left-radius: 8px;
  box-shadow: 1px 1px 4px rgb(124 131 140 / 4%), 1px 1px 4px rgb(124 131 140 / 4%), -1px 1px 4px rgb(124 131 140 / 4%), -1px 1px 4px rgb(124 131 140 / 4%);
}
 .name {
  display: block;
  width: 100%;
  line-height: 35px;
  font-size: 15px;
  height: 35px;
  overflow: hidden;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
a {
  color: #333;
  text-decoration: none;
}
a:-webkit-any-link {
  color: -webkit-link;
  cursor: pointer;
  text-decoration: underline;
}
.author {
  display: inline-block;
  font-size: 12px;
  height: 22px;
  line-height: 22px;
}
.headicon {
  display: inline-block;
  width: 22px;
  height: 22px;
  vertical-align: middle;
}
.br50 {
  border-radius: 50%;
}
.nickname {
  display: inline-block;
  vertical-align: middle;
}
.image {
  width: 220px;
  height: 220px;
  display: block;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both
}
</style>
