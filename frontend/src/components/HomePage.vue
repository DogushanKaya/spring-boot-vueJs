<template>
    <div id="app">
<!--
        <img src="./assets/discogs.png">
-->     <div class="container-fluid">

        <router-link :to="loginLink"><button class="btn btn-lg btn-primary btn-block" type="submit" >Log In</button></router-link>


        </div>
        <!--<router-view/>-->
    </div>
</template>

<script>
    export default {
        name: 'HomePage',
    computed: {
        loginLink(){
            return `/login`
        }

    }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
        margin-right: 15%;
    }
</style>