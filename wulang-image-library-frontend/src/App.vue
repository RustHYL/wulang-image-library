<template>
  <div id="app">
    <BasicLayout />
  </div>
</template>

<script setup lang="ts">
import BasicLayout from "@/layouts/BasicLayout.vue";
import { healthUsingGet } from '@/api/mainController.ts'

healthUsingGet().then((res) => {
  console.log(res)
})

const loginUserStore = useLoginUserStore()
loginUserStore.fetchLoginUser()


</script>

<style>
#app {
}
</style>
