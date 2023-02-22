<template>
  <div id="content" >
    <div class="type-tab">

        <el-tabs  v-model="activeName" @tab-click="handleClick">
          <el-tab-pane label="精选" name="精选">
          <h2 class="title">精选推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in 3" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img src="https://cp1.douguo.com/upload/caiku/c/0/2/400x266_c0152c653d908c6ce6a2fc25246e31a2.jpg" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div  style="position:relative; ">

                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">#一蔬一饭皆告白#鸡汁蘑菇炖豆腐</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                    <span class="view" style="position:relative; left: 70px;bottom:3px">👁4037</span>
                    <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐113</span>
                </div>
              </li>
            </rol>
          </ul>
          </el-tab-pane>
          <el-tab-pane label="功能性调理" name="功能性调理">
            <h2 class="title">功能性调理推荐菜谱 </h2>
            <ul id="jxlist" style="margin-left:-40px;" >
              <rol v-for="(item,index) in 3" :key="item">
                <li class="item">
                  <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                    <img src="https://cp1.douguo.com/upload/caiku/c/0/2/400x266_c0152c653d908c6ce6a2fc25246e31a2.jpg" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                  </a>
                  <div class="relative">
                    <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">#一蔬一饭皆告白#鸡汁蘑菇炖豆腐</a>
                    <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                      <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                    </a>
                    <span class="view" style="position:relative; left: 70px;bottom:3px">👁4037</span>
                    <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐113</span>
                  </div>
                </li>
              </rol>
            </ul>
          </el-tab-pane>
          <el-tab-pane label="人群膳食" name="人群膳食">
          <h2 class="title">人群膳食推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in 3" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img src="https://cp1.douguo.com/upload/caiku/c/0/2/400x266_c0152c653d908c6ce6a2fc25246e31a2.jpg" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div class="relative">
                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">#一蔬一饭皆告白#鸡汁蘑菇炖豆腐</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁4037</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐113</span>
                </div>
              </li>
            </rol>
          </ul>
        </el-tab-pane>
          <el-tab-pane label="疾病调理" name="疾病调理">
          <h2 class="title">疾病调理推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in 3" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img src="https://cp1.douguo.com/upload/caiku/c/0/2/400x266_c0152c653d908c6ce6a2fc25246e31a2.jpg" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div class="relative">
                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">#一蔬一饭皆告白#鸡汁蘑菇炖豆腐</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁4037</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐113</span>
                </div>
              </li>
            </rol>
          </ul>
        </el-tab-pane>
          <el-tab-pane label="功效营养" name="功效营养">
          <h2 class="title">功效营养推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in 3" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img src="https://cp1.douguo.com/upload/caiku/c/0/2/400x266_c0152c653d908c6ce6a2fc25246e31a2.jpg" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div class="relative">
                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">#一蔬一饭皆告白#鸡汁蘑菇炖豆腐</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁4037</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐113</span>
                </div>
              </li>
            </rol>
          </ul>
        </el-tab-pane>
        </el-tabs>

    </div>

    </div>
</template>

<script>
export default {
  name: "Cook"
}
</script>

<style scoped>
#content {
  width: 1000px;
  margin: 0 auto;
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
.type-head a {
  display: inline-block;
  float: left;
  color: #383830;
  height: 42px;
  line-height: 42px;
  margin-right: 30px;
}
a {
  color: #333;
  text-decoration: none;
}
.type-head {
  font-size: 14px;
  text-align: center;
  width: auto;
  margin: 0 auto;
  display: inline-block;
}
h2 {
  display: block;
  font-size: 1.5em;
  margin-block-start: 0.83em;
  margin-block-end: 0.83em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
}
.title {
  font-size: 20px;
  color: #333;
  line-height: 20px;
  font-weight: bold;
  margin-bottom: 25px;
}
ol, ul, li {
  list-style: none;
}

#jxlist .item {
  float: left;
  width: 300px;
  height: 255px;
  overflow: hidden;
  margin: 0 30px 40px 0;
}
#jxlist .cover {
  width: 300px;
  height: 200px;
  overflow: hidden;
  border-radius: 8px;
  display: block;
  background: #F9F9F9;
}
#jxlist .cover img {
  width: 300px;
}
img {
  vertical-align: bottom;
}
#jxlist .cookname {
  display: block;
  font-size: 15px;
  color: #333;
  line-height: 15px;
  padding: 10px 0;
}

.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
#jxlist .author {
  display: inline-block;
  height: 20px;
  line-height: 20px;
  font-size: 12px;
}

.text-lips {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
#jxlist .author img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  vertical-align: bottom;
}


#jxlist .view::before {
  width: 17px;
  height: 12px;
  background:url(../../assets/eyes.png?2);
}

#jxlist .collect::before {
  width: 14px;
  height: 13px;
  background: url(../../assets/eyes.png?2);
}

#jxlist .view::before, .collect::before {
  content: '';
  display: inline-block;
  vertical-align: middle;
  margin-right: 2px;
  position: relative;
  top: -1px;
}
</style>
