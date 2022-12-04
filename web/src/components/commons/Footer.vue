<template>
  <div id="footer">
    <div class="dginfo">
      <div class="dgintro">
        <div class="logo2">
          <img class="wb100" src="https://cp1.douguo.com//static/nweb/images/logo3.png?20191218" alt="豆果美食logo">
        </div>
        <div class="datainfo">
          <p><span>500万+</span>美食菜谱；<span>2000万+</span>互动内容；<span>3000+</span>美食课堂；<span>5000万+</span>用户每天都有新分享</p>
        </div>
        <div class="threbl">
          <h3>扫二维码，下载食为天手机应用：</h3>
          <ul>
            <li>
              <a href="javascript:void(0);" class="emdgms">
                <img width="92" height="92" src="https://cp1.douguo.com//static/nweb/images/qrcode.png?2001" alt="豆果美食">
              </a>食为天
            </li>
            <li>
              <a href="javascript:void(0);" class="emwx">
                <img width="92" height="92" src="https://cp1.douguo.com//static/nweb/images/xcx.jpg?2001" alt="豆果美食">
              </a>微信扫一扫
            </li>
            <li>
              <a href="javascript:void(0);" class="emdgms">
                <img width="92" height="92" src="https://i1.douguo.com//upload/banner/1578991488.png" alt="豆果美食">
              </a>食为天公众号
            </li>
          </ul>
        </div>
      </div>
    </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Footer"
}
</script>

<style scoped>
#footer {
 width: 100%;
  margin-top: 30px;
}
.dginfo {
  background: #f2f2f2;
}
.dgintro{
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  box-sizing: border-box;
  padding: 0;
  border: 0;
  outline: 0;
  width: 1000px;
  position: relative;
  height: 188px;
  margin: 0 auto;
  padding-top: 94px;
}
.dgintro .logo2 {
  width: 147px;
  left: 0;
  top: 35px;
  position: absolute;
}
.wb100 {
  display: block;
  width: 100%;
}
img {
  vertical-align: bottom;
}
img[Attributes Style] {
  width: 92px;
  aspect-ratio: auto 92 / 92;
  height: 92px;
}
.dgintro .datainfo {
  width: 690px;
}
.dgintro .datainfo p {
  color: #999;
  line-height: 160%;
  margin-top: 10px;
}
p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.dgintro .datainfo span {
  font-family: Georgia,"Times New Roman",Times,serif;
  font-size: 24px;
  color: #84b92c;
  line-height: 160%;
}
.dgintro .threbl {
  width: 500px;
  position: absolute;
  top: 16px;
  left: 690px;
}
.dgintro h3 {
  font-size: 14px;
  color: #333;
  margin-bottom: 8px;
}
h3 {
  display: block;
  font-size: 1.17em;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
  margin-left: -210px;
}
ul {
  display: block;
  list-style-type: disc;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
  list-style: none;
}
.dgintro ul li {
  width: 92px;
  float: left;
  margin-right: 12px;
  text-align: center;
  list-style: none;
}
.emwx, .emdgms {
  width: 92px;
  height: 92px;
  display: block;
  margin-bottom: 8px;
}
.emdgms {
  /*background: url(../images/xcx.jpg) no-repeat;*/
  background-size: cover;
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
</style>
