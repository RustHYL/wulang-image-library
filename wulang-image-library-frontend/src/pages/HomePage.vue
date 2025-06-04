<script setup lang="ts">
import TheWelcome from '../components/TheWelcome.vue'
</script>

<template>
  <div id="homePage">
    <h1>{{ loginUserStore.loginUser.userName }}</h1>
  </div>
</template>
