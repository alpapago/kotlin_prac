<script setup lang="ts">
import StopButton from '../components/Button/StopButton.vue'
import StartButton from '../components/Button/StartButton.vue'
import VButton from '../components/Button/VButton.vue'
import Board from '../components/Board.vue'
import Road from '../components/Road.vue'
import { ref } from 'vue'

const avg = ref<String>('AVG.SPEED')
const distance = ref<String>('DISTANCE')
const consumption = ref<String>('CONSUMPTION')
</script>

<template>
  <main>
    <div class="top">
      <div class="car">
        <div>
          <img src="@/assets/G80.png" alt="자동차" style="width: 400px; height: auto" />
        </div>
        <div class="info">
          <VButton :text="avg" />
          <VButton :text="distance" />
          <VButton :text="consumption" />
        </div>
        <div class="controller">
          <StartButton />
          <StopButton />
        </div>
      </div>
      <div>
        <img
          src="@/assets/graph.png"
          alt="속도"
          style="width: 900px; height: auto; padding: 40px"
        />
      </div>
    </div>
    <div>
      <Road />
    </div>
  </main>
</template>

<style scoped>
.top {
  display: flex;
}
.info {
  display: flex;
  justify-content: space-between;
  width: 340px;
  padding: 2rem;
}
.controller {
  display: flex;
  justify-content: space-between;
  width: 340px;
  padding: 2rem;
}
</style>
