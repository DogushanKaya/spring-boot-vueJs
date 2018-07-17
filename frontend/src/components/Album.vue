<template>
  <div class="hello">
    <h1>{{album.name}}</h1>
    <h2>{{album.year}}  -  {{album.format}}</h2>
    <h2>{{album.artist.name}} {{album.artist.surname}}</h2>
  </div>
</template>

<script>
  import axios from 'axios'


export default {
  name: 'Album',
  data () {
    return {
      album:{}
    }
  },
  created(){
    console.log("ID...." + this.$route.params.id)
    axios.get(`album/${this.$route.params.id}`).then( (res) => {
      this.album = res.data;
      })


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
