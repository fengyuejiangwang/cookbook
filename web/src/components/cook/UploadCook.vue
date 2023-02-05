<template>
<div class="content">
  <el-form>
    <el-upload
      class="cover_uploader"
      action="https://jsonplaceholder.typicode.com/posts/"
      :show-file-list="false"
      :on-success="handleCoverSuccess"
      :before-upload="beforeCoverUpload">
      <img v-if="imageUrl" :src="imageUrl" class="cover">
      <i v-else class="el-icon-plus cover_uploader_icon"></i>
      <div class="tiptxt" v-if="!imageUrl">添加菜谱成品图
        <p>（建议尺寸1280*1024，支持上传图片格式有jpg、jpeg、png）</p>
      </div>
    </el-upload>
  <el-input v-model="inputName" :placeholder="placeholder1" style="margin: 20px 0;
    height: 42px;width:690px " @focus="blurSearchFor(-2)" @blur="blurSear(-2)"></el-input>
  <el-row>
  <el-select v-model="value1" placeholder="烹饪难度" style="width: 150px">
    <el-option
      v-for="item in options1"
      :key="item.value1"
      :label="item.label1"
      :value="item.value1" style="text-align:center">
    </el-option>
  </el-select>
  <el-select v-model="value2" placeholder="烹饪时间" style="width: 150px;margin-left: 10px">
    <el-option
      v-for="item in options2"
      :key="item.value2"
      :label="item.label2"
      :value="item.value2" style="text-align:center">
    </el-option>
  </el-select>
  </el-row>
  <el-input
    type="textarea"
    :rows="8"
    :placeholder="placeholder2"
    v-model="textarea" style="width: 690px;border-bottom: 1px solid #E5E3DF; padding: 20px 0;"  @focus="blurSearchFor(-1)" @blur="blurSear(-1)">
  </el-input>
  <div class="material clearfix">
    <h2>食材清单</h2>
    <div class="mlist">
      <div>
        <span class="liaotit"> 食材</span><span class="liangtit"> 用量</span>
      </div>
      <div v-for="(o,index) in inputList" :key="o">
        <el-row>
          <el-col :span="19">
            <el-input v-model="o.inputLiao" :placeholder="o.placeholder3?o.placeholder3:''" style="width: 305px;margin-top: 10px" @focus="blurSearchFor(index,o.inputId,1)" @blur="blurSear(index,o.inputId,1)"></el-input>
            <el-input v-model="o.inputLiang"  :placeholder="o.placeholder4?o.placeholder4:''" style="width: 200px;margin-left: 17px" @focus="blurSearchFor(index,o.inputId,2)" @blur="blurSear(index,o.inputId,2)"></el-input>
          </el-col>
          <el-col :span="5" style="margin-top: 10px;display: flex;flex-direction: row">
          <a href="javascript:void(0);" class="add" @click="addZhuLiao"></a>
          <a href="javascript:void(0);" class="up" @click="moveUp(index)"></a>
          <a href="javascript:void(0);" class="down" @click="moveDown(index)"></a>
          <a href="javascript:void(0);" class="wrng" @click="deleteZhuLiao(index)"></a>
          </el-col>
        </el-row>
      </div>
    </div>
    <a  href="javascript:void(0);"  @click="addZhuLiao" style="text-decoration: none;color: #256DC6">增加一栏</a>
  </div>
    <div  style="width: 690px;border-bottom: 1px solid #E5E3DF;padding-bottom: 20px;" >
      <h2>步骤 <span style="font-size:12px;font-weight:normal;">（支持上传图片格式有jpg、jpeg、png）</span></h2>
      <el-button style="background-color: #84b92c;color: white;">批量上传</el-button>
      <span  style="display: inline;font-size:12px;font-weight:normal;">按住Ctrl键可多选，为保证您的使用体验，请单次上传图片不要超过6张 </span>
       <el-row v-for="(o,index) in inputList2" :key="o" style="margin-bottom: 10px">
         <el-col  :span="7">
      <el-upload
        class="step_uploader"
        action="https://jsonplaceholder.typicode.com/posts/"
        :show-file-list="false"
        :on-success="handleCoverSuccess"
        :before-upload="beforeCoverUpload">
        <img v-if="imageUrl" :src="imageUrl" class="step">
        <i v-else class="el-icon-plus step_uploader_icon"></i>
        <div class="tiptxt" v-if="!imageUrl">添加步骤图</div>
      </el-upload>
         </el-col>
         <el-col :span="15"  style="margin-left: 10px;margin-top: 20px">
         <el-input
           type="textarea"
           :rows="9"
           v-model="o.textarea" style="width: 436px;border-bottom: 1px solid #E5E3DF;">
         </el-input>
         </el-col>
         <el-col :span="1" style="margin-top: 50px;display: flex;flex-direction: column;margin-left: 5px">
           <a href="javascript:void(0);" class="up" @click="moveUp2(index)"></a>
           <a href="javascript:void(0);" class="down" @click="moveDown2(index)"></a>
           <a href="javascript:void(0);" class="add" @click="addStep"></a>
           <a href="javascript:void(0);" class="wrng" @click="deleteStep(index)"></a>
         </el-col>
       </el-row>
      <a  href="javascript:void(0); "  @click="addStep" style="text-decoration: none;color: #256DC6">增加一栏</a>
    </div>
    <div style="width: 690px;border-bottom: 1px solid #E5E3DF;padding-bottom: 20px;">
      <h2>小贴士</h2>
      <el-input
        type="textarea"
        :rows="8"
        :placeholder="placeholder3"
        v-model="textarea3"  @focus="blurSearchFor(-3)" @blur="blurSear(-3)">
      </el-input>
    </div>
    <el-button style="background-color: #84b92c;color: white;width: 168px;height: 42px;margin-top: 20px" >上传视频</el-button>
    <el-row style="margin-top: 20px">
      <el-col :span="2">
      <span style="padding-top: 10px;display: block">验证码：</span>
      </el-col>
      <el-col :span="5">
      <el-input v-model="inputCode"></el-input>
      </el-col>
      <img src="https://www.douguo.com/captcha" alt="" style="height: 40px;
  margin-left: 20px;vertical-align: bottom;">
    </el-row>
    <el-button @click="uploadCook()" style="background-color: #84b92c;color: white;width: 168px;height: 42px;margin-top: 20px;margin-bottom: 20px" >发布</el-button>
  </el-form>
  </div>
