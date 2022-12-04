<template>
<div>
  <el-container>
    <el-header>
      <Header/>
    </el-header>
    <el-main>
      <router-view></router-view>
    </el-main>
    <el-footer>
      <Footer/>
    </el-footer>
  </el-container>
</div>
</template>

<script>
import Header from "../commons/Header";
import Main from "../index/Index";
import Footer from "../commons/Footer"
export default {
  name: "Layout",
  components: {
    Header:Header,
    Main:Main,
    Footer:Footer,
  }
};
</script>

<style scoped>
.el-header{

}

.el-footer {
  padding: 0;
}

.el-main {
  padding: 0;
}

</style>
