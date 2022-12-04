<template>
  <div id="header" class="">
    <div class="header clearfix">
      <a class="logo left" href="/"><img src="https://cp1.douguo.com/static/nweb/images/logo3.png?20191218" alt=""></a>
      <ul class="nav">
        <li class="act"><a href="http://www.douguo.com">首页</a></li>
        <li class="relative " onmouseover="javascript:$('.ctip').show();" onmouseout="javascript:$('.ctip').hide();">
          <a href="/jingxuan">菜谱 <span class="naww"></span></a>
          <div class="ctip" style="display: none;">
            <span class="arwwj"> </span>
            <div class="ctab clearfix">
              <a href="/jingxuan/" target="_blank"><img src="https://cp1.douguo.com/static/nweb/images/jx3.png" alt=""> 精选</a>
              <a href="/zuixin/" target="_blank"> <img src="https://i1.douguo.com/upload/banner/1585648022.png" alt="" style="margin-right:4px;">最新</a>
              <a href="/caidan" target="_blank"><img src="https://cp1.douguo.com/static/nweb/images/menu3.png" alt=""> 菜单</a>
            </div>
            <div class="cblok clearfix">
              <div class="citem clearfix">
                <span>常见菜式</span>
                <div class="imublo clearfix">
                  <a href="/caipu/家常菜" target="_blank">家常菜</a>
                  <a href="/caipu/热菜" target="_blank">热菜</a>
                  <a href="/caipu/凉菜" target="_blank">凉菜</a>

                </div>
              </div>
              <div class="citem clearfix">
                <span>中国菜系</span>
                <div class="imublo clearfix">
                  <a href="/caipu/川菜" target="_blank">川菜</a>
                  <a href="/caipu/粤菜" target="_blank">粤菜</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>外国食谱</span>
                <div class="imublo clearfix">
                  <a href="/caipu/韩国" target="_blank">韩国</a>
                  <a href="/caipu/日本料理" target="_blank">日本料理</a>
                </div>
              </div>
              <div class="citem clearfix">
                <span>各地小吃</span>
                <div class="imublo clearfix">
                  <a href="/caipu/四川小吃" target="_blank">四川小吃</a>
                  <a href="/caipu/广东小吃" target="_blank">广东小吃</a>

                </div>
              </div>
              <div class="citem clearfix">
                <span>烘焙大全</span>
                <div class="imublo clearfix">
                  <a href="/caipu/蛋糕" target="_blank">蛋糕</a>
                  <a href="/caipu/面包" target="_blank">面包</a>

                </div>
              </div>
            </div>
            <div class="cmore">
              <a href="/fenlei" target="_blank">查看全部分类 <img src="https://cp1.douguo.com/static/nweb/images/more2.png" alt=""></a>
            </div>
          </div>
        </li>
        <li class="relative " onmouseover="javascript:$('.healthy').show();" onmouseout="javascript:$('.healthy').hide();">
          <a href="/article">饮食健康<span class="naww"></span></a>
          <div class="healthy" style="display: none;">
            <span class="arwwj"> </span>
            <div class="cblok clearfix">
              <div class="diet clearfix">
                <span>饮食健康</span>
                <div class="imublo clearfix">
                  <a href="/article" target="_blank">饮食新闻</a>
                  <a href="/caipu/美容瘦身" target="_blank">美容瘦身</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>功能性调理</span>
                <div class="imublo clearfix">
                  <a href="/caipu/清热去火" target="_blank">清热去火</a>
                  <a href="/caipu/减肥" target="_blank">减肥</a>
                  <a href="/caipu/祛痰" target="_blank">祛痰</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>人群膳食</span>
                <div class="imublo clearfix">
                  <a href="/caipu/孕妇" target="_blank">孕妇</a>
                  <a href="/caipu/老人" target="_blank">老人</a>
                </div>
              </div>
              <div class="diet clearfix">
                <span>疾病调理</span>
                <div class="imublo clearfix">
                  <a href="/caipu/糖尿病" target="_blank">糖尿病</a>

                </div>
              </div>
              <div class="diet clearfix">
                <span>功效营养</span>
                <div class="imublo clearfix">
                  <a href="/caipu/补钙" target="_blank">补钙</a>
                  <a href="/caipu/贫血" target="_blank">贫血</a>
                  <a href="/caipu/提高免疫力" target="_blank">提高免疫力</a>
                </div>
              </div>
            </div>
          </div>
        </li>
        <li><a href="/dish/hot">笔记</a></li>
        <li><a href="/mall">商城</a></li>
      </ul>
      <form class="search br4 left" method="POST" id="searchForm" action="/caipu/" accept-charset="utf-8" onsubmit="document.charset='utf-8';return Search();">
        <input type="text" id="global_search_inpt" class="sput" name="keywords" value="搜索菜谱、菜单、食材、用户" lang="zh-CN" autocomplete="off" onfocus="if(this.value=='搜索菜谱、菜单、食材、用户') {this.value=''; $(this).addClass('fcbm'); }" onblur="if(!this.value) {this.value='';$(this).removeClass('fcbm');} setTimeout(function (){$('#mysu2').html('')},500)" onkeyup="selectItem(event)" onclick="selectItem(event)">
        <input type="submit" value=" " class="lib">
        <div class="sugg2" id="mysu2" style="display:none;"></div>
      </form>
      <div class="pubt" onmouseover="javascript:$('.pubt-box').show();" onmouseout="javascript:$('.pubt-box').hide();"> <a class="btn-pubt" href="javascript:void(0);">发布</a> <div class="pubt-box br8" style="display: none;"> <span class="arwwj"> </span> <a href="/upfood.html">发布菜谱</a> <a href="/caidan/create">创建菜单</a>  </div> </div><div class="myinfo relative" onmouseover="javascript:$('.myedit').show();" onmouseout="javascript:$('.myedit').hide();"> <a class="headicon" href="/u/u67996224849052.html"> <img class="wb100 br50" src="https://tx1.douguo.com/upload/photo/1/1/1/70_7171e40c70b2052bbf0a72a187633c6a.png" alt=""> <span class="msgnum">1</span> </a> <div class="myedit br8"> <span class="arwwj"> </span> <a class="relative" href="/message/remind/1" target="_blank">消息提醒 <span class="boll" style="display: inline-block;"></span> </a> <a href="/u/u67996224849052/collect">我的收藏</a> <a href="/draft/recipe">草稿箱</a> <a href="/user/profile" target="_blank">账号设置</a> <a href="/logout?v=1540878216">退出</a> </div> </div></div>
  </div>
</template>

<script>
export default {
  name: "Header",
  data(){
    return {

    }
  },
}
</script>

<style scoped>

</style>
