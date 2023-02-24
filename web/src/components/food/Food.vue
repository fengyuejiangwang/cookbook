<template>
  <div style="width: 1400px;margin-left: 80px">
    <el-tabs  v-model="activeName" @tab-click="handleClick" style="margin-top: 30px;padding: 0">
      <el-tab-pane label="精选" name="精选" >
        <el-container style="padding: 0">
          <el-main>
            <div>
              <el-row>

                <h2 class="title">精选推荐菜谱 </h2>
                <el-col v-for="(item, index) in 24" :span="8" :key="index" style="margin-bottom:50px;">
                  <a class="cover" href="/cookbook/3227977.html" target="_blank" style="position: relative" >
                    <img width="100%" height="100%" src="https://cp1.douguo.com/upload/caiku/1/0/8/400x266_1670075287400.jpg" alt="#2022双旦烘焙季-奇趣赛#豆沙包">
                  </a>
                  <div class="relative">
                    <a class="cookname text-lips" href="/cookbook/3227977.html" style="color: rgb(51, 51, 51);
  text-decoration: none;;"  target="_blank">#2022双旦烘焙季-奇趣赛#豆沙包</a>
                    <a class="author text-lips" href="/u/u38701137787219.html" style="color: rgb(51, 51, 51);
  text-decoration: none;" target="_blank">
                      <img src="https://tx1.douguo.com/upload/photo/9/f/c/70_u38701137787219213443.jpg" alt="从不会做饭到爱上做饭"> 从不会做饭到爱上做饭
                    </a>
                    <div class="view-coll">
                      <span class="view">1.9万</span>
                      <span class="collect">440</span>
                    </div>
                  </div>
                </el-col>
              </el-row>

            </div>
            <!--            分页-->
            <el-footer align="center" style="padding: 20px">
              <el-pagination
                background
                layout="prev, pager, next"
                :page-sizes="[10,20,50]"
                :total="pageInfo.total"
                :current-page="pageInfo.pageNo"
                :page-size="pageInfo.pageSize"
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange">
              </el-pagination>
            </el-footer>
          </el-main>
        </el-container>
      </el-tab-pane>
      <el-tab-pane label="最新" name="最新">
        <el-container style="padding: 0">
          <el-main>
            <div>
              <el-row>

                <h2 class="title">最新菜谱 </h2>
                <el-col v-for="(item, index) in 24" :span="8" :key="index" style="margin-bottom:50px;">
                  <a class="cover" href="/cookbook/3227977.html" target="_blank" style="position: relative" >
                    <img width="100%" height="100%" src="https://cp1.douguo.com/upload/caiku/1/0/8/400x266_1670075287400.jpg" alt="#2022双旦烘焙季-奇趣赛#豆沙包">
                  </a>
                  <div class="relative">
                    <a class="cookname text-lips" href="/cookbook/3227977.html" style="color: rgb(51, 51, 51);
  text-decoration: none;;"  target="_blank">#2022双旦烘焙季-奇趣赛#豆沙包</a>
                    <a class="author text-lips" href="/u/u38701137787219.html" style="color: rgb(51, 51, 51);
  text-decoration: none;" target="_blank">
                      <img src="https://tx1.douguo.com/upload/photo/9/f/c/70_u38701137787219213443.jpg" alt="从不会做饭到爱上做饭"> 从不会做饭到爱上做饭
                    </a>
                    <div class="view-coll">
                      <span class="view">1.9万</span>
                      <span class="collect">440</span>
                    </div>
                  </div>
                </el-col>
              </el-row>

            </div>
            <!--            分页-->
            <el-footer align="center" style="padding: 20px">
              <el-pagination
                background
                layout="prev, pager, next"
                :page-sizes="[10,20,50]"
                :total="pageInfo.total"
                :current-page="pageInfo.pageNo"
                :page-size="pageInfo.pageSize"
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange">
              </el-pagination>
            </el-footer>
          </el-main>
        </el-container>
      </el-tab-pane>
      <el-tab-pane label="食材" name="食材">
        <el-container>
          <el-main>
            <div class="food-type clearfix">
              <div class="title-head">
                <h3>肉类<a href="/shicai/65" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a >猪</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%8C%AA%E8%82%89" target="_blank"><h5>猪肉</h5></a></li>
                  <li><a href="/ingredients/%E6%8E%92%E9%AA%A8" target="_blank"><h5>排骨</h5></a></li>
                  <li><a href="/ingredients/%E4%BA%94%E8%8A%B1%E8%82%89" target="_blank"><h5>五花肉</h5></a></li>
                  <li><a href="/ingredients/%E7%81%AB%E8%85%BF" target="_blank"><h5>火腿</h5></a></li>
                  <li><a href="/ingredients/%E9%87%8C%E8%84%8A" target="_blank"><h5>里脊</h5></a></li>
                  <li><a href="/ingredients/%E7%8C%AA%E8%B9%84" target="_blank"><h5>猪蹄</h5></a></li>
                  <li><a href="/ingredients/%E7%8C%AA%E8%82%9A" target="_blank"><h5>猪肚</h5></a></li>
                  <li><a href="/ingredients/%E7%8C%AA%E8%82%9D" target="_blank"><h5>猪肝</h5></a></li>
                  <li><a href="/ingredients/%E8%82%A5%E8%82%A0" target="_blank"><h5>肥肠</h5></a></li>
                  <li><a href="/ingredients/%E7%8C%AA%E8%85%B0" target="_blank"><h5>猪腰</h5></a></li>
                  <li class="more"><a href="/shicai/65/17" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">牛</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%89%9B%E6%8E%92" target="_blank"><h5>牛排</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E8%85%A9" target="_blank"><h5>牛腩</h5></a></li>
                  <li><a href="/ingredients/%E8%82%A5%E7%89%9B" target="_blank"><h5>肥牛</h5></a></li>
                  <li><a href="/ingredients/%E7%99%BE%E5%8F%B6" target="_blank"><h5>百叶</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E8%B9%84%E7%AD%8B" target="_blank"><h5>牛蹄筋</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E8%82%9A" target="_blank"><h5>牛肚</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E9%87%8C%E8%84%8A" target="_blank"><h5>牛里脊</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E5%B0%BE" target="_blank"><h5>牛尾</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E5%BF%83" target="_blank"><h5>牛心</h5></a></li>
                  <li class="more"><a href="/shicai/65/18" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">羊</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%BE%8A%E8%82%89" target="_blank"><h5>羊肉</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E6%8E%92" target="_blank"><h5>羊排</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E5%90%8E%E8%85%BF" target="_blank"><h5>羊后腿</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E9%87%8C%E8%84%8A" target="_blank"><h5>羊里脊</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E8%82%9D" target="_blank"><h5>羊肝</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E8%9D%8E%E5%AD%90" target="_blank"><h5>羊蝎子</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E8%85%B0" target="_blank"><h5>羊腰</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E8%82%9A" target="_blank"><h5>羊肚</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E9%AA%A8" target="_blank"><h5>羊骨</h5></a></li>
                  <li><a href="/ingredients/%E7%BE%8A%E8%85%BF" target="_blank"><h5>羊腿</h5></a></li>
                  <li class="more"><a href="/shicai/65/19" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">鸡</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%B8%A1%E8%82%89" target="_blank"><h5>鸡肉</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E8%83%B8" target="_blank"><h5>鸡胸</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E8%85%BF" target="_blank"><h5>鸡腿</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E7%BF%85" target="_blank"><h5>鸡翅</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E7%88%AA" target="_blank"><h5>鸡爪</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E8%83%97" target="_blank"><h5>鸡胗</h5></a></li>
                  <li><a href="/ingredients/%E7%81%AB%E9%B8%A1" target="_blank"><h5>火鸡</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E5%BF%83" target="_blank"><h5>鸡心</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E8%82%9D" target="_blank"><h5>鸡肝</h5></a></li>
                  <li><a href="/ingredients/%E4%BB%94%E9%B8%A1" target="_blank"><h5>仔鸡</h5></a></li>
                  <li class="more"><a href="/shicai/65/20" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">鸭</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%B8%AD%E8%82%89" target="_blank"><h5>鸭肉</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%85%BF" target="_blank"><h5>鸭腿</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%A1%80" target="_blank"><h5>鸭血</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E7%BF%85" target="_blank"><h5>鸭翅</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%83%97" target="_blank"><h5>鸭胗</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%82%9D" target="_blank"><h5>鸭肝</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%84%96" target="_blank"><h5>鸭脖</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%82%A0" target="_blank"><h5>鸭肠</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E6%8E%8C" target="_blank"><h5>鸭掌</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E5%BF%83" target="_blank"><h5>鸭心</h5></a></li>
                  <li class="more"><a href="/shicai/65/21" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">其它肉类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%B9%85%E8%82%89" target="_blank"><h5>鹅肉</h5></a></li>
                  <li><a href="/ingredients/%E9%B9%85%E8%82%9D" target="_blank"><h5>鹅肝</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E8%9B%99" target="_blank"><h5>牛蛙</h5></a></li>
                  <li><a href="/ingredients/%E5%85%94%E8%82%89" target="_blank"><h5>兔肉</h5></a></li>
                  <li><a href="/ingredients/%E9%A9%B4%E8%82%89" target="_blank"><h5>驴肉</h5></a></li>
                  <li><a href="/ingredients/%E7%94%B0%E9%B8%A1" target="_blank"><h5>田鸡</h5></a></li>
                  <li class="more"><a href="/shicai/65/72" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">制品</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E5%9F%B9%E6%A0%B9" target="_blank"><h5>培根</h5></a></li>
                  <li><a href="/ingredients/%E8%85%8A%E8%82%89" target="_blank"><h5>腊肉</h5></a></li>
                  <li><a href="/ingredients/%E8%82%89%E6%9D%BE" target="_blank"><h5>肉松</h5></a></li>
                  <li><a href="/ingredients/%E5%92%B8%E8%82%89" target="_blank"><h5>咸肉</h5></a></li>
                  <li><a href="/ingredients/%E5%8D%88%E9%A4%90%E8%82%89" target="_blank"><h5>午餐肉</h5></a></li>
                  <li><a href="/ingredients/%E5%8F%89%E7%83%A7%E8%82%89" target="_blank"><h5>叉烧肉</h5></a></li>
                  <li><a href="/ingredients/%E7%86%8F%E8%82%89" target="_blank"><h5>熏肉</h5></a></li>
                  <li class="more"><a href="/shicai/65/73" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>水果、花茶、坚果<a href="/shicai/66" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">鲜果</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%8B%B9%E6%9E%9C" target="_blank"><h5>苹果</h5></a></li>
                  <li><a href="/ingredients/%E9%A6%99%E8%95%89" target="_blank"><h5>香蕉</h5></a></li>
                  <li><a href="/ingredients/%E6%A2%A8" target="_blank"><h5>梨</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%92%E6%9E%9C" target="_blank"><h5>芒果</h5></a></li>
                  <li><a href="/ingredients/%E8%8F%A0%E8%90%9D" target="_blank"><h5>菠萝</h5></a></li>
                  <li><a href="/ingredients/%E8%8D%89%E8%8E%93" target="_blank"><h5>草莓</h5></a></li>
                  <li><a href="/ingredients/%E6%9D%8F" target="_blank"><h5>杏</h5></a></li>
                  <li><a href="/ingredients/%E7%8C%95%E7%8C%B4%E6%A1%83" target="_blank"><h5>猕猴桃</h5></a></li>
                  <li><a href="/ingredients/%E6%9F%9A%E5%AD%90" target="_blank"><h5>柚子</h5></a></li>
                  <li><a href="/ingredients/%E8%A5%BF%E7%93%9C" target="_blank"><h5>西瓜</h5></a></li>
                  <li class="more"><a href="/shicai/66/75" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">花</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E6%A7%90%E8%8A%B1" target="_blank"><h5>槐花</h5></a></li>
                  <li><a href="/ingredients/%E6%A1%82%E8%8A%B1" target="_blank"><h5>桂花</h5></a></li>
                  <li><a href="/ingredients/%E6%B4%9B%E7%A5%9E%E8%8A%B1" target="_blank"><h5>洛神花</h5></a></li>
                  <li><a href="/ingredients/%E7%89%A1%E4%B8%B9%E8%8A%B1" target="_blank"><h5>牡丹花</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%8D%E8%8D%AF%E8%8A%B1" target="_blank"><h5>芍药花</h5></a></li>
                  <li><a href="/ingredients/%E9%87%91%E9%93%B6%E8%8A%B1" target="_blank"><h5>金银花</h5></a></li>
                  <li class="more"><a href="/shicai/66/77" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">坚果、干果类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%8A%B1%E7%94%9F" target="_blank"><h5>花生</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%9D%E9%BA%BB" target="_blank"><h5>芝麻</h5></a></li>
                  <li><a href="/ingredients/%E6%A0%B8%E6%A1%83" target="_blank"><h5>核桃</h5></a></li>
                  <li><a href="/ingredients/%E6%9D%8F%E4%BB%81" target="_blank"><h5>杏仁</h5></a></li>
                  <li><a href="/ingredients/%E8%8E%B2%E5%AD%90" target="_blank"><h5>莲子</h5></a></li>
                  <li><a href="/ingredients/%E8%85%B0%E6%9E%9C" target="_blank"><h5>腰果</h5></a></li>
                  <li><a href="/ingredients/%E6%9D%BE%E5%AD%90" target="_blank"><h5>松子</h5></a></li>
                  <li><a href="/ingredients/%E6%A0%97%E5%AD%90" target="_blank"><h5>栗子</h5></a></li>
                  <li><a href="/ingredients/%E6%9E%B8%E6%9D%9E" target="_blank"><h5>枸杞</h5></a></li>
                  <li><a href="/ingredients/%E6%A6%9B%E5%AD%90" target="_blank"><h5>榛子</h5></a></li>
                  <li class="more"><a href="/shicai/66/79" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>蔬菜、菌藻、药食<a href="/shicai/67" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">蔬菜类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E5%9C%9F%E8%B1%86" target="_blank"><h5>土豆</h5></a></li>
                  <li><a href="/ingredients/%E8%83%A1%E8%90%9D%E5%8D%9C" target="_blank"><h5>胡萝卜</h5></a></li>
                  <li><a href="/ingredients/%E7%99%BD%E8%90%9D%E5%8D%9C" target="_blank"><h5>白萝卜</h5></a></li>
                  <li><a href="/ingredients/%E7%99%BE%E5%90%88" target="_blank"><h5>百合</h5></a></li>
                  <li><a href="/ingredients/%E5%86%AC%E7%AC%8B" target="_blank"><h5>冬笋</h5></a></li>
                  <li><a href="/ingredients/%E6%98%A5%E7%AC%8B" target="_blank"><h5>春笋</h5></a></li>
                  <li><a href="/ingredients/%E6%B4%8B%E8%91%B1" target="_blank"><h5>洋葱</h5></a></li>
                  <li><a href="/ingredients/%E9%9D%92%E7%AC%8B" target="_blank"><h5>青笋</h5></a></li>
                  <li><a href="/ingredients/%E8%97%95" target="_blank"><h5>藕</h5></a></li>
                  <li><a href="/ingredients/%E8%8C%AD%E7%99%BD" target="_blank"><h5>茭白</h5></a></li>
                  <li class="more"><a href="/shicai/67/80" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">菌藻类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E6%B5%B7%E5%B8%A6" target="_blank"><h5>海带</h5></a></li>
                  <li><a href="/ingredients/%E7%B4%AB%E8%8F%9C" target="_blank"><h5>紫菜</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E8%8B%94" target="_blank"><h5>海苔</h5></a></li>
                  <li><a href="/ingredients/%E9%A6%99%E8%8F%87" target="_blank"><h5>香菇</h5></a></li>
                  <li><a href="/ingredients/%E6%9C%A8%E8%80%B3" target="_blank"><h5>木耳</h5></a></li>
                  <li><a href="/ingredients/%E9%93%B6%E8%80%B3" target="_blank"><h5>银耳</h5></a></li>
                  <li><a href="/ingredients/%E9%87%91%E9%92%88%E8%8F%87" target="_blank"><h5>金针菇</h5></a></li>
                  <li><a href="/ingredients/%E5%B9%B3%E8%8F%87" target="_blank"><h5>平菇</h5></a></li>
                  <li><a href="/ingredients/%E8%8D%89%E8%8F%87" target="_blank"><h5>草菇</h5></a></li>
                  <li><a href="/ingredients/%E5%8F%A3%E8%98%91" target="_blank"><h5>口蘑</h5></a></li>
                  <li class="more"><a href="/shicai/67/81" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">药材类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%BD%97%E6%B1%89%E6%9E%9C" target="_blank"><h5>罗汉果</h5></a></li>
                  <li><a href="/ingredients/%E5%B7%9D%E8%B4%9D" target="_blank"><h5>川贝</h5></a></li>
                  <li><a href="/ingredients/%E9%A6%96%E4%B9%8C" target="_blank"><h5>首乌</h5></a></li>
                  <li><a href="/ingredients/%E4%BA%BA%E5%8F%82" target="_blank"><h5>人参</h5></a></li>
                  <li><a href="/ingredients/%E8%8D%B7%E5%8F%B6" target="_blank"><h5>荷叶</h5></a></li>
                  <li><a href="/ingredients/%E9%98%BF%E8%83%B6" target="_blank"><h5>阿胶</h5></a></li>
                  <li><a href="/ingredients/%E5%86%AC%E8%99%AB%E5%A4%8F%E8%8D%89" target="_blank"><h5>冬虫夏草</h5></a></li>
                  <li><a href="/ingredients/%E9%99%88%E7%9A%AE" target="_blank"><h5>陈皮</h5></a></li>
                  <li><a href="/ingredients/%E7%99%BD%E8%8A%B7" target="_blank"><h5>白芷</h5></a></li>
                  <li><a href="/ingredients/%E8%82%89%E6%A1%82" target="_blank"><h5>肉桂</h5></a></li>
                  <li class="more"><a href="/shicai/67/82" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">酸菜、腌菜类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%85%B8%E8%8F%9C" target="_blank"><h5>酸菜</h5></a></li>
                  <li><a href="/ingredients/%E6%A6%A8%E8%8F%9C" target="_blank"><h5>榨菜</h5></a></li>
                  <li><a href="/ingredients/%E8%BE%A3%E7%99%BD%E8%8F%9C" target="_blank"><h5>辣白菜</h5></a></li>
                  <li><a href="/ingredients/%E6%B3%A1%E8%8F%9C" target="_blank"><h5>泡菜</h5></a></li>
                  <li><a href="/ingredients/%E9%85%B8%E7%AC%8B" target="_blank"><h5>酸笋</h5></a></li>
                  <li><a href="/ingredients/%E9%85%B8%E8%B1%86%E8%A7%92" target="_blank"><h5>酸豆角</h5></a></li>
                  <li><a href="/ingredients/%E9%85%B8%E8%B1%87%E8%B1%86" target="_blank"><h5>酸豇豆</h5></a></li>
                  <li class="more"><a href="/shicai/67/83" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>鱼虾蟹贝等水产<a href="/shicai/68" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">虾</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%99%BE" target="_blank"><h5>虾</h5></a></li>
                  <li><a href="/ingredients/%E8%99%BE%E4%BB%81" target="_blank"><h5>虾仁</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E8%99%BE" target="_blank"><h5>海虾</h5></a></li>
                  <li><a href="/ingredients/%E6%B2%B3%E8%99%BE" target="_blank"><h5>河虾</h5></a></li>
                  <li><a href="/ingredients/%E5%8C%97%E6%9E%81%E8%99%BE" target="_blank"><h5>北极虾</h5></a></li>
                  <li><a href="/ingredients/%E9%BE%99%E8%99%BE" target="_blank"><h5>龙虾</h5></a></li>
                  <li><a href="/ingredients/%E6%98%8E%E8%99%BE" target="_blank"><h5>明虾</h5></a></li>
                  <li><a href="/ingredients/%E5%9F%BA%E5%9B%B4%E8%99%BE" target="_blank"><h5>基围虾</h5></a></li>
                  <li><a href="/ingredients/%E5%B0%8F%E9%BE%99%E8%99%BE" target="_blank"><h5>小龙虾</h5></a></li>
                  <li><a href="/ingredients/%E7%9A%AE%E7%9A%AE%E8%99%BE" target="_blank"><h5>皮皮虾</h5></a></li>
                  <li class="more"><a href="/shicai/68/26" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">蟹</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E6%A2%AD%E5%AD%90%E8%9F%B9" target="_blank"><h5>梭子蟹</h5></a></li>
                  <li><a href="/ingredients/%E5%A4%A7%E9%97%B8%E8%9F%B9" target="_blank"><h5>大闸蟹</h5></a></li>
                  <li><a href="/ingredients/%E6%B2%B3%E8%9F%B9" target="_blank"><h5>河蟹</h5></a></li>
                  <li><a href="/ingredients/%E8%9E%83%E8%9F%B9" target="_blank"><h5>螃蟹</h5></a></li>
                  <li><a href="/ingredients/%E9%9D%92%E8%9F%B9" target="_blank"><h5>青蟹</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E8%9F%B9" target="_blank"><h5>海蟹</h5></a></li>
                  <li><a href="/ingredients/%E5%B8%9D%E7%8E%8B%E8%9F%B9" target="_blank"><h5>帝王蟹</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%B1%E8%9F%B9" target="_blank"><h5>花蟹</h5></a></li>
                  <li><a href="/ingredients/%E6%B2%99%E8%9F%B9" target="_blank"><h5>沙蟹</h5></a></li>
                  <li class="more"><a href="/shicai/68/27" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">贝</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E6%B5%B7%E8%9E%BA" target="_blank"><h5>海螺</h5></a></li>
                  <li><a href="/ingredients/%E6%89%87%E8%B4%9D" target="_blank"><h5>扇贝</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%9C%E8%B4%9D" target="_blank"><h5>鲜贝</h5></a></li>
                  <li><a href="/ingredients/%E5%B9%B2%E8%B4%9D" target="_blank"><h5>干贝</h5></a></li>
                  <li><a href="/ingredients/%E8%9B%A4%E8%9C%8A" target="_blank"><h5>蛤蜊</h5></a></li>
                  <li><a href="/ingredients/%E8%9B%8F%E5%AD%90" target="_blank"><h5>蛏子</h5></a></li>
                  <li><a href="/ingredients/%E7%94%9F%E8%9A%9D" target="_blank"><h5>生蚝</h5></a></li>
                  <li><a href="/ingredients/%E6%96%87%E8%9B%A4" target="_blank"><h5>文蛤</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%8D%E9%B1%BC" target="_blank"><h5>鲍鱼</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E8%9A%8C" target="_blank"><h5>海蚌</h5></a></li>
                  <li class="more"><a href="/shicai/68/28" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">鱼</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%8D%89%E9%B1%BC" target="_blank"><h5>草鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%AB%E9%B1%BC" target="_blank"><h5>鲫鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%88%E9%B1%BC" target="_blank"><h5>鲈鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%A4%E9%B1%BC" target="_blank"><h5>鲤鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%B6%E9%B1%BC" target="_blank"><h5>鲶鱼</h5></a></li>
                  <li><a href="/ingredients/%E5%B8%A6%E9%B1%BC" target="_blank"><h5>带鱼</h5></a></li>
                  <li><a href="/ingredients/%E4%B8%89%E6%96%87%E9%B1%BC" target="_blank"><h5>三文鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B3%95%E9%B1%BC" target="_blank"><h5>鳕鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%BB%84%E9%B1%BC" target="_blank"><h5>黄鱼</h5></a></li>
                  <li><a href="/ingredients/%E9%B2%B3%E9%B1%BC" target="_blank"><h5>鲳鱼</h5></a></li>
                  <li class="more"><a href="/shicai/68/74" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">其它</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%B1%BC%E4%B8%B8" target="_blank"><h5>鱼丸</h5></a></li>
                  <li><a href="/ingredients/%E9%B1%BC%E7%B1%BD" target="_blank"><h5>鱼籽</h5></a></li>
                  <li><a href="/ingredients/%E9%B1%BF%E9%B1%BC" target="_blank"><h5>鱿鱼</h5></a></li>
                  <li><a href="/ingredients/%E5%A2%A8%E9%B1%BC" target="_blank"><h5>墨鱼</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E5%8F%82" target="_blank"><h5>海参</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E8%9C%87" target="_blank"><h5>海蜇</h5></a></li>
                  <li><a href="/ingredients/%E7%94%B2%E9%B1%BC" target="_blank"><h5>甲鱼</h5></a></li>
                  <li><a href="/ingredients/%E6%9C%A8%E9%B1%BC%E8%8A%B1" target="_blank"><h5>木鱼花</h5></a></li>
                  <li><a href="/ingredients/%E9%87%91%E6%9E%AA%E9%B1%BC%E7%BD%90%E5%A4%B4" target="_blank"><h5>金枪鱼罐头</h5></a></li>
                  <li><a href="/ingredients/%E8%9F%B9%E6%9F%B3" target="_blank"><h5>蟹柳</h5></a></li>
                  <li class="more"><a href="/shicai/68/76" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>谷类<a href="/shicai/69" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">米</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E5%A4%A7%E7%B1%B3" target="_blank"><h5>大米</h5></a></li>
                  <li><a href="/ingredients/%E7%B3%99%E7%B1%B3" target="_blank"><h5>糙米</h5></a></li>
                  <li><a href="/ingredients/%E7%B1%B3%E9%A5%AD" target="_blank"><h5>米饭</h5></a></li>
                  <li><a href="/ingredients/%E7%B3%AF%E7%B1%B3" target="_blank"><h5>糯米</h5></a></li>
                  <li><a href="/ingredients/%E5%B9%B4%E7%B3%95" target="_blank"><h5>年糕</h5></a></li>
                  <li><a href="/ingredients/%E9%A6%99%E7%B1%B3" target="_blank"><h5>香米</h5></a></li>
                  <li><a href="/ingredients/%E7%B3%AF%E7%B1%B3%E7%B2%89" target="_blank"><h5>糯米粉</h5></a></li>
                  <li><a href="/ingredients/%E9%A5%B5%E5%9D%97" target="_blank"><h5>饵块</h5></a></li>
                  <li><a href="/ingredients/%E7%B2%B3%E7%B1%B3" target="_blank"><h5>粳米</h5></a></li>
                  <li><a href="/ingredients/%E7%B1%BC%E7%B1%B3" target="_blank"><h5>籼米</h5></a></li>
                  <li class="more"><a href="/shicai/69/84" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">面</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%9D%A2%E7%B2%89" target="_blank"><h5>面粉</h5></a></li>
                  <li><a href="/ingredients/%E9%AB%98%E7%AD%8B%E9%9D%A2%E7%B2%89" target="_blank"><h5>高筋面粉</h5></a></li>
                  <li><a href="/ingredients/%E4%BD%8E%E7%AD%8B%E9%9D%A2%E7%B2%89" target="_blank"><h5>低筋面粉</h5></a></li>
                  <li><a href="/ingredients/%E4%B8%AD%E7%AD%8B%E9%9D%A2%E7%B2%89" target="_blank"><h5>中筋面粉</h5></a></li>
                  <li><a href="/ingredients/%E7%8E%89%E7%B1%B3%E9%9D%A2" target="_blank"><h5>玉米面</h5></a></li>
                  <li><a href="/ingredients/%E5%85%A8%E9%BA%A6%E7%B2%89" target="_blank"><h5>全麦粉</h5></a></li>
                  <li><a href="/ingredients/%E5%B0%8F%E9%BA%A6%E9%9D%A2%E7%B2%89" target="_blank"><h5>小麦面粉</h5></a></li>
                  <li><a href="/ingredients/%E9%9D%A2%E6%9D%A1" target="_blank"><h5>面条</h5></a></li>
                  <li><a href="/ingredients/%E6%8C%82%E9%9D%A2" target="_blank"><h5>挂面</h5></a></li>
                  <li><a href="/ingredients/%E6%84%8F%E5%A4%A7%E5%88%A9%E9%9D%A2%E6%9D%A1" target="_blank"><h5>意大利面条</h5></a></li>
                  <li class="more"><a href="/shicai/69/85" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">杂粮</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E5%B0%8F%E7%B1%B3" target="_blank"><h5>小米</h5></a></li>
                  <li><a href="/ingredients/%E9%BB%91%E7%B1%B3" target="_blank"><h5>黑米</h5></a></li>
                  <li><a href="/ingredients/%E7%B4%AB%E7%B1%B3" target="_blank"><h5>紫米</h5></a></li>
                  <li><a href="/ingredients/%E8%96%8F%E7%B1%B3" target="_blank"><h5>薏米</h5></a></li>
                  <li><a href="/ingredients/%E7%87%95%E9%BA%A6%E7%89%87" target="_blank"><h5>燕麦片</h5></a></li>
                  <li><a href="/ingredients/%E5%A4%A7%E9%BA%A6" target="_blank"><h5>大麦</h5></a></li>
                  <li><a href="/ingredients/%E8%8D%9E%E9%BA%A6" target="_blank"><h5>荞麦</h5></a></li>
                  <li><a href="/ingredients/%E9%BB%84%E7%B1%B3" target="_blank"><h5>黄米</h5></a></li>
                  <li><a href="/ingredients/%E9%AB%98%E7%B2%B1%E7%B1%B3" target="_blank"><h5>高粱米</h5></a></li>
                  <li><a href="/ingredients/%E5%B0%8F%E7%B1%B3%E9%9D%A2" target="_blank"><h5>小米面</h5></a></li>
                  <li class="more"><a href="/shicai/69/86" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">淀粉类</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%A5%BF%E7%B1%B3" target="_blank"><h5>西米</h5></a></li>
                  <li><a href="/ingredients/%E7%B2%89%E4%B8%9D" target="_blank"><h5>粉丝</h5></a></li>
                  <li><a href="/ingredients/%E9%AD%94%E8%8A%8B" target="_blank"><h5>魔芋</h5></a></li>
                  <li><a href="/ingredients/%E7%B1%BC%E7%B1%B3%E7%B2%89" target="_blank"><h5>籼米粉</h5></a></li>
                  <li><a href="/ingredients/%E7%B1%B3%E7%B2%89" target="_blank"><h5>米粉</h5></a></li>
                  <li class="more"><a href="/shicai/69/87" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>豆乳蛋类及制品<a href="/shicai/70" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">乳及其制品</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E5%A5%B6%E6%B2%B9" target="_blank"><h5>奶油</h5></a></li>
                  <li><a href="/ingredients/%E4%B9%B3%E9%85%AA" target="_blank"><h5>乳酪</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E5%A5%B6" target="_blank"><h5>牛奶</h5></a></li>
                  <li><a href="/ingredients/%E9%BB%84%E6%B2%B9" target="_blank"><h5>黄油</h5></a></li>
                  <li><a href="/ingredients/%E9%85%B8%E5%A5%B6" target="_blank"><h5>酸奶</h5></a></li>
                  <li class="more"><a href="/shicai/70/88" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">豆及其制品</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%B1%8C%E8%B1%86" target="_blank"><h5>豌豆</h5></a></li>
                  <li><a href="/ingredients/%E8%B1%87%E8%B1%86" target="_blank"><h5>豇豆</h5></a></li>
                  <li><a href="/ingredients/%E9%BB%84%E8%B1%86" target="_blank"><h5>黄豆</h5></a></li>
                  <li><a href="/ingredients/%E7%BA%A2%E8%B1%86" target="_blank"><h5>红豆</h5></a></li>
                  <li><a href="/ingredients/%E8%8D%B7%E5%85%B0%E8%B1%86" target="_blank"><h5>荷兰豆</h5></a></li>
                  <li><a href="/ingredients/%E6%AF%9B%E8%B1%86" target="_blank"><h5>毛豆</h5></a></li>
                  <li><a href="/ingredients/%E7%BB%BF%E8%B1%86" target="_blank"><h5>绿豆</h5></a></li>
                  <li><a href="/ingredients/%E8%9A%95%E8%B1%86" target="_blank"><h5>蚕豆</h5></a></li>
                  <li><a href="/ingredients/%E8%B1%86%E8%85%90" target="_blank"><h5>豆腐</h5></a></li>
                  <li><a href="/ingredients/%E5%8D%97%E8%B1%86%E8%85%90" target="_blank"><h5>南豆腐</h5></a></li>
                  <li class="more"><a href="/shicai/70/89" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">蛋及其制品</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E9%B8%A1%E8%9B%8B" target="_blank"><h5>鸡蛋</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%AD%E8%9B%8B" target="_blank"><h5>鸭蛋</h5></a></li>
                  <li><a href="/ingredients/%E9%B9%8C%E9%B9%91%E8%9B%8B" target="_blank"><h5>鹌鹑蛋</h5></a></li>
                  <li><a href="/ingredients/%E7%9A%AE%E8%9B%8B" target="_blank"><h5>皮蛋</h5></a></li>
                  <li><a href="/ingredients/%E5%8D%A4%E8%9B%8B" target="_blank"><h5>卤蛋</h5></a></li>
                  <li><a href="/ingredients/%E9%B9%85%E8%9B%8B" target="_blank"><h5>鹅蛋</h5></a></li>
                  <li><a href="/ingredients/%E5%92%B8%E8%9B%8B%E9%BB%84" target="_blank"><h5>咸蛋黄</h5></a></li>
                  <li><a href="/ingredients/%E8%9B%8B%E6%B8%85" target="_blank"><h5>蛋清</h5></a></li>
                  <li><a href="/ingredients/%E9%B8%A1%E8%9B%8B%E6%B6%B2" target="_blank"><h5>鸡蛋液</h5></a></li>
                  <li class="more"><a href="/shicai/70/90" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="title-head">
                <h3>调味品<a href="/shicai/71" target="_blank">(全部)</a></h3>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">香辛料</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%89%9B%E8%87%B3" target="_blank"><h5>牛至</h5></a></li>
                  <li><a href="/ingredients/%E8%8C%B4%E9%A6%99" target="_blank"><h5>茴香</h5></a></li>
                  <li><a href="/ingredients/%E7%BD%97%E5%8B%92" target="_blank"><h5>罗勒</h5></a></li>
                  <li><a href="/ingredients/%E8%96%84%E8%8D%B7" target="_blank"><h5>薄荷</h5></a></li>
                  <li><a href="/ingredients/%E5%A7%9C" target="_blank"><h5>姜</h5></a></li>
                  <li><a href="/ingredients/%E5%92%96%E5%96%B1%E7%B2%89" target="_blank"><h5>咖喱粉</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%A5%E6%9C%AB" target="_blank"><h5>芥末</h5></a></li>
                  <li><a href="/ingredients/%E8%BF%B7%E8%BF%AD%E9%A6%99" target="_blank"><h5>迷迭香</h5></a></li>
                  <li><a href="/ingredients/%E8%83%A1%E6%A4%92%E7%B2%89" target="_blank"><h5>胡椒粉</h5></a></li>
                  <li><a href="/ingredients/%E8%92%9C" target="_blank"><h5>蒜</h5></a></li>
                  <li class="more"><a href="/shicai/71/61" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">酱</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E8%80%81%E5%B9%B2%E5%A6%88" target="_blank"><h5>老干妈</h5></a></li>
                  <li><a href="/ingredients/%E6%B5%B7%E9%B2%9C%E9%85%B1" target="_blank"><h5>海鲜酱</h5></a></li>
                  <li><a href="/ingredients/%E7%89%9B%E8%82%89%E9%85%B1" target="_blank"><h5>牛肉酱</h5></a></li>
                  <li><a href="/ingredients/%E8%8A%B1%E7%94%9F%E9%85%B1" target="_blank"><h5>花生酱</h5></a></li>
                  <li class="more"><a href="/shicai/71/62" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">油</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E6%A9%84%E6%A6%84%E6%B2%B9" target="_blank"><h5>橄榄油</h5></a></li>
                  <li><a href="/ingredients/%E8%8F%9C%E7%B1%BD%E6%B2%B9" target="_blank"><h5>菜籽油</h5></a></li>
                  <li><a href="/ingredients/%E8%89%B2%E6%8B%89%E6%B2%B9" target="_blank"><h5>色拉油</h5></a></li>
                  <li><a href="/ingredients/%E6%B2%B9" target="_blank"><h5>油</h5></a></li>
                  <li><a href="/ingredients/%E7%8E%89%E7%B1%B3%E6%B2%B9" target="_blank"><h5>玉米油</h5></a></li>
                  <li><a href="/ingredients/%E9%A6%99%E6%B2%B9" target="_blank"><h5>香油</h5></a></li>
                  <li><a href="/ingredients/%E8%9A%9D%E6%B2%B9" target="_blank"><h5>蚝油</h5></a></li>
                  <li class="more"><a href="/shicai/71/63" target="_blank">更多</a></li>
                </ul>
              </div>
              <div class="type clearfix">
                <h4><a href="javascript:void(0);">糖</a></h4>
                <ul class="clearfix">
                  <li><a href="/ingredients/%E7%99%BD%E7%A0%82%E7%B3%96" target="_blank"><h5>白砂糖</h5></a></li>
                  <li><a href="/ingredients/%E7%BB%B5%E7%99%BD%E7%B3%96" target="_blank"><h5>绵白糖</h5></a></li>
                  <li><a href="/ingredients/%E7%BA%A2%E7%B3%96" target="_blank"><h5>红糖</h5></a></li>
                  <li><a href="/ingredients/%E7%B3%96%E7%B2%89" target="_blank"><h5>糖粉</h5></a></li>
                  <li><a href="/ingredients/%E7%BB%86%E7%A0%82%E7%B3%96" target="_blank"><h5>细砂糖</h5></a></li>
                  <li class="more"><a href="/shicai/71/64" target="_blank">更多</a></li>
                </ul>
              </div>
            </div>
          </el-main>
        </el-container>
      </el-tab-pane>
      <el-tab-pane label="菜单" name="菜单">
        <el-container>
          <el-main>
            <div class="new-hot">
              <a href="/caidan/zuixin" class="new  ">最新</a> |
              <a href="/caidan" class="hot  active ">最热</a>
            </div>
            <div class="menu-list">
              <ul class="clearfix">
                <li>
                  <a class="cover" href="/caidan/841863.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/c/4/b/400x266_c4384853514cc85ace5bd50e6412daeb.jpg" alt="备战团圆饭 美味新一年">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">备战团圆饭 美味新一年</p>

                      <p class="rnum">15道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842856.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/e/7/b/400x266_e782ea3b7f85cb7b976f7487cd3d654b.jpg" alt="让人无法拒绝的土豆君">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">让人无法拒绝的土豆君</p>

                      <p class="rnum">18道菜谱</p>
                    </div>
                  </a>
                </li>
                <li class="three">
                  <a class="cover" href="/caidan/842852.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/e/1/1/400x266_e18e06540c9854565383a72f6dbb0b51.jpg" alt="天空下的是糖果雨">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">天空下的是糖果雨</p>

                      <p class="rnum">15道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842851.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/3/f/7/400x266_3f09f8e2446c367c560fd4936a0e8db7.jpg" alt="假装这是亚当遗失的肋骨…">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">假装这是亚当遗失的肋骨…</p>

                      <p class="rnum">18道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842849.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/6/1/c/400x266_61dde40555189d9c9bd71a873c2b14ec.jpg" alt="给你一个吃豆腐的机会">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">给你一个吃豆腐的机会</p>

                      <p class="rnum">18道菜谱</p>
                    </div>
                  </a>
                </li>
                <li class="three">
                  <a class="cover" href="/caidan/842848.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/f/0/a/400x266_f0ef096dcc8c25a6aec88fc2b3755b0a.jpg" alt="最美（xiong）味（can）的榴莲在这里！">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">最美（xiong）味（can）的榴莲在这里！</p>

                      <p class="rnum">18道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842846.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/a/9/3/400x266_a933546b20fc100e7c573c4f7fe30853.png" alt="这是一杯有故事的布丁…">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">这是一杯有故事的布丁…</p>

                      <p class="rnum">17道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842840.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/c/a/1/400x266_cac0ab459cf9a51448ce24d5af2c9621.jpg" alt="清晨的粥比深夜的酒好喝">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">清晨的粥比深夜的酒好喝</p>

                      <p class="rnum">45道菜谱</p>
                    </div>
                  </a>
                </li>
                <li class="three">
                  <a class="cover" href="/caidan/842812.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/3/4/2/400x266_34be54e2347cd5d40668a81da1dd2d02.jpg" alt="打破闷热，晶莹清爽又Q弹">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">打破闷热，晶莹清爽又Q弹</p>

                      <p class="rnum">15道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842809.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/a/1/4/400x266_a1b3d5b1d028b356b907cbd8ab6996a4.jpg" alt="一碗浓情面，驱散三秋寒">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">一碗浓情面，驱散三秋寒</p>

                      <p class="rnum">17道菜谱</p>
                    </div>
                  </a>
                </li>
                <li>
                  <a class="cover" href="/caidan/842793.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/b/c/e/400x266_bc3b9ae5c148ff8a819931ab0b4d19de.jpg" alt="【姐姐好饿】青岛贵妇黄渤教你吃虾！">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">【姐姐好饿】青岛贵妇黄渤教你吃虾！</p>

                      <p class="rnum">15道菜谱</p>
                    </div>
                  </a>
                </li>
                <li class="three">
                  <a class="cover" href="/caidan/842781.html" target="_blank">
                    <img class="wb100" src="https://cp1.douguo.com/upload/caiku/e/7/4/400x266_e7a78eca4e045800848821c849ee5b74.jpeg" alt="没有冰激凌还能叫夏天吗？">
                    <div class="menuinfo absolute">
                      <p class="name text-lips">没有冰激凌还能叫夏天吗？</p>

                      <p class="rnum">13道菜谱</p>
                    </div>
                  </a>
                </li>
              </ul>
            </div>
            <!--            分页-->
            <el-footer align="center" style="padding: 20px">
              <el-pagination
                background
                layout="prev, pager, next"
                :page-sizes="[10,20,50]"
                :total="pageInfo.total"
                :current-page="pageInfo.pageNo"
                :page-size="pageInfo.pageSize"
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange">
              </el-pagination>
            </el-footer>
          </el-main>
        </el-container>
      </el-tab-pane>
    </el-tabs>
  </div>
