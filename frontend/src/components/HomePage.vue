<template>


    <div class="container fixed-top">
        <div class="row">
            <div class="col-sm"></div>
            <div class="col-sm"></div>
            <div class="col-sm" style="padding-right: auto">
                <router-link :to="loginLink"><button class="btn btn-lg btn-primary btn-block" type="submit" >Log In</button></router-link>
            </div>

            <div class="col-sm">
                <router-link :to="registerLink"><button class="btn btn-lg btn-primary btn-block" type="submit" >Register</button></router-link>
            </div>
        </div>
    </div>

<!--
       <div class="container">
        </div>-->
</template>

<script>
    export default {
        name: 'HomePage',
    computed: {
        loginLink(){
            return `/login`
        },
        registerLink(){
            return `/register`
        }


    }
    }
</script>

<style>



</style>
