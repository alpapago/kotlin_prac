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
    <span class="inner-message"> {{ props.text }} </span>
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
  background: linear-gradient(180deg, #4d1ce0 0%, #785def 100%);
  gap: 0.625rem;
  width: 45px;
  height: 20px;
}
.inner-message {
  color: var(--system-white, #fff);
  font-family: 'Abril Fatface';
  font-size: 0.7rem;
  font-style: normal;
  font-weight: 200;
  line-height: 1rem; /* 129.412% */
  letter-spacing: -0.02688rem;
  text-decoration: none;
}
</style>