</template>


<script>


export default {
  name: "Food",
  data() {
    return {
      subtitle: '',
      activeName: '全部',
      currentDate: new Date(),
      goodsList: [{id:1}],
      pageInfo: {
        pageNo: 1,
        pageSize: 9,
        total:10,
      },
    };
  },

};
</script>

<style scoped>

.cover {
  width: 390px;
  height: 250px;
  display: block;
 border-radius: 1px;
}
.relative {
  position: relative;
}
.cookname {
  display: block;
  font-size: 15px;
  color: rgb(51, 51, 51);
  line-height: 15px;
  padding: 10px 0px;
}
.author {
  display: inline-block;
  height: 20px;
  line-height: 20px;
  font-size: 16px;
}

.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
a {
  color: rgb(51, 51, 51);
  text-decoration: none;
}
.view-coll {
  position: absolute;
  right: 65px;
  bottom: 0px;
  font-size: 12px;
  line-height: 20px;

}
.author img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  vertical-align: bottom;
}
 .view::before {
  width: 17px;
  height: 12px;

}
.view::before, .collect::before {
  content: "";
  display: inline-block;
  vertical-align: middle;
  margin-right: 2px;
  position: relative;
  top: -1px;
}
 .collect::before {
  width: 14px;
  height: 13px;

}

