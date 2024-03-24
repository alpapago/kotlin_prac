<template>
  <!-- <Board :text="now" /> -->
  <!-- <div style="background: blue; display: block width:600px; height:auto; ">{{ now }}</div> -->
  <div class="sight">
    <div style="font-weight: bold; font-size: 30px">
      <p>{{ now }}</p>
    </div>
    <div class="img">
      <div>
        <p style="font-weight: bold; font-size: 20px">{{ pic1 }}</p>
        <img src="../assets/pic1.png" alt="fullcolor" style="width: 370px; height: auto" />
      </div>
      <div>
        <p style="font-weight: bold; font-size: 20px">{{ pic2 }}</p>
        <img src="../assets/pic2.png" alt="yellow-only" style="width: 370px; height: auto" />
      </div>
      <div>
        <p style="font-weight: bold; font-size: 20px">{{ pic3 }}</p>
        <img src="../assets/pic3.png" alt="white-only" style="width: 370px; height: auto" />
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import Board from '../components/Board.vue'
import { ref } from 'vue'

const now = ref<String>('현재 주행 상황')
const pic1 = ref<String>('Live 1')
const pic2 = ref<String>('Live 2')
const pic3 = ref<String>('Live 3')
</script>

<style scoped>
.img {
  display: flex;
  justify-content: space-between;
}
.sight {
  display: flex;
  flex-direction: column;
  background: #d9d9d9;
  margin: 20px;
  padding: 30px;
  width: 85%;
  border-radius: 1rem;
}
</style>
