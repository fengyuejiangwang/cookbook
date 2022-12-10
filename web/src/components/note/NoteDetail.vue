<template>
  <div>
    <main>
      <div class="product-intro">
        <div class="preview-wrap">
          <el-carousel indicator-position="outside">
            <el-carousel-item v-for="item in specImages" :key="item">
              <img :src="item.img" alt="轮播图" />
            </el-carousel-item>
          </el-carousel>
        </div>
      </div>
    </main>
  </div>

</template>

<script>
export default {
  data() {
    return {
      specImages: [{img: require("../../assets/indexImg.jpg")},{img:"../../assets/indexImg.jpg"},{img:"../../assets/indexImg.jpg"}
        //350x350大小的图片
      ],
      smallSpecImages:[{img: require("../../assets/indexImg.jpg")}
        //50x50大小的图片
      ]
    };
  },
  methods:{
    //   将轮播图指示器渲染成图片
    indicatorToimage:function(){
      var a = document.querySelectorAll(".el-carousel__button");
      // console.log(a);
      for (let i in this.specImages){
        //添加一个img
        let img = document.createElement('img');
        img.src=this.smallSpecImages[i];
        //加到button里面
        a[i].appendChild(img);
      }
    }
  },
  mounted(){
    //在完全加载后再执行函数
    this.$nextTick(()=>this.indicatorToimage());
  }

}

</script>

<style scoped>

.preview-wrap .el-carousel {
  width: 350px;
  height: 400px;
}
.preview-wrap /deep/.el-carousel__button{
  width: 50px;
  height: 50px;
}
</style>
