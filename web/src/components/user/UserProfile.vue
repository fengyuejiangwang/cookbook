<template>
  <div id="content" class="clearfix">
    <div id="left">
      <div class="type-tab">
        <div class="type-head clearfix">
          <a href="/user/profile" class="active">基本资料</a>
        </div>
      </div>
      <form id="userinfo">
        <input type="hidden" name="userHead" value="/upload/photo/1/1/1/7171e40c70b2052bbf0a72a187633c6a.png">
        <label for="email">
        </label>
        <label for="nickname">
          <span>昵称</span> <input type="text" id="nickname" name="nickname" value="不喜欢豆类很欢欢乐乐">
        </label>
        <div class="option" style="display: flex;margin-bottom:0px">
          <span>性别</span>
          <el-col span="2" style="margin-top: 1px">
          <el-radio v-model="radio" label="1">男</el-radio>
          </el-col>
          <el-col span="2" style="margin-top: 1px;">
          <el-radio v-model="radio" label="2">女</el-radio>
          </el-col>
        </div>
        <div class="option address">
          <span>地址</span>
          <select name="cur_province" id="province" onchange="getProvince(this.value,0)">
            <option value="1">北京</option>
            <option value="2">上海</option>
            <option value="3">天津</option>
            <option value="4">重庆</option>
            <option value="5">广东</option>
            <option value="6">福建</option>
            <option value="7">浙江</option>
            <option value="8">江苏</option>
            <option value="9">山东</option>
            <option value="10">辽宁</option>
            <option value="11">江西</option>
            <option value="12">四川</option>
            <option value="13">陕西</option>
            <option value="14">湖北</option>
            <option value="15">河南</option>
            <option value="16">河北</option>
            <option value="17">山西</option>
            <option value="18">内蒙古</option>
            <option value="19">吉林</option>
            <option value="20">黑龙江</option>
            <option value="21">安徽</option>
            <option value="22">湖南</option>
            <option value="23">广西</option>
            <option value="24">海南</option>
            <option value="25">云南</option>
            <option value="26">贵州</option>
            <option value="27">西藏</option>
            <option value="28">甘肃</option>
            <option value="29">宁夏</option>
            <option value="30">青海</option>
            <option value="31">新疆</option>
            <option value="32">香港</option>
            <option value="33">澳门</option>
            <option value="35">台湾</option>
          </select>
        </div>
        <div class="option kouwei">
          <span>口味</span>
          <select name="kouwei">
            <option value="">请选择</option>
            <option value="酸">酸</option>
            <option value="甜">甜</option>
            <option value="苦">苦</option>
            <option value="辣">辣</option>
            <option value="咸">咸</option>
            <option value="麻辣">麻辣</option>
            <option value="酸甜">酸甜</option>
            <option value="咸苦">咸苦</option>
            <option value="酸苦">酸苦</option>
            <option value="微辣">微辣</option>
            <option value="变态辣">变态辣</option>
            <option value="超级咸">超级咸</option>
            <option value="腻人甜">腻人甜</option>
            <option value="无敌酸">无敌酸</option>
            <option value="清淡">清淡</option>
            <option value="通吃">通吃</option>
            <option value="重口味">重口味</option>
          </select>
        </div>
        <div class="option jieshao" style="display: flex">
          <span>自我介绍</span> <textarea name="jieshao" placeholder="介绍下自己，填写你认为自己称得上美食达人的理由。
比如：
你是否烧得一手好菜
你是否喜欢记录美食日记，与大家分享？
你是否在厨艺、美食、营养健康等领域有一定专业知识？
或者美食领域有任何的出色之举，你都可以写进来，越详细越好呦！"></textarea>
        </div>
        <input type="hidden" name="_token" value="V1SKzshScsXOpANAnw4FmLX2E3oJfFI4AGytzb1L">
        <a href="javascript:void(0)" class="save" onclick="saveInfo()">保存</a>
      </form>
    </div>
    <div id="right">
      <div class="user-head" style="margin-top:75px;">
        <img src="https://tx1.douguo.com/upload/photo/1/1/1/70_7171e40c70b2052bbf0a72a187633c6a.png" alt="不喜欢豆类很欢欢乐乐" class="user-img">
        <a href="javascript:void(0)" class="replace-img mt20" onmousemove="movefile(event,'file-input')" style="cursor: default">
          <span class="textDesc">更换头像</span>
          <input type="file" class="file-input" name="image[]" onchange="uploadHead()" id="file-input" value="https://tx1.douguo.com/upload/photo/1/1/1/70_7171e40c70b2052bbf0a72a187633c6a.png" style="filter:alpha(opacity=0);width:10px;height:10px;font-size:20px;position: fixed;cursor: default;">
        </a>

      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "UserProfile",
  data(){
    return{
      radio:'1'
    }
  }
}
</script>

