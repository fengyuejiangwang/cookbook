<template>
  <body id="poster">
  <el-form
    class="login-container"
    label-position="left"
    label-width="0px"
    :model="loginForm"
    :rules="rules"
    ref="ruleForm"
  >
    <h3 class="login_title">
      欢迎登陆

    </h3>
    <el-form-item prop="username">
      <el-input
        type="text"
        v-model="loginForm.username"
        autocomplete="off"
        placeholder="请输入用户名"
        prefix-icon="el-icon-user-solid"
      ></el-input>
    </el-form-item>
    <el-form-item prop="email" v-show="forgetPassword" inline>
      <el-input
        type="text"
        v-model="loginForm.email"
        autocomplete="off"
        placeholder="请输入邮箱"
        prefix-icon="el-icon-user-solid"
        maxlength="30"
        icon=""
        style="width:253px"
      ></el-input>
    </el-form-item>
    <el-form-item prop="code" v-show="forgetPassword">
      <el-input
        type="text"
        v-model="loginForm.code"
        autocomplete="off"
        placeholder="请输入验证码"
        prefix-icon="el-icon-user-solid"
      ></el-input>
    </el-form-item>
    <el-form-item prop="password">
      <el-input
        type="password"
        v-model="loginForm.password"
        autocomplete="off"
        placeholder="请输入密码"
        prefix-icon="el-icon-lock"
      ></el-input>
    </el-form-item>
    <el-button type="text" @click="forgetPassword = true">
      忘记密码？
    </el-button>
    <el-form-item style="width: 100%;">
     <el-button
        type="primary"
        style="width: 100%;background: #505458;border:none;"
        @click="login"
      >登录</el-button>

    </el-form-item>
  </el-form>
  </body>
</template>

<script>
import userApi from "../../api/user";
export default {
  name: "Login",

  data() {
    return {
      forgetPassword: false,
      loginForm: {
        id: "",
        username: "",
        password: ""
      },
      rules: {
        username: [
          { required: true, message: "请输入用户名", trigger: "blur" },
          { min: 3, max: 15, message: "长度在 3 到 15 个字符", trigger: "blur" }
        ],
        password: [{ required: true, message: "密码不能为空", trigger: "blur" }]
      }
    };
  },
  methods: {
    async login() {
        let res=await userApi.login(this.loginForm);
        res=res.data;
        if(res.success){
          this.$message.success("登录成功");
          window.sessionStorage.setItem("loginState",res.success);
          window.sessionStorage.setItem("userInfo",JSON.stringify(res.data));
          this.$router.push({path:"/index"});
        }
    },
  }
};
</script>

<style  scoped>
#poster {
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}
body {
  margin: 0px;
  padding: 0px;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}
</style>
