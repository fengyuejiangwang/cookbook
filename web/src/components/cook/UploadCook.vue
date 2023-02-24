<template>
<div class="content">
  <el-form>
    <div class="draft-tip mt20" style="display: block;" v-if="imageUrl"><span>已保存到云端</span></div>
    <el-upload
      class="cover_uploader"
      action=""
      accept="image/jpg,image/jpeg,image/png"
      :auto-upload="false"
      :show-file-list="false"
      :on-change="handleCoverChange"
    >
      <div class="tiptxt" v-if="!imageUrl">
        <i class="el-icon-plus cover_uploader_icon"></i>
        <p>添加菜谱成品图</p>
        <p>（建议尺寸1280*1024，支持上传图片格式有jpg、jpeg、png）</p>
      </div>
      <div  v-else :style="cover" class="cover">
      </div>
    </el-upload>
  <el-input v-model="inputName" :placeholder="placeholder1" style="margin: 20px 0;
    height: 42px;width:690px " @focus="focus(1)" @blur="blur(1)"></el-input>
  <el-row>
  <el-select v-model="value1" placeholder="烹饪难度" style="width: 150px">
    <el-option
      v-for="item in options1"
      :key="item.value1"
      :value="item.value1" style="text-align:center">
    </el-option>
  </el-select>
  <el-select v-model="value2" placeholder="烹饪时间" style="width: 150px;margin-left: 10px">
    <el-option
      v-for="item in options2"
      :key="item.value2"
      :value="item.value2" style="text-align:center">
    </el-option>
  </el-select>
  </el-row>
  <el-input
    type="textarea"
    :rows="8"
    :placeholder="placeholder2"
    v-model="textarea" style="width: 690px;border-bottom: 1px solid #E5E3DF; padding: 20px 0;"  @focus="focus(2)" @blur="blur(2)">
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
            <el-input v-model="o.inputLiao" :placeholder="o.placeholder3?o.placeholder3:''" style="width: 305px;margin-top: 10px" @focus="focus(3,index)" @blur="blur(3,index)"></el-input>
            <el-input v-model="o.inputLiang"  :placeholder="o.placeholder4?o.placeholder4:''" style="width: 200px;margin-left: 17px" @focus="focus(4,index)" @blur="blur(4,index)"></el-input>
          </el-col>
          <el-col :span="5" style="margin-top: 10px;display: flex;flex-direction: row">
          <a href="javascript:void(0);" class="add" @click="addZhuLiao(1,index)"></a>
          <a href="javascript:void(0);" class="up" @click="moveUp(index)"></a>
          <a href="javascript:void(0);" class="down" @click="moveDown(index)"></a>
          <a href="javascript:void(0);" class="wrng" @click="deleteZhuLiao(index)"></a>
          </el-col>
        </el-row>
      </div>
    </div>
    <a  href="javascript:void(0);"  @click="addZhuLiao(2)" style="text-decoration: none;color: #256DC6">增加一栏</a>
  </div>
    <div  style="width: 690px;border-bottom: 1px solid #E5E3DF;padding-bottom: 20px;" >
      <h2>步骤 <span style="font-size:12px;font-weight:normal;">（支持上传图片格式有jpg、jpeg、png）</span></h2>
        <el-upload
          action=""
          :auto-upload="false"
          accept="image/jpg,image/jpeg,image/png"
          :show-file-list="false"
          :on-change="handleStepChange2"
          multiple>
          <el-button  style="background-color: #84b92c;color: white;">批量上传
          </el-button>
          <span  style="display: inline;font-size:12px;font-weight:normal;">按住Ctrl键可多选，为保证您的使用体验，请单次上传图片不要超过6张 </span>
        </el-upload>
       <el-row v-for="(o,index) in inputList2" :key="o" style="margin-bottom: 10px">
         <el-col  :span="7">
      <el-upload
        class="step_uploader"
        action=""
        accept="image/jpg,image/jpeg,image/png"
        :auto-upload="false"
        :show-file-list="false"
        :on-change="handleStepChange"
        >
        <div class="tiptxt" v-if="!o.imageUrl"  @click="upId=index">
          <i class="el-icon-plus step_uploader_icon"></i>
          <p>添加步骤图</p>
        </div>
        <div  v-else :style="stepStyle[index]" class="step">
        </div>
      </el-upload>
         </el-col>
         <el-col :span="15"  style="margin-left: 10px;margin-top: 20px">
         <el-input
           type="textarea"
           :rows="9"
           v-model="o.textarea" style="width: 436px;"
           @focus="focus(6,index)">
         </el-input>
         </el-col>
         <el-col :span="1" style="margin-top: 50px;display: flex;flex-direction: column;margin-left: 5px">
           <a href="javascript:void(0);" class="up" @click="moveUp2(index)"></a>
           <a href="javascript:void(0);" class="down" @click="moveDown2(index)"></a>
           <a href="javascript:void(0);" class="add" @click="addStep(1,index)"></a>
           <a href="javascript:void(0);" class="wrng" @click="deleteStep(index)"></a>
         </el-col>
       </el-row>
      <a  href="javascript:void(0); "  @click="addStep(2)" style="text-decoration: none;color: #256DC6">增加一栏</a>
    </div>
    <div style="width: 690px;border-bottom: 1px solid #E5E3DF;padding-bottom: 20px;">
      <h2>小贴士</h2>
      <el-input
        type="textarea"
        :rows="8"
        :placeholder="placeholder3"
        v-model="textarea3"  @focus="focus(5)" @blur="blur(5)">
      </el-input>
    </div>
    <el-upload
      action=""
      :auto-upload="false"
      accept="video/mp4,video/quicktime,type/x-msvideo"
      :show-file-list="false"
      :on-change="handleVideoChange"
      v-show="!video||video==-1">
      <el-button style="background-color: #84b92c;color: white;width: 168px;height: 42px;margin-top: 20px" >上传视频</el-button>
    </el-upload>
    <el-row v-if="video">
      <p v-if="video!=-1">视频已上传成功，可以发布啦</p>
        <el-col :span="3">
      <el-upload
        action=""
        :auto-upload="false"
        accept="video/mp4,video/quicktime,type/x-msvideo"
        :show-file-list="false"
        :on-change="handleVideoChange"
        v-show="video!=-1">
        <el-button  @click="video=-1" style="display:inline-block;background: #84b92c; padding: 12px;font-size: 16px;color: #ffffff;border-radius: 4px;text-decoration: none;">重新选择视频</el-button>
      </el-upload>
      </el-col>
      <el-col :span="21">
        <el-button v-if="video!=-1" @click="video=''" style="display:inline-block;background: #84b92c; padding: 12px;font-size: 16px;color: #ffffff;border-radius: 4px;text-decoration: none">删除视频</el-button>
      </el-col >
    </el-row>
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
    <el-button @click="uploadCook" style="background-color: #84b92c;color: white;width: 168px;height: 42px;margin-top: 20px;margin-bottom: 20px" >发布</el-button>
  </el-form>
  </div>
