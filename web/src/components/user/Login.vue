<template>
  <div style=" background: #f8f8f7;">
    <div class="loheader">
      <div class="htop">
        <div class="hlogo"><a title="食为天" to="/index">食为天美食</a></div>
      </div>
    </div>
    <div id="main" class="clearfix">

      <div class="bgsi">
        <div class="shic" style="margin-top: 78px;">
          <img src="/public/img/web/sinin.png">
        </div>
        <input type="hidden" id="path" value="https%3A%2F%2Fwww.douguo.com%2F">
      </div>
      <div class="silo clearfix">
        <div class="wizh">
          <h2 class="pass" style="color: rgb(20, 20, 20); font-size: 18px;">密码登录</h2>
          <span></span>
        </div>
        <div class="logtwo" style="display: block;">
          <div class="iput1">
            <input id="mail" placeholder="邮箱" class="phon" type="text">
          </div>
          <div class="iput2">
            <input id="pwd" placeholder="请输入密码" class="code2" maxlength="20" type="password" autocomplete="off">
            <span class="show" id="show"></span>
            <span class="hide" id="hide"></span>
            <span class="eye" id="eye"></span>
          </div>
<!--          验证码-->
          <div class="forget">
            <span class="mesg" id="mesg"></span><a href="/forget">忘记密码&gt;</a>
          </div>
          <span class="method" id="mimalg">
      <a href="#">登录</a>
    </span>
          <div class="agreement">
            <input type="checkbox" checked="checked" class="gx" id="mmgx">我已阅读并且同意
            <a href="http://www.douguo.com/privacy.html" target="_blank">食为天使用协议</a>
          </div>
          <div class="otth">
            <!-- <h3>使用社交账号登录食为天美食</h3> -->
            <span class="wenben">社交账号登录</span>
            <span class="other">
    <a href="/oauth?type=wx" class="awx"><i class="wx"></i>微信</a>
    <a href="/oauth?type=tx" class="aqq"><i class="qq"></i>QQ</a>
    <a href="/oauth?type=sina" class="aweibo"><i class="weibo"></i>微博</a>
  </span>
          </div>

        </div>
      </div>

    </div>
  </div>
</template>

<script>
 import userApi from "../../api/user";
export default {
  name: "Login",


}
</script>

<style scoped>
vhtml, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, input, button {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
  font-size: 100%;
  vertical-align: baseline;
  background: transparent;
}
body, button, input, select, textarea {
  color: #333;
}
.loheader {
  width: 100%;
  margin-bottom: 40px;
  background-color: #fff;
  border-bottom: 1px solid #f3f3f3;
}
.htop {
  width: 1200px;
  margin: 0 auto;
  height: 90px;
}
.htop .hlogo {
   float: left;
   width: 124px;
   height: 82px;
   background: url(../../assets/logo.png) no-repeat 0 0;
   line-height: 15em;
   overflow: hidden;
   margin-top: 5px;
 }
.htop .hlogo a {
  width: 180px;
  display: inline-block;
}
a {
  color: #12937c;
  text-decoration: none;
}
a:-webkit-any-link {
  cursor: pointer;
}

#main {
  width: 1200px;
  margin: 0 auto;
}
.clearfix {
  zoom: 1;
}
.clearfix:before, .clearfix:after {
  display: table;
  line-height: 0;
  content: "";
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
.bgsi {
  width: 540px;
  float: left;
}

.bgsi .shic {
  width: 540px;
  text-align: center;
}

img {

  height: auto;
  max-width: 100%;
}

input, textarea, .uneditable-input {
  width: 206px;
}

.silo {
  background-color: #fff;
  width: 400px;
  min-height: 480px;
  float: right;
  -webkit-box-shadow: 0 1px 3px rgba(100, 100, 100, 0.1);
  border-radius: 2px;
  font-family: "Microsoft Yahei", Tahoma, Geneva, sans-serif;
}

.silo .wizh {
  width: 400px;
  height: 56px;
  border-bottom: 1px solid #f8f8f7;
  position: relative;
}
.silo .wizh .pass {
  font: 18px "Microsoft Yahei", Tahoma, Geneva, sans-serif;
  position: absolute;
  height: 22px;
  top: 19px;
  left: 10px;
  line-height: 22px;
  display: flex;
  align-items: center;
  color: rgb(20, 20, 20);
}

.silo .wizh span {
  width: 40px;
  height: 4px;
  background: #84b92c;
  border-radius: 1px;
  position: absolute;
  left:4%;
  top: 91.67%;
  bottom: 1.67%;
}

.silo .logtwo {
  width: 350px;
  float: left;
  margin: 30px 0 0 45px;
  font-family: "Microsoft Yahei", Tahoma, Geneva, sans-serif;
}

.silo .iput1 {
  color: #999;
  width: 312px;
  height: 20px;
  padding: 12px 0;
  position: relative;
  border-bottom: 1px solid #f0f0f0;
  margin-top: 20px;
}

.silo .phon {
  position: absolute;
  width: 179px;
  height: 20px;
  top: 10px;
  padding: 5px 0px 5px 10px;
  border: none;
  -webkit-box-shadow: none;
}

.silo .iput2 {
  color: #999;
  width: 312px;
  height: 20px;
  padding: 15px 0;
  position: relative;
  border-bottom: 1px solid #f0f0f0;
  margin-top: 25px;
  margin-bottom: 15px;
  position: relative;
}
.silo .code2 {
  width: 260px;
  height: 20px;
  border: none;
  outline: none;
  box-shadow: none;
}

.silo .show {
  display: inline-block;
  position: absolute;
  top: 19px;
  left: 6px;
  font-size: 15px;
}

.silo .hide {
  display: inline-block;
  width: 9px;
  height: 4.5px;
  position: absolute;
  top: 27px;
  right: 13px;
  background: url(https://passport.douguo.com/public/img/web/hide.png);
  background-size: 100%;
}

.silo .eye {
  width: 12px;
  height: 12px;
  position: absolute;
  top: 24px;
  right: 11px;
  background: url(https://passport.douguo.com/public/img/web/Eye.png);
  background-size: 100%;
  display: none;
}

.silo .forget {
  width: 303px;
  height: 17px;
  padding-left: 10px;
  padding-bottom: 18px;
  text-align: right;
  line-height: 17px;
  position: relative;
}

.silo .mesg {
  display: inline-block;
  height: 17px;
  padding-left: 10px;
  padding-bottom: 18px;
  color: #e2483c;
  line-height: 17px;
  position: absolute;
  top: 0px;
  left: 0px;
}

.silo .forget a {
  color: #666666;
  text-decoration: none;
}





</style>
