<template>
  <div>
    <el-row style="margin-top: 100px;margin-left: 500px">
      <el-col :span="10">
   <el-input v-model="input" placeholder="请输入内容"></el-input>
      </el-col>
      <el-col :span="1"style="margin-left: 5px">
      <el-button icon="el-icon-search" circle @click="handleClick"></el-button>
      </el-col>
    </el-row>
    <el-col span="14" :offset="7">
    <el-table
      :data="userList"
      style="width: 100%;margin-top: 50px"
      max-height="300">
      <el-table-column
        fixed
        prop="id"
        label="用户编号"
        width="120">
      </el-table-column>
      <el-table-column
        prop="username"
        label="用户名"
        width="120">
      </el-table-column>
      <el-table-column
        prop="realName"
        label="真实姓名"
        width="120">
      </el-table-column>
      <el-table-column
        prop="sex"
        label="性别"
        width="120">
      </el-table-column>
      <el-table-column
        prop="age"
        label="年龄"
        width="120">
      </el-table-column>
    </el-table>
    </el-col>
  </div>
</template>

<script>
import userApi from "../../api/user";
export default {
  name: "Login",
  data() {
    return {
      input: '',
      show:'false',
      userList: [],
    }
  },
  methods:{
    async handleClick(){
      if(this.input!='') {
        let res = await userApi.getUserInfo({realName: this.input});
        res = res.data;
        if (res.success) {
          for (let i = 0; i < res.data.length; i++) {
            if (res.data[i].sex == '0') {
              res.data[i].sex = "女";
            } else {
              res.data[i].sex = "男";
            }
          }
          this.userList = res.data;
        } else {
          this.userList = [];
        }
      }else{
        this.userList = [];
      }
    }
  }
}
</script>

<style scoped>

</style>