<style scoped>

#content {
  width: 1000px;
  margin: 0 auto;
}
.clearfix {
  zoom: 1;
}
#left {
  width: 690px;
  float: left;
}
.type-tab {
  margin-bottom: 25px;
  margin-top: 11px;
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
#userinfo input {
  display: inline-block;
  width: 433px;
  height: 38px;
  padding-left: 13px;
  border: 1px solid #E5E3DF;
  border-radius: 4px;
  font-size: 15px;
}
input, textarea, select, button {
  font: 12px Noto Sans,"思源黑体";
  outline: 0;
}
#userinfo label {
  display: block;
  font-size: 0;
  margin-bottom: 20px;
}
label {
  cursor: default;
}
#userinfo>label>span, #userinfo .option>span {
  display: inline-block;
  width: 80px;
  text-align: right;
}
#userinfo span {
  margin-right: 12px;
  font-size: 15px;
}
#userinfo input {
  display: inline-block;
  width: 433px;
  height: 38px;
  padding-left: 13px;
  border: 1px solid #E5E3DF;
  border-radius: 4px;
  font-size: 15px;
}

.option {
  margin-bottom: 20px;
}
#userinfo .sex {
  display: inline-block;
  margin-bottom: 0;
}
input#man, input#woman {
  display: none;
}
select#year {
  width: 77px;
}
select {
  position: relative;
  display: inline-block;
  height: 38px;
  border-radius: 4px;
  padding-right: 20px;
  font-size: 15px;
  border: 1px solid #E5E3DF;
  text-align: center;
  text-align-last: center;
  background: url("https://cp1.douguo.com/static/static/nweb/images/triangle.png") no-repeat center right 10px;
  -webkit-appearance: none;
}
.address select, .kouwei select {
  width: 170px;
  margin-right: 12px;
  padding-left: 12px;
  text-align: left;
  text-align-last: left;
}
option {
  display: inline-block;
  height: 38px;
  padding-right: 20px;
  font-size: 15px;
  border-bottom: 1px solid #E5E3DF;
  text-align: center;
  text-align-last: center;
  appearance: none;
}
select:not(:-internal-list-box) {
  overflow: visible !important;
}
.jieshao>span {
  vertical-align: top;
}
.jieshao textarea {
  width: 594px;
  height: 269px;
  padding: 6px 13px;
  border: 1px solid #E5E3DF;
  border-radius: 4px;
  font-size: 15px;
  line-height: 27px;
  resize: none;
}
.save {
  display: inline-block;
  width: 168px;
  height: 42px;
  margin-left: 94px;
  margin-bottom: 80px;
  border-radius: 4px;
  background: #84b92c;
  font-size: 15px;
  line-height: 42px;
  color: #fff;
  text-align: center;
}
.kouwei select {
  width: 170px;
  margin-right: 12px;
  padding-left: 12px;
  text-align: left;
  text-align-last: left;
}
.jieshao textarea {
  width: 594px;
  height: 269px;
  padding: 6px 13px;
  border: 1px solid #E5E3DF;
  border-radius: 4px;
  font-size: 15px;
  line-height: 27px;
  resize: none;
}
.jieshao>span {
  vertical-align: top;
}
#right {
  width: 280px;
  float: right;
}
.user-head {
  position: relative;
  margin-left: 30px;
  width: 120px;
  font-size: 0;
}
.user-head img {
  width: 120px;
  height: 120px;
  border-radius: 100%;
}
img {
  vertical-align: bottom;
}
.user-head .replace-img {
  display: inline-block;
  width: 120px;
  height: 34px;
  margin-top: 14px;
  border-radius: 4px;
  background: none;
  border: 1px solid #84b92c;
  font-size: 15px;
  text-align: center;
  line-height: 33px;
  color: #84b92c;
}
.mt20 {
  margin-top: 20px;
}
.file-input {
  display: inline-block;
  position: absolute;
  width: 100%;
  height: 42px;
  left: 0;
  bottom: 0;
  font-size: 0;
  opacity: 0;
  cursor: pointer;
  color: transparent;
  background: transparent;
}
a {
  text-decoration: none;
}
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}
* {
  box-sizing: border-box;
}
body {
  background: #fff;
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  padding-top: 60px;
}
</style>