</template>
<script>
import cookApi from "../../api/cook";
import materialApi from "../../api/material";
import stepApi from "../../api/step";
import uploadApi from "../../api/files";
import Verify from 'vue2-verify'
import imageConversion from "image-conversion";
export default {
  name: "UploadCook",
  components: {
    Verify,
  },
  data() {
    return {
      imageUrl: '',
      video:'',
      inputName: '',
      inputCode:'',
      placeholder1:'菜谱名称',
      placeholder2:'这道菜背后的故事~(选填)',
      placeholder3:'贴心小提示~(选填)',
      inputList:[{
        inputLiao:'',
        inputLiang:'',
        placeholder3:'如：五花肉',
        placeholder4:'如：250g',
      },
        {
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },
        {
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },{
          inputLiao:'',
          inputLiang:'',
          placeholder3:'',
          placeholder4:'',
        },],
      inputList2:[{
                    imageUrl: '',
                    textarea:'',
      }
      ],
      options1: [{
        value1: '切墩(初级)',
      }, {
        value1: '配菜(中级)',
      }, {
        value1: '掌勺(高级)',
      }
      ],
      value1: '',
      options2: [{
        value2: '10分钟左右',
      }, {
        value2: '10-30分钟',
      }, {
        value2: '30-60分钟',
      }, {
        value2: '1小时以上',
      }],
      value2: '',
      textarea: '',
      textarea3:'',
      materials:[],
      steps:[],
      cover:{
        // 背景图片是否重复
        backgroundRepeat: 'no-repeat',
        // 背景图片大小
        backgroundSize: 'cover',
        // 背景图片位置
        backgroundPosition: 'center center'
      },
      stepStyle:[],
      upId:'',
      coverFile:[],
      stepFileList:[],
      videoFile:[],
      verify:false,
    };
  }
  ,
  methods: {
    //获取焦点时触发
    focus(j,i){
        switch (j) {
          case 1:
            this.placeholder1 = '';
            break;
          case 2:
            this.placeholder2 = '';
            break;
          case 3:
            this.inputList[i].placeholder3 = '';
            if(i+1==this.inputList.length)
              this.addZhuLiao(2);
            break;
          case 4:
            this.inputList[i].placeholder4 = '';
            break;
          case 5:
            this.placeholder3 = '';
            break;
          case 6:
            if(i+1==this.inputList2.length)
            this.addStep(2);
            break;
        }
    },
    //失去焦点时触发
    blur(j,i){
        switch (j) {
          case 1:
            this.placeholder1 = '菜谱名称';
            break;
          case 2:
            this.placeholder2 = '这道菜背后的故事~(选填)';
            break;
          case 3:
              if(i == 0)
                this.inputList[i].placeholder3 = '如：五花肉';
            break;
          case 4:
            if(i == 0)
                this.inputList[i].placeholder4 = '如：250g';
            break;
          case 5:
            this.placeholder3 = '贴心小提示~(选填)';
            break;
        }
    },
    addZhuLiao(j,index){
        if(j==1)
          this.inputList.splice(index+1,0,{
            inputLiao:'',
            inputLiang:'',
            placeholder3:'',
            placeholder4:'',
          });
        if(j==2)
          this.inputList.push({
            inputLiao:'',
            inputLiang:'',
            placeholder3:'',
            placeholder4:'',
          });
    },
    addStep(j,index){
        if(j==1)
          this.inputList2.splice(index+1,0,{
            imageUrl: '',
            textarea:'',
          });
      if(j==2)
          this.inputList2.push({
            imageUrl: '',
            textarea:'',
          });
    },
    deleteZhuLiao(index){
      if(this.inputList.length!=1)
          this.inputList.splice(index, 1);
    },
    deleteStep(index){
      if(this.inputList2.length!=1)
          this.inputList2.splice(index, 1);
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
    uploadByThumbnail(file) {
      const imageConversion = require("image-conversion");
     return new Promise((resolve) => {
        imageConversion.compress(file, {
          quality: 0.7, //图片压缩质量
          type: 'image/jpeg',
          scale: 0.7, //相对于原始图片的缩放比率,设置config.scale后会覆盖config.width和config.height的设置；
        }).then(res => {
          resolve(res);
          this.coverFile.push(res);
        });
      })
    },
    handleCoverChange(file){
      const isJPG = file.raw.type === 'image/jpeg';
      const isPNG = file.raw.type === 'image/png';
      const isLt8M = file.raw.size / 1024 / 1024 < 8;
      const isLt10M = file.raw.size / 1024 / 1024 < 10;
      if (!isJPG&&!isPNG) {
        this.$message.error({
          message:'上传图片只能是 JPG/JPEG/PNG 格式!',
          center: true,
          offset: 300
        });
        return ;
      }
      if (!isLt10M) {
        this.$message.error({
          message:'上传图片大小不能超过 10MB!',
          center: true,
          offset: 300
        });
        return ;
      }
     if(!isLt8M){//大于8M，压缩图片
       this.uploadByThumbnail(file.raw);
       }
     else{
       this.coverFile.push(file.raw);
     }
      this.imageUrl = URL.createObjectURL(file.raw);
      this.cover['backgroundImage'] = 'url(' + this.imageUrl +')';
    },
    handleStepChange(file) {
      const isJPG = file.raw.type === 'image/jpeg';
      const isPNG = file.raw.type === 'image/png';
      const isLt8M = file.raw.size / 1024 / 1024 < 8;
      const isLt10M = file.raw.size / 1024 / 1024 < 10;
      if (!isJPG&&!isPNG) {
        this.$message.error({
          message:'上传图片只能是 JPG/JPEG/PNG 格式!',
          center: true,
          offset: 300
        });
        return ;
      }
      if (!isLt10M) {
        this.$message.error({
          message:'上传图片大小不能超过 10MB!',
          center: true,
          offset: 300
        });
        return ;
      }
      if(!isLt8M){//大于8M，压缩图片
        this.uploadByThumbnail(file.raw);
      }else
        this.stepFileList.push(file.raw);
      let step={};
      let stepStyle={};
      step['imageUrl']= URL.createObjectURL(file.raw);
      step['textarea']='';
      stepStyle['backgroundRepeat']='no-repeat';
      stepStyle['backgroundSize']='cover';
      stepStyle['backgroundPosition']='center center';
      stepStyle['backgroundImage']='url('+URL.createObjectURL(file.raw)+')';
        if (this.inputList2[0].imageUrl=='') {
          this.inputList2.splice(0, 1, step);
        }
        else {
          this.inputList2.splice(this.upId, 0, step);
          this.inputList2.splice(this.inputList2.length-1, 1);
        }
        this.stepStyle.splice(this.upId, 0, stepStyle);
      },
    handleStepChange2(file) {
      const isJPG = file.raw.type === 'image/jpeg';
      const isPNG = file.raw.type === 'image/png';
      const isLt8M = file.raw.size / 1024 / 1024 < 8;
      const isLt10M = file.raw.size / 1024 / 1024 < 10;
      if (!isJPG&&!isPNG) {
        this.$message.error({
          message:'上传图片只能是 JPG/JPEG/PNG 格式!',
          center: true,
          offset: 300
        });
        return ;
      }
      if (!isLt10M) {
        this.$message.error({
          message:'上传图片大小不能超过 10MB!',
          center: true,
          offset: 300
        });
        return ;
      }
      if(!isLt8M){//大于8M，压缩图片
        this.uploadByThumbnail(file.raw);
      }else
        this.stepFileList.push(file.raw);
      let step={};
      let stepStyle={};
      step['imageUrl']= URL.createObjectURL(file.raw);
      step['textarea']='';
      stepStyle['backgroundRepeat']='no-repeat';
      stepStyle['backgroundSize']='cover';
      stepStyle['backgroundPosition']='center center';
      stepStyle['backgroundImage']='url('+URL.createObjectURL(file.raw)+')';
      if (this.inputList2[0].imageUrl=='')
        this.inputList2.splice(0, 1, step);
      else
        this.inputList2.splice(this.inputList2.length, 0, step);
      this.stepStyle.splice(this.inputList2.length-1, 0, stepStyle);
    },
    handleVideoChange(file) {
      if (navigator.appName == "Microsoft Internet Explorer" && parseInt(navigator.appVersion.split(";")[1].replace(/[ ]/g, "").replace("MSIE", "")) < 10) {
        alert('您的浏览器版本过低，不能上传视频。请下载IE10及以上版本，或者更换浏览器');
        return ;
      }
      if(file) {
        if (file.raw.type != "" && (file.raw.type == 'video/mp4' || file.raw.type == 'video/quicktime' || file.raw.type == 'type/x-msvideo')) {
          if (file.raw.size > 1024 * 1024 * 1024) {//check size
            this.$message.error({
              message: '上传视频大小不能超过 1GB!',
              center: true,
              offset: 300
            });
            return;
          }
        } else {
          this.$message.error({
            message: '上传的视频只能是 MP4/quicktime/x-msvideo 格式!',
            center: true,
            offset: 300
          });
          return;
        }
      }
     else{
          this.$message.error({
          message: '您的浏览器不支持上传视频，请更换浏览器!',
          center: true,
          offset: 300
        });
        return;
      }
      this.video=URL.createObjectURL(file.raw);
      this.videoFile.push(file.raw);
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
    addZero(s) {
      return s < 10 ? ('0' + s) : s;
    },
    getMaterials() {
      this.materials=[];
      for(let i=0;i<this.inputList.length;i++) {
        if (this.inputList[i].inputLiao!='') {
          let material = {};
          material["foodName"] = this.inputList[i].inputLiao;
          material["consumption"] = this.inputList[i].inputLiang;
          this.materials.push(material);
        }
      }
    },
    getSteps(){
      this.steps=[];
      for(let i=0;i<this.inputList2.length;i++){
        if(this.inputList2[i].imageUrl!='') {
          let step = {};
          step["picture"] = this.inputList2[i].imageUrl;
          step["description"] = this.inputList2[i].textarea;
          this.steps.push(step);
        }
      }
    },
    async uploadCook() {
        this.getMaterials();
        this.getSteps();
        if (this.imageUrl == '') {
          this.$message.info({
            message: '请选择封面图片',
            center: true,
            offset: 300
          })
        } else if (this.inputName == '') {
          this.$message.info({
            message: '请输入正确的菜谱名称',
            center: true,
            offset: 300
          });
        } else if (this.materials.length == 0) {
          this.$message.info({
            message: '请选择主料',
            center: true,
            offset: 300
          });
        } else if (this.steps.length == 0) {
          this.$message.info({
            message: '请上传步骤图',
            center: true,
            offset: 300
          });
        }else if(!this.verify){
          this.$message.info({
            message: '请先完成验证',
            center: true,
            offset: 300
          });
        }
        else {
          let set = new Set(this.coverFile);
          this.coverFile = [...set];
          let resCover = await uploadApi.upload(this.coverFile);
          resCover=resCover.data;
          if(resCover.code==200)
            this.imageUrl=resCover.data[0];
          let set2 = new Set(this.stepFileList);
          this.stepFileList = [...set2];
            let resStep = await uploadApi.upload(this.stepFileList);
              resStep=resStep.data;
            if(resStep.code==200) {
              for(let i=0;i<resStep.data.length;i++)
              this.steps[i].picture =resStep.data[i] ;
            }
          let set3 = new Set(this.videoFile);
          this.coverFile = [...set3];
          let resVideo = await uploadApi.upload(this.videoFile);
            resVideo=resVideo.data;
            if(resVideo.code==200)
                this.video=resVideo.data[0];
          let res = await cookApi.uploadCookInfo(
            {
              userId: 3,
              cookTitle: this.inputName,
              cover: this.imageUrl,
              video:  this.video,
              cookDiff: this.value1,
              cookTime: this.value2,
              description: this.textarea,
              skill: this.textarea3,
              createTime: this.getNowTime(),
              status: 1,
            });
          res = res.data;
          this.materials.forEach((o, index) => {
            this.$set(o, 'cookId', res.data.id);
          });
          this.steps.forEach((o, index) => {
            this.$set(o, 'cookId', res.data.id);
          });
          let [res2, res3] = await Promise.all([materialApi.uploadMaterial(this.materials), stepApi.uploadStep(this.steps)])
          res2 = res2.data;
          res3 = res3.data;
          if (res.code == 200 && res2.code == 200 && res3.code == 200) {
            await this.$router.push({name: "菜谱详情", query: {id: res.data.id}});
          }
        }
    },
    onVerifySuccess(obj) {
          this.verify=true;
    },
    onVerifyError(obj) {
      this.verify=false;
    }
  }
}
</script>

<style scoped>
.draft-tip {
  margin-left: 280px;
  display: none;
}
.mt20 {
  margin-top: 20px;
}
.draft-tip span {
  display: inline-block;
  padding: 0 20px;
  height: 37px;
  line-height: 37px;
  background: rgba(51, 51, 51, 0.3);
  border-radius: 37px;
  color: #fff;
  font-weight: bold;
  font-size: 15px;
}
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
  z-index: 3;
  width: 690px;
  height: 390px;
  overflow: hidden;
}

.step{
  z-index: 3;
  width: 200px;
  height: 200px;
  overflow: hidden;
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
