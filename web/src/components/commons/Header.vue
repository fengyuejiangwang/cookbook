<template>
  <div id="header" class="">
    <div class="header clearfix">
      <a class="logo left" href="/"><img src="../../assets/logo.png" alt=""></a>
      <ul class="nav" >
        <li class="act"><a href="/index">首页</a></li>
        <li class="relative"><a href="/coookbook">菜谱 <span class="naww"></span></a></li>
        <li class="relative"><a href="/health">饮食健康<span class="naww"></span></a></li>
        <li class="relative"><a href="/note">笔记</a></li>
        <li class="relative"><a href="/mall">商城</a></li>
      </ul>
      <div class="search br4 left">
      <el-autocomplete
        v-model="state"
        :fetch-suggestions="querySearchAsync"
        placeholder="请输入内容"
        @select="handleSelect"
        size="small"></el-autocomplete>
      <el-button icon="el-icon-search"  size="small"style="border-left: none;margin-left: -5px;border-bottom-left-radius:0px;
  border-top-left-radius:0px;"></el-button>
      <el-button style="background-color: #84b92c;color: white;" size="small" >发布</el-button>
      </div>
      <div class="myinfo relative">
      <el-dropdown style="margin-top: 10px;">
        <span class="el-dropdown-link">
          <el-avatar :size="40" :src="circleUrl">  </el-avatar>
        </span>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item>黄金糕</el-dropdown-item>
        <el-dropdown-item>狮子头</el-dropdown-item>
        <el-dropdown-item>螺蛳粉</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
      </div>
   </div>
  </div>
</template>

<script>
export default {
  name: "Header",
  data(){
    return {
      index:'act',
      options: [{
        value: '选项1',
        label: '黄金糕'
      }, {
        value: '选项2',
        label: '双皮奶'
      }, {
        value: '选项3',
        label: '蚵仔煎'
      }, {
        value: '选项4',
        label: '龙须面'
      }, {
        value: '选项5',
        label: '北京烤鸭'
      }],
      value: '',
      circleUrl:"https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
      restaurants: [],
      state: '',
      timeout:  null,
    }
  },
  methods: {
    loadAll() {
      return [
        { "value": "三全鲜食（北新泾店）", "address": "长宁区新渔路144号" },
        { "value": "Hot honey 首尔炸鸡（仙霞路）", "address": "上海市长宁区淞虹路661号" },
        { "value": "新旺角茶餐厅", "address": "上海市普陀区真北路988号创邑金沙谷6号楼113" },
        { "value": "泷千家(天山西路店)", "address": "天山西路438号" },
        { "value": "胖仙女纸杯蛋糕（上海凌空店）", "address": "上海市长宁区金钟路968号1幢18号楼一层商铺18-101" },
        { "value": "贡茶", "address": "上海市长宁区金钟路633号" },
      ];
    },
    querySearchAsync(queryString, cb) {
      var restaurants = this.restaurants;
      var results = queryString ? restaurants.filter(this.createStateFilter(queryString)) : restaurants;

      clearTimeout(this.timeout);
      this.timeout = setTimeout(() => {
        cb(results);
      }, 3000 * Math.random());
    },
    createStateFilter(queryString) {
      return (state) => {
        return (state.value.toLowerCase().indexOf(queryString.toLowerCase()) === 0);
      };
    },
    handleSelect(item) {
      console.log(item);
    }
  },
  mounted() {
    this.restaurants = this.loadAll();
  }
}
</script>

<style scoped>
#header {
  box-shadow: 0 2px 4px 0 rgb(0 0 0 / 8%);
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 99;
  background: #fff;
}
.header {
  width: 1000px;
  height: 60px;
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
 .logo {
  height: 50px;
  margin-top:6px;
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
  height: 50px;
}
img {
  vertical-align: bottom;
}
 .nav {
  float: left;
  margin-left: 20px;
  display: inline-block;
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
}
.nav li {
  float: left;
  height: 30px;
  line-height: 30px;
  font-size: 15px;
  color: #333;
  padding: 0 12px;
}
 .nav li>a {
  display: block;
  width: auto;
  height: 30px;
  line-height: 30px;
  color: #000;
  letter-spacing: 1px;
}
 .nav li.act {
  border-radius: 8px 8px 0 0;
}
 .nav li {
  float: left;
  height: 30px;
  line-height: 30px;
  font-size: 15px;
  color: #333;
  padding: 0 12px;
}
.relative {
  position: relative;
}
.nav li.act>a {
  color: #84b92c;
  font-weight: bold;
  border-bottom: 2px solid #84b92c;
}

li {
  display: list-item;
  text-align: -webkit-match-parent;
}

 .nav .naww {
  display: inline-block;
  width: 12px;
  height: 6px;
   background: url(https://cp1.douguo.com/static/nweb/images/more1-1.png);
  vertical-align: middle;
}

.search {
  height: 30px;
  display: inline-block;
  margin-left: 15px;
  margin-top: 15px;
  position: relative;
}
/deep/ .el-input__inner {
  border-bottom-right-radius:0px;
  border-top-right-radius:0px;
  border-right: none;
}
/deep/ .el-input__inner:focus {
 border-color:#DCDFE6;
}
.br4 {
border-radius: 4px;
}
.myinfo {
margin-left: 47px;
float: left;
}
.el-dropdown-link {
cursor: pointer;
}
</style>
