<template>
  <div id="left" class="mt30">
    <el-carousel trigger="click">
      <el-carousel-item v-for=" (val,item,index) in 4" :key="item">
        <el-image :src="item" style="height: 400px; width: 530px"></el-image>
      </el-carousel-item>
    </el-carousel>
    <!--作者-->
    <div class="menu-head">
      <h3 class="note-title relative" style="font-weight:normal">
        <p style="max-width:590px;font-weight:bold;">纯果汁🍊橘子软糖｜Q弹好吃不粘牙💖</p>
        <div class="editmod" style="bottom:4px;">
        </div>
      </h3>
      <div class="author clearfix">
        <div class="author-img">
          <a href="/u/u18902180926496">
            <img src="https://tx1.douguo.com/upload/photo/1/c/f/70_1cbf979a4d227078d849be4a9eba7b5f.jpg" alt="">
          </a>
        </div>
        <div class="author-info">
          <h3 style="width: auto;max-width: 372px;margin-right: 20px; margin-top: 0px">
            <a href="/u/u18902180926496">倚窗看花开</a>
          </h3>
          <a class="gz" href="javascript:;" data-action="add" onclick=" guanzhu(this,'26590119','nBrgHF2v2CLo4RSDBGGnqqnnBOX5u6DZmUBSAzEQ','0') "><span class="addicon">＋</span> 关注</a>
        </div>
        <div class="fav-share clearfix" >
          <span class="not-like" data-like="like"  onclick="setLike(31468114,this,'nBrgHF2v2CLo4RSDBGGnqqnnBOX5u6DZmUBSAzEQ')" style="border:1px solid #FFB31A;color: #FFB31A; ">285</span>
          <a style="margin-left: 10px" href="javascript:;" onclick=" setFavorite('31468114',this) " data-favorite="unFavorite">收藏</a>
        </div>
      </div>
    </div>
    <!--笔记内容-->
    <div class="note-content">

      <div class="note-info">
        春节宅家自制纯果汁橘子软糖，酸酸甜甜，软软糯糯，Q弹又不粘牙，好好吃呢😀😋
        简单易做，友友们动手做起来吧😘😘😘
        --🍊🍊--
        📝食材准备：
        玉米糖浆250g｜橘子汁340g｜白砂糖50g｜黄油40g｜玉米淀粉40g｜清水40g｜柠檬汁8g
        --🍊🍊--
        📝制作步骤：
        1⃣砂糖桔剥皮榨成汁，过滤两次，取340g备用。
        2⃣40g玉米淀粉加40g清水搅拌均匀成水淀粉备用。
        3⃣不粘锅内倒入250g玉米糖浆，50g白砂糖，340g橘子汁，开大火煮沸。
        4⃣加入40g黄油和8g柠檬汁，转中小火，待黄油融化后，水淀粉再搅拌均匀一下，边倒入边搅拌。
        5⃣加热搅拌至浓稠，刮刀翻拌能抱团，不粘锅底，提起刮刀果酱呈三角形，略滴落状态即可。
        6⃣倒入做雪花酥的塑料模具中，也可倒在铺上油纸的任意盘中，按压紧实平整。
        7⃣放冰箱冷藏定型后拿出，切成小方块。其实这橘子软糖甜度很够了，无需再裹糖。橘子糖软了再吸收外层的糖，更加软得不成型。</div>

      <div class="other-info">创建时间:1小时前 · 浙江 </div>

    </div>
    <!--评论-->
    <div class="comment" style="margin-bottom: 80px;">
      <h3>评论</h3>
      <ul class="comment-list">


      </ul>
      <h3 class="mt30 not-comment">暂无评论</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: "CookDetail",
  data(){
return{
  items:[],
    };
  },
}
</script>

<style scoped>
body{
  background: #fff;
  color: #333;
  font: 12px Noto Sans,"思源黑体";
  padding-top: 60px;
}
#left {
  width: 690px;
  float: left;
}
.mt30 {
  margin-top: 30px;
}
.menu-head {
  position: relative;
  margin-top: 30px;
}
.menu-head .note-title {
  margin-top: 20px;
  font-size: 22px;
  line-height: 26px;
  font-weight: bold;
}
.menu-head .author {
  position: relative;
  margin: 25px 0;
}
.menu-head .author-img {
  width: 30px;
  height: 30px;
  margin-right: 6px;
}
.menu-head .author-info, .menu-head .author-img {
  float: left;
}
a {
  color: #333;
  text-decoration: none;
}
.menu-head .author-img img {
  width: 100%;
  height: 100%;
  border-radius: 100%;
}

element.style {
  width: auto;
  max-width: 372px;
  margin-right: 20px;
}
.menu-head .author-info h3 {
  display: inline-block;
  font-size: 13px;
  line-height: 30px;
  width: 372px;
}
.menu-head .gz {
  display: inline-block;
  width: 80px;
  text-align: center;
  font-size: 12px;
  color: #333;
  border: 1px solid #333;
  border-radius: 4px;
  left: 220px;
  height: 30px;
  line-height: 28px;
  top: -2px;
  vertical-align: top;
}
.fav-share {
  position: absolute;
  top: -2px;
  right: 0;
}
element.style {
  border: 1px solid #FFB31A;
  color: #FFB31A;
}
.fav-share .like, .fav-share .not-like {
  float: left;
  -webkit-touch-callout: none;
  -webkit-tap-highlight-color: transparent;
  -webkit-user-select: none;
  cursor: pointer;
  background: url(../../assets/love.png?v=7) no-repeat 20px 10px;
  background-size: 16px;
  height: 34px;
  line-height: 32px;
  display: inline-block;
  font-size: 15px;
  border: 1px solid #333;
  display: block;
  width: 80px;
  padding-left: 24px;
  text-align: center;
  border-radius: 4px;
}
.fav-share>a {
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
  background: #FFB31A url(../../assets/like.png) no-repeat 20px 6px;
  background-size: 20px 20px;
  padding-left: 20px;
}
.note-content .note-info {
  margin-top: 0;
  font-size: 15px;
  color: #333;
  line-height: 27px;
}
.note-content {
  padding-top:60px;
  padding-bottom: 40px;
}

.relative {
  position: relative;
}
.other-info {
  margin-top: 15px;
  font-size: 13px;
  color: #999;
}
.el-carousel__item h3 {
  color: #475669;
  font-size: 18px;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}
</style>