</template>
<script>
import cookApi from "../../api/cook";
import materialApi from "../../api/material";
import stepApi from "../../api/step";
export default {
  name: "UploadCook",
  data() {
    return {
      imageUrl: '',
      inputName: '',
      inputCode:'',
      placeholder1:'菜谱名称',
      placeholder2:'这道菜背后的故事~(选填)',
      placeholder3:'贴心小提示~(选填)',
      inputList:[{
        inputId:1,
        inputLiao:'',
        inputLiang:'',
        placeholder3:'如：五花肉',
        placeholder4:'如：250g',
      },
        {
          inputId:2,
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },{
          inputId:3,
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },{
          inputId:4,
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },],
      inputList2:[{ inputId:1,
                   textarea:'',
      }
      ],
      options1: [{
        value1: '选项1',
        label1: '切墩(初级)'
      }, {
        value1: '选项2',
        label1: '配菜(中级)'
      }, {
        value1: '选项3',
        label1: '掌勺(高级)'
      }
      ],
      value1: '',
      options2: [{
        value2: '选项1',
        label2: '10分钟左右'
      }, {
        value2: '选项2',
        label2: '10-30分钟'
      }, {
        value2: '选项3',
        label2: '30-60分钟'
      }, {
        value2: '选项4',
        label2: '1小时以上'
      }],
      value2: '',
      textarea: '',
      textarea3:'',
    };
  },
  methods: {
    //获取焦点时触发
    blurSearchFor(i,inputId,j){
      if(i==-3) {
        if (this.placeholder3 == '贴心小提示~(选填)')
          this.placeholder3 = '';
      }
     else if(i==-2) {
        if (this.placeholder1 == '菜谱名称')
          this.placeholder1 = '';
      }
      else if(i==-1) {
        if (this.placeholder2 == '这道菜背后的故事~(选填)')
          this.placeholder2 = '';
      }
      else {
        if (this.inputList[i].placeholder3 == '如：五花肉' && j == 1&& inputId == 1)
          this.inputList[i].placeholder3 = '';
        if (this.inputList[i].placeholder4 == '如：250g' && j == 2&& inputId == 1)
          this.inputList[i].placeholder4 = '';
      }
    },
    //失去焦点时触发
    blurSear(i,inputId,j){
      if(i==-3){
        this.placeholder3='贴心小提示~(选填)';
      }
      else if(i==-2)
       this.placeholder1='菜谱名称';
      else if(i==-1)
        this.placeholder2='这道菜背后的故事~(选填)';
      else {
        if (j == 1&& inputId == 1)
          this.inputList[i].placeholder3 = '如：五花肉';
        if (j == 2&& inputId == 1)
          this.inputList[i].placeholder4 = '如：250g';
      }
    },
    addZhuLiao(){
        this.inputList.push({
          inputId:this.inputList.length+1,
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        })
    },
    addStep(){
      this.inputList2.push({
        inputId:this.inputList2.length+1,
      })
    },
    deleteZhuLiao(index){
      this.inputList.splice(index, 1)
    },
    deleteStep(index){
      this.inputList2.splice(index, 1)
    },
    moveUp(index){
      if (index != 0) {
        this.inputList[index] =  this.inputList.splice(index-1, 1, this.inputList[index])[0];
      }
    },
    moveUp2(index){
      if (index != 0) {
        this.inputList2[index] =  this.inputList2.splice(index-1, 1, this.inputList2[index])[0];
      }
    },
   moveDown(index) {
     if (index != this.inputList.length - 1) {
       this.inputList[index] =  this.inputList.splice(index+1, 1, this.inputList[index])[0];
     }
   },
    moveDown2(index) {
      if (index != this.inputList2.length - 1) {
        this.inputList2[index] =  this.inputList2.splice(index+1, 1, this.inputList2[index])[0];
      }
    },
    beforeCoverUpload(file) {
      const isJPG = file.type === 'image/jpeg';
      const isPNG = file.type === 'image/png';
      const isLt2M = file.size / 1024 / 1024 < 2;
      if (!isJPG&&!isPNG) {
        this.$message.error('上传图片只能是 JPG/JPEG/PNG 格式!');
      }
      if (!isLt2M) {
        this.$message.error('上传图片大小不能超过 2MB!');
      }
      return (isJPG||isPNG) && isLt2M;
    },
    handleCoverSuccess(res, file) {
      this.imageUrl = URL.createObjectURL(file.raw);
    },
    getNowTime()//获取当前时间
    {
      let date = new Date();
      //年 getFullYear()：四位数字返回年份
      let year = date.getFullYear();  //getFullYear()代替getYear()
      //月 getMonth()：0 ~ 11
      let month = date.getMonth() + 1;
      //日 getDate()：(1 ~ 31)
      let day = date.getDate();
      //时 getHours()：(0 ~ 23)
      let hour = date.getHours();
      //分 getMinutes()： (0 ~ 59)
      let minute = date.getMinutes();
      //秒 getSeconds()：(0 ~ 59)
      let second = date.getSeconds();
      let time = year + '-' + this.addZero(month) + '-' + this.addZero(day) + ' ' + this.addZero(hour) + ':' + this.addZero(minute) + ':' + this.addZero(second);
      return time;
    },
    async uploadCook(){
      let res = await cookApi.uploadCookInfo(
        {cookTitle:this.inputName,
                cover:this.imageUrl,
                diff:this.value1,
                cookTime:this.value2,
                description:this.textarea,
                skill:this.textarea3,
                createTime:this.getNowTime(),
                status:1,
      });
      res = res.data;
      let res2 = await materialApi.uploadMaterial(
        {cookId:res.data.id,

        });
      res2 = res2.data;
      let res3 = await stepApi.uploadStep(
        {

        });
      res3= res3.data;
      if (res.code == 200&&res2.code==200&&res3.code==200) {
        this.$message.success(res.message);
      }
    },

  }
}
</script>

