package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.model.Album;
import com.eteration.bootcamp2k18.model.Artist;
import com.eteration.bootcamp2k18.repositories.AlbumRepository;
import com.eteration.bootcamp2k18.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    /* Injection of AlbumRepository*/
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ArtistRepository artistRepository;

    @GetMapping("/all")
    public List<Album>getAll(){
        return albumRepository.findAll();
    }



    @PostMapping("/save")
    public Album saveAlbum(@RequestBody Album album){

        Artist byNameAndSurname = artistRepository.findByNameAndSurname(album.getArtist().getName(),album.getArtist().getSurname());

        if(byNameAndSurname!= null){
            album.setArtist(byNameAndSurname);
        }

        Album savedAlbum = albumRepository.save(album);

        return savedAlbum;
    }

    /*@DeleteMapping("/{year}")
    public void deleteAlbumByYear(@PathVariable("year") String year){
        albumRepository.delete(albumRepository.findByYear(year));
    }
*/
   /* @RequestMapping(path = "/{artistname}",method = RequestMethod.GET)
    public List<Album> getAlbumByArtistName(@PathVariable("artistname") String artistname){
        return albumRepository.findByArtistName(artistname);
    }*/
}
