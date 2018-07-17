import Vue from 'vue'
import Router from 'vue-router'
import AlbumList from '@/components/AlbumList'
import Album from '@/components/Album'


Vue.use(Router)

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
    }

  ]
})