element.style {
}
.cookname {
  display: block;
  font-size: 20px;
  color: rgb(51, 51, 51);
  line-height: 15px;
  padding: 10px 0px;
}
.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
body, div, img, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, button, textarea, p, a, blockquote, th, td {
  margin: 0px;
  padding: 0px;
  border: 0px;
  outline: 0px;
}
* {
  box-sizing: border-box;
}

a:-webkit-any-link {
  cursor: pointer;

}
ol, ul, li {
  list-style: none;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
}
ul {
  list-style-type: disc;
}
body {
  background: rgb(255, 255, 255);
  color: rgb(51, 51, 51);
  font: 12px "Noto Sans", 思源黑体;
  padding-top: 60px;
}
.title {
  font-size: 25px;
  color: #333;
  line-height: 20px;
  font-weight: bold;
  margin-bottom: 25px;
}
.food-type .title-head {
  margin-bottom: 24px;
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
.clearfix {
  zoom: 1;
}

.title-head {
  line-height: 18px;
}
.type h4 {
  float: left;
}

h1, h2, h3, h4, h5, h6 {
  font-weight: normal;
}
.food-type .type h4 a {
  cursor: auto;
  display: inline-block;
  border-radius: 4px;
  background-color: #FFF0D2;
  font-size: 20px;
  width: 152px;
  height: 56px;
  line-height: 56px;
  text-align: center;
}
.type li h5 {
  font-size: 16px;
  line-height: 15px;
  padding-top: 23px;
}
.type ul {
  float: left;
  width: 1050px;
}
ul {
  display: block;
  list-style-type: disc;
  margin-block-start: 0em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  padding-inline-start: 50px;
}
.type li {
  float: left;
  width: 68px;
  text-align: center;
  font-size: 13px;
  margin-left: 21px;
  margin-bottom: 30px;
  height: 74px;
  overflow:hidden;
  width-space:nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
}
.type .more a {
  display: inline-block;
  width: 56px;
  height: 56px;
  border-radius: 4px;
  font-size: 16px;
  color: #256dc6;
  background-color: #e6f1ff;

  line-height: 56px;

}
.menu-list {
  min-height: 600px;
margin-top: 30px;
  margin-left: 120px;
}
.menu-list li {
  width: 306px;
  height: 172px;
  border-radius: 8px;
  float: left;
  position: relative;
  margin-right: 41px;
  margin-bottom: 41px;
  overflow: hidden;

}
.menu-list .cover {
  display: block;
  width: 306px;
  height: 172px;
  overflow: hidden;

}
.menu-list img {
  display: block;
  width: 100%;
}

.wb100 {
  display: block;
  width: 100%;
}
img {
  vertical-align: bottom;
}
.menu-list .menuinfo {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,.14);
  text-align: center;
}
.absolute {
  position: absolute;
}
.menu-list .name {
  font-weight: bold;
  padding-top: 62px;
  font-size: 16px;
}

.menu-list p {
  width: 290px;
  font-size: 13px;
  color: #FFF;
  text-shadow: 0 1px 2px rgb(0 0 0 / 28%);
  margin: 0 auto;
  padding-top: 10px;
}
</style>
