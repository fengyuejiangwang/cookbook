<template>
  <div id="content" >
    <div class="type-tab">

        <el-tabs  v-model="activeName" @tab-click="handleClick">
          <el-tab-pane label="精选" name="精选">
            <el-container>
          <h2 class="title">精选推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in cookList" :key="item">
              <li class="item">
                <a class="cover" @click="click(item.id)" target="_blank" >
                  <img :src="item.cover" :alt="item.cookTitle">
                </a>
                  <div>
                    <router-link class="cookname text-lips" to="" target="_blank">{{item.cookTitle}}</router-link>
                  </div>
                <div style="display: flex;">
                  <div style="float: left">
                  <router-link class="author text-lips" to="" target="_blank">
                    <img :src="userList[index].avatar" alt="">&nbsp;&nbsp;&nbsp;{{userList[index].username}}
                  </router-link>
                  </div>
                  <div style="float: left;margin-left: 150px" class="view-coll" >
                    <span v-if="item.views>10000"class="view">{{(item.views/10000).toFixed(1)}}万&nbsp;</span>
                    <span v-else class="view">{{item.views}}&nbsp;</span>
                    <span v-if="item.collections>10000" class="collect">{{(item.collections/10000).toFixed(1)}}万</span>
                    <span v-else class="collect">{{item.collections}}&nbsp;</span>
                  </div>
                </div>
              </li>
            </rol>

          </ul>
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
            </el-container>
          </el-tab-pane>
          <el-tab-pane label="功能性调理" name="功能性调理">
            <h2 class="title">功能性调理推荐菜谱 </h2>
            <ul id="jxlist" style="margin-left:-40px;" >
              <rol v-for="(item,index) in cookList" :key="item">
                <li class="item">
                  <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                    <img :src="item.cover" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                  </a>
                  <div  style="position:relative; ">

                    <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">{{item.cookTitle}}</a>
                    <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                      <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                    </a>
                    <span class="view" style="position:relative; left: 70px;bottom:3px">👁{{item.views}}</span>
                    <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐{{item.collections}}</span>
                  </div>
                </li>
              </rol>
            </ul>
          </el-tab-pane>
          <el-tab-pane label="人群膳食" name="人群膳食">
          <h2 class="title">人群膳食推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in cookList" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img :src="item.cover" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div  style="position:relative; ">

                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">{{item.cookTitle}}</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁{{item.views}}</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐{{item.collections}}</span>
                </div>
              </li>
            </rol>
          </ul>
        </el-tab-pane>
          <el-tab-pane label="疾病调理" name="疾病调理">
          <h2 class="title">疾病调理推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in cookList" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img :src="item.cover" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div  style="position:relative; ">

                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">{{item.cookTitle}}</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁{{item.views}}</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐{{item.collections}}</span>
                </div>
              </li>
            </rol>
          </ul>
        </el-tab-pane>
          <el-tab-pane label="功效营养" name="功效营养">
          <h2 class="title">功效营养推荐菜谱 </h2>
          <ul id="jxlist" style="margin-left:-40px;" >
            <rol v-for="(item,index) in cookList" :key="item">
              <li class="item">
                <a class="cover" href="/cookbook/3238919.html" target="_blank" >
                  <img :src="item.cover" alt="#一蔬一饭皆告白#鸡汁蘑菇炖豆腐">
                </a>
                <div  style="position:relative; ">
                  <a class="cookname text-lips" href="/cookbook/3238919.html" target="_blank">{{item.cookTitle}}</a>
                  <a class="author text-lips" href="/u/u65632148820379.html" target="_blank">
                    <img src="https://tx1.douguo.com/upload/photo/9/5/b/70_u65632148820379114034.jpg" alt="白金项链123"> 白金项链123
                  </a>
                  <span class="view" style="position:relative; left: 70px;bottom:3px">👁{{item.views}}</span>
                  <span class="collect" style="position: relative;left: 60px;bottom:3px" >⭐{{item.collections}}</span>
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
import cookApi from "../../api/cook";
import userApi from "../../api/user"
export default {
  name: "Cook",
  data(){
    return{
      activeName: '精选',
      cookList:[],
      userList:[],
      uidList:[],
      pageInfo: {
        pageNo: 1,
        pageSize: 9,
        total: 0,
      },
      cooktype:'精选',
    }

  },
  created() {
    this.getCookList();

  },
  methods:{
    click(vall){
      this.$router.push({name: "菜谱详情", query: {id: vall}})
    },
    async getCookList() {
      let res = await cookApi.getCookList({pageNo: this.pageInfo.pageNo, pageSize: this.pageInfo.pageSize});
      res = res.data;
      if (res.success) {
        this.cookList = res.data.records;
        this.pageInfo.total = res.data.total;
        let uidList=[];
       for(let i=0;i<this.cookList.length;i++){
        uidList.push({id:this.cookList[i].userId});
        }
        let res2=await userApi.getUserList(uidList);
        res2=res2.data;
        if(res2.code==200){
              this.userList=res2.data;
        }
      }
    },
    async getCookListByType() {
      let res = await cookApi.getCookListByType({pageNo: this.pageInfo.pageNo, pageSize: this.pageInfo.pageSize,type:this.cooktype});
      res = res.data;
      if (res.success) {
        this.cookList = res.data.records;
        this.pageInfo.total = res.data.total;
      }
    },
    handleClick(tab) {
      this.cooktype = tab.name;
      this.pageInfo.pageNo = 1;
      if (this.cooktype === "精选")
        this.getCookList();
      else
        this.getCookListByType();
    },
    // 页面数量改变后查询处理
    handleSizeChange(val) {
      this.pageinfo.pageSize = val;
      if (this.cooktype === "精选")
        this.getCookList();
      else
        this.getCookListByType();
    },
    // 页码改变后查询处理
    handleCurrentChange(val) {
      this.pageInfo.pageNo = val;
      if (this.cooktype === "精选")
        this.getCookList();
      else
        this.getCookListByType();
    }
  },
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

 .item {
  float: left;
  width: 300px;
  height: 255px;
  overflow: hidden;
  margin: 0 30px 40px 0;
}
 .cover {
  width: 300px;
  height: 200px;
  overflow: hidden;
  border-radius: 8px;
  display: block;
  background: #F9F9F9;
}
 .cover img {
  width: 300px;
  height: 200px;
}
img {
  vertical-align: bottom;
}
.cookname {
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
 .author {
  display: inline-block;
  height: 20px;
  line-height: 20px;
  font-size: 12px;
}
 .author img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  vertical-align: bottom;
}
.view-coll {
  font-size: 12px;
  line-height: 20px;
}
 .view::before {
  width: 17px;
  height: 12px;
  background:url(https://cp1.douguo.com/static/static/nweb/images/view2.png?2);
}

 .collect::before {
  width: 14px;
  height: 13px;
  background: url(https://cp1.douguo.com/static/static/nweb/images/collect2.png?2);
}

 .view::before, .collect::before {
  content: '';
  display: inline-block;
  vertical-align: middle;
  margin-right: 2px;
  position: relative;
  top: -1px;
}
</style>
