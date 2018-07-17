<template>
  <div class="hello">
    <h2><router-link :to="albumLink">{{album.name}}</router-link></h2>
    <h2>@ {{album.artist.name}} {{album.artist.surname}}</h2>
  </div>
</template>

<script>
  export default {
    name: 'AlbumView',
    props: {
      album: { type: Object, required: true }
    },computed: {
      albumLink(){
        console.log(this.album.id);
        return `/albums/${this.album.id}`
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    list-style: none;
    float: left;
    margin: 20px;
    border-style: solid;
    border-width: 3px;
    border-color: #42b983;
    margin: 13px;
    padding: 10px;
  }
  a {
    color: #42b983;
  }
</style>
