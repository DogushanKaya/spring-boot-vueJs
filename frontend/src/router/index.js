import Vue from 'vue'
import Router from 'vue-router'
import AlbumList from '@/components/AlbumList'
import Album from '@/components/Album'
import Login from '@/components/Login'
import HomePage from '@/components/HomePage'
import AddAlbum from '@/components/AddAlbum'
import Register from '@/components/Register'



Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/albums',
      name: 'AlbumList',
      component: AlbumList
    },
    {
      path: '/albums/:id',
      name: 'Album',
      component: Album
    },
      {
          path: '/',
          name: 'HomePage',
          component: HomePage
      },
      {
          path: '/login',
          name: 'Login',
          component: Login
      },
      {
          path: '/addAlbum',
          name: 'addalbum',
          component: AddAlbum
      },
      {
          path: '/register',
          name: 'register',
          component: Register
      }
  ]
})
