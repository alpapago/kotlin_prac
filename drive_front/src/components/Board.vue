<script setup lang="ts">
import { ref } from 'vue'
const props = defineProps<{
  text?: string
  link?: string
  option?: string
  color?: string
}>()
</script>

<template>
  <div class="option-button" :style="{ background: props.color }">
    <div
      :style="{
        display: 'flex',
        alignItems: 'flex-start',
        justifyContent: 'flex-start'
      }"
    >
      <span class="inner-message"> {{ props.text }} </span>
    </div>
  </div>
</template>

<style scoped>
.btn-container {
  justify-content: center;
}

.option-button {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  padding: 0.875rem 1.25rem;
  border-radius: 1rem;
  background: linear-gradient(180deg, #d9d9d9 0%, #d9d9d9 100%);
  gap: 0.625rem;
  width: 90%;
  height: 200px;
}
.inner-message {
  color: var(--system-white, #070000);
  font-family: 'Abril Fatface';
  font-size: 1rem;
  font-style: normal;
  font-weight: bold;
  line-height: 1rem; /* 129.412% */
  letter-spacing: -0.02688rem;
  text-decoration: none;
}
</style>
