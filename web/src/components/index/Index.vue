<template>
  <div>
  <img src="../../assets/indexImg.jpg" style="width: 100%;">
  <div style="width: 1050px;margin: auto;">
  <DailyCook/>
  <DailyNote/>
    <Left style="display: inline-block"/>
    <Right style="display: inline-block"/>
  </div>
  </div>
</template>

<script>
import DailyCook from "./DailyCook";
import DailyNote from "./DailyNote";
import Left from "./Left";
import Right from "./Right";
export default {
  name: "index",
  components: {
    DailyCook:DailyCook,
    DailyNote:DailyNote,
    Left:Left,
    Right:Right
  }
}
</script>

<style scoped>

</style>