<style scoped>
.content {
  width: 1000px;
  margin: 0 auto;
}
.cover_uploader  {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
  margin-top: 20px;
  background-color: #eee ;
  width: 690px;
  height: 390px;
  border-radius: 8px;
  text-align: center;
}
.step_uploader  {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
  margin-top: 20px;
  background-color: #eee ;
  width: 200px;
  height: 200px;
  border-radius: 8px;
  text-align: center;
}
.cover_uploader:hover,.step_uploader:hover {
  border-color: #409EFF;
}
.cover_uploader_icon {
  font-size: 70px;
  color: #8c939d;
  width: 80px;
  height: 80px;
  line-height: 80px;
  text-align: center;
  margin-top:120px;
}
.step_uploader_icon {
  font-size: 70px;
  color: #8c939d;
  width: 80px;
  height: 80px;
  line-height: 80px;
  text-align: center;
  margin-top: 50px;
}
.cover {
  width: 80px;
  height: 80px;
  display: block;
}
.step{
  width: 80px;
  height: 80px;
  display: block;
}
.tiptxt {
  text-align: center;
  color: #999;
  font-size: 15px;
  line-height: 20px;
}
.tiptxt p {
  font-size: 13px;
}
.material {
  border-bottom: 1px solid #E5E3DF;
  padding: 20px 0;
  margin-top: -20px;
  width: 690px;
}
.clearfix {
  zoom: 1;
}
.material h2 {
  font-size: 20px;
  color: #333;
  font-weight: bold;
}
.material .mlist {
  margin: 20px 0 10px;
  background: #F1F7FA;
  border-radius: 8px;
}
.material > div {
  padding: 20px 0 20px 12px;
}
.material .liaotit {
  width: 305px;
  margin-right: 16px;
  display: inline-block;
  font-size: 14px;
  padding-left: 5px;
}
.material .liangtit {
  width: 200px;
  display: inline-block;
  font-size: 14px;
  padding-left: 5px;
}
 .add {
  margin-left: 20px;
  background-image: url("https://cp1.douguo.com/static/static/nweb/images/addstep.png ");
  background-size: 24px;
  width: 24px;
  height: 24px;
  display: block;
  margin-left: 8px;
  margin-top: 8px;
}
.up {
  margin-left: 20px;
  background-image: url("https://cp1.douguo.com/static/static/nweb/images/moveup.png ");
  background-size: 24px;
  width: 24px;
  height: 24px;
  display: block;
  margin-left: 8px;
  margin-top: 8px;
}
.down {
  margin-left: 20px;
  background-image: url("https://cp1.douguo.com/static/static/nweb/images/movedown.png");
  background-size: 24px;
  width: 24px;
  height: 24px;
  display: block;
  margin-left: 8px;
  margin-top: 8px;
}
.wrng {
  margin-left: 20px;
  background-image: url("https://cp1.douguo.com/static/static/nweb/images/delete.png");
  background-size: 24px;
  width: 24px;
  height: 24px;
  display: block;
  margin-left: 8px;
  margin-top: 8px;
}

/deep/ .el-input__inner{
  border-color:#DCDFE6;
  color: #333333;
}
/deep/ .el-select .el-input__inner:focus {
  border-color:#DCDFE6;
}
/deep/ .el-textarea__inner{
  color:#333333;
  font-weight: bold;
  border-color:#DCDFE6;
}

</style>
