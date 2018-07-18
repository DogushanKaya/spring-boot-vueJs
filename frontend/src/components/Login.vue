<template>
    <div class="container-fluid">
        <br/><br/>
        <div class="login-wrapper border border-light">
            <form>
                <h2 class="form-signin-heading">Please sign in</h2>
                <label for="inputEmail" class="sr-only">Email address</label>
                <input v-model="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input v-model="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <router-link :to="loginLink"><button class="btn btn-lg btn-primary btn-block" type="submit" >Log In</button></router-link>
            </form>
        </div>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {
        name: 'Login',
        data () {
            return {
                email: '',
                password: ''
            }
        },
        created(){
            axios.post('user/login',
                {
                    headers: {
                        'Content-Type': 'multipart/form-data'
                    }
                }).then(function(){
                    console.log('SUCCESS!!');
                }).then( (res) => {
                this.users=res.data;

            });


        },
        computed: {
            loginLink(){
                return `/login`
            }
        }
/*
        components:{AlbumView}
*/

    }
</script>



<style lang="css">
    /*body {
        background: #605B56;
    }*/

    .login-wrapper {
        background: #fff;
        width: 20%;
        height:380px;
        margin-right: auto;
        margin-left: auto;
    }

    .form-signin {
        max-width: 330px;
        padding: 10% 15px;
        margin: 0 auto;
    }
    .form-signin .form-signin-heading,
    .form-signin .checkbox {
        margin-bottom: 10px;
    }
    .form-signin .checkbox {
        font-weight: normal;
    }
    .form-signin .form-control {
        position: relative;
        height: auto;
        -webkit-box-sizing: border-box;
        box-sizing: border-box;
        padding: 10px;
        font-size: 16px;
    }
    .form-signin .form-control:focus {
        z-index: 2;
    }
    .form-signin input[type="email"] {
        margin-bottom: -1px;
        border-bottom-right-radius: 0;
        border-bottom-left-radius: 0;
    }
    .form-signin input[type="password"] {
        margin-bottom: 10px;
        border-top-left-radius: 0;
        border-top-right-radius: 0;
    }
</style>