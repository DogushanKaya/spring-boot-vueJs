<template>
    <div id="men">


        <form>

            <h2>Name: <input v-model="name" placeholder="Name"></h2>
            <h2>Year: <input v-model="year" placeholder="Year"></h2>
            <h2>Format: <input v-model="format" placeholder="format"></h2>
            <h2>Genre: <input v-model="genre" placeholder="genre"></h2>
            <h2>Artist: <input v-model="artist.name" placeholder="artist name"></h2>
            <h2>Artist: <input v-model="artist.surname" placeholder="artist surname"></h2>

            <button v-on:click="addAlbum"  type="button" class="btn btn-primary">SUBMIT</button>

            <v-select v-model="selected" :options="[{value: 'Foo'}]">gejre</v-select>


        </form>

    </div>

</template>

<script>
    import axios from 'axios'

    export default {
        name: 'AddAlbum',
        data() {

            return{
                name:"",
                year:"",
                format:"",
                genre:"",
                artist:{
                    name:"",
                    surname:""
                }
            }

        },


        methods: {
            addAlbum() {
                axios.post('/album/save', {
                    name: this.name,
                    year: this.year,
                    format: this.format,
                    genre: this.genre,
                    artist:{
                        name:this.artist.name,
                        surname:this.artist.surname

                    }


                });

            }
        }
    }
</script>

<style scoped>

</style>