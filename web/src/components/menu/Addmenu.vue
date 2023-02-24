<template>
<div>
  <div id="content" class="clearfix">
    <div class="title-head mbt30 mt30">
      <h3 style="margin: 0">创建菜单</h3>
    </div>
    <form class="operat-menu" method="post">
      <input type="hidden" name="caidan_id" value="">
      <input type="hidden" name="cover" value="">
      <input type="hidden" name="cover_width" value="">
      <input type="hidden" name="cover_height" value="">
      <el-input v-model="menuName" :placeholder="placeholder" style="margin: 0;
    height: 42px;width:690px "></el-input>
      <el-input
        type="textarea"
        :rows="8"
        :placeholder="placeholder2"
        v-model="menuIntro"
       style="width: 690px;margin-top: 20px">
      </el-input>
      <div class="adanurt-list">
        <h4 class="addtit">添加菜谱 <p>(填入食为天的食谱地址或食谱ID来添加菜谱，如http://localhost:8088/cookdetail?id=1或者1)</p>
        </h4>
        <div class="des-menu clearfix">
          <!--添加菜谱-->
        </div>
        <div>
        <el-input v-model="menuName" placeholder="" class="adanurt" type="text"></el-input>
        </div>
      </div>
      <a href="javascript:void(0)" class="add-menu" onclick="addMenu()">添加</a>
      <a class="addmenucover1" href="javascript:void(0)" onmousemove="movefile(event,'backfile')"></a>
      <el-upload
        class="cover_uploader"
        action=""
        accept="image/jpg,image/jpeg,image/png"
        :auto-upload="false"
        :show-file-list="false"
      >
        <div class="tiptxt" v-if="1">
          <i class="el-icon-plus cover_uploader_icon"></i>
          <p>添加菜单背景图（可选）</p>
        </div>
        <div  v-else  class="cover">
        </div>
      </el-upload>
      <el-row style="margin-top: 20px">
        <el-col :span="2">
          <span style="padding-top: 10px;display: block">验证码：</span>
        </el-col>
        <el-col :span="5">
          <div style="display:inline-block">
            <verify type="3" :show-button="false" @success="onVerifySuccess" @error="onVerifyError"></verify>
          </div>
        </el-col>
      </el-row>
      <input type="button" value="提交" class="submit" onclick="tijiao()">

    </form>
  </div>
</div>
</template>

<script>
import Verify from 'vue2-verify'
export default {
  name: "Addmenu",
  components:{
        Verify,
  },
  data() {
    return {
      menuName: '',
      menuIntro:'',
      placeholder: '菜单名称(必填，30字以内)',
      placeholder2: '菜单介绍(选填)',
      placeholder3: '贴心小提示~(选填)',
    }
  },
  methods:{

  }
}
</script>

<style scoped>
.operat-menu .submit {
  border: 0;
  width: 120px;
  height: 40px;
  margin-top: 28px;
  padding: 0;
  font-size: 14px;
  line-height: 40px;
  background: #84b92c;
  border-radius: 4px;
  color: #fff;
  font-weight: bold;
  cursor: pointer;
}
.cover_uploader:hover:hover {
  border-color: #409EFF;
}
.cover_uploader  {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
  background-color: #eee ;
  width: 345px;
  height: 195px;
  border-radius: 8px;
  text-align: center;
}
.cover_uploader_icon {
  font-size: 70px;
  color: #8c939d;
  width: 80px;
  height: 80px;
  line-height: 80px;
  text-align: center;
  margin-top:40px;
}
.cover {
  z-index: 3;
  width: 345px;
  height: 195px;
  overflow: hidden;
}
.tiptxt {
  text-align: center;
  color: #999;
  font-size: 15px;
  line-height: 20px;
}
#content {
  width: 1000px;
  margin: 0 auto;
}
.clearfix {
  zoom: 1;
}
.mbt30 {
  margin-bottom: 30px;
}
.title-head {
  line-height: 18px;
}
.mt30 {
  margin-top: 30px;
}
.title-head h3 {
  font-size: 18px;
  display: inline-block;
  font-weight: bold;
  color: #333;
}
.operat-menu .addtit {
  font-size: 20px;
  margin: 20px 0;
  font-weight: bold;
  line-height: 24px;
}

.operat-menu .addtit p {
  display: inline-block;
  font-size: 12px;
  color: #999;
  font-weight: normal;
}

.operat-menu .adanurt {
  width: 690px;
  height: 50px;
  line-height: 50px;
  margin-bottom: 20px;
  font-size: 15px;
  background: #fff;
  color: #333;
}
.add-menu {
  display: inline-block;
  width: 90px;
  height: 42px;
  margin-top: 5px;
  margin-bottom: 30px;
  font-size: 15px;
  line-height: 42px;
  border-radius: 4px;
  color: #fff;
  text-align: center;
  background: #84b92c;
}

a:-webkit-any-link {
  cursor: pointer;
  text-decoration: none;
}

/deep/ .el-input__inner{
  border-color:#DCDFE6;
  color: #333333;
  font: 15px Noto Sans,"思源黑体";
}
/deep/ .el-select .el-input__inner:focus {
  border-color:#DCDFE6;
}
/deep/ .el-textarea__inner{
  color:#333333;
  border-color:#DCDFE6;
  font: 15px Noto Sans,"思源黑体"
}
</style>
