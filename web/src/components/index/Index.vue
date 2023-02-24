<template>
  <div>
  <img src="../../assets/indexImg.jpg" style="width:100%">
  <div style="width: 1050px;margin: auto;">
      <DailyHotCook/>
      <Note/>
    <Left style="display: inline-block"/>
    <Right style="display: inline-block"/>
  </div>
  </div>
</template>

<script>
import DailyHotCook from "./DailyHotCook";
import Note from "./Note";
import Left from "./Left";
import Right from "./Right";
export default {
  name: "index",
  components: {
    DailyHotCook:DailyHotCook,
    Note:Note,
    Left:Left,
    Right:Right
  }
}
</script>

<style scoped>

</style>
