<template>
  <div>
    <h2 class="title">笔记
      <a class="more" href="" style="text-decoration: none;color: #333;">更多 <img src="https://cp1.douguo.com/static/nweb/images/more2.png?1" alt="">
      </a>
    </h2>
    <ul class="note-list clearfix" style="margin-left: -40px">
      <el-row>
      <el-col  v-for="(o, index) in 4" :key="o" :span="6">
        <el-card :body-style="{ padding: '0px' }"style="border-radius: 10px;width: 220px;height: 290px">
          <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image">
            <div class="info">
              <a class="name text-lips" href="/dish/31402261" target="_blank" style="  color: #333;
  text-decoration: none;">寒潮来袭，在这嘎嘎冷的天气，吃点什么能驱寒呢？</a>
              <a class="author" href="/u/u5708454643.html" target="_blank"style="  color: #333;
  text-decoration: none;">
                <img class="headicon br50" src="https://tx1.douguo.com/upload/photo/0/6/6/70_u5708454643181933.jpg" alt="小豆儿的健康笔记">
                <span style="" class="nickname text-lips">小豆儿的健康笔记</span>
              </a>
            </div>
        </el-card>
      </el-col>
      </el-row>
    </ul>
  </div>
</template>

<script>
export default {
  name: "DailyNote"
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
