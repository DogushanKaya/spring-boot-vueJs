package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.model.Artist;
import com.eteration.bootcamp2k18.model.Track;
import com.eteration.bootcamp2k18.repositories.AlbumRepository;
import com.eteration.bootcamp2k18.repositories.ArtistRepository;
import com.eteration.bootcamp2k18.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/track")
public class TrackController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    TrackRepository trackRepository;

    @Autowired
    ArtistRepository artistRepository;

    @GetMapping("/all")
    public List<Track> getAll(){
        return trackRepository.findAll();
    }

    @PostMapping("/save")
    public Track saveTrack(@RequestBody Track track){

        Artist byNameAndSurname = artistRepository.findByNameAndSurname(track.getArtist().getName(),track.getArtist().getSurname());

        if(byNameAndSurname!= null){
            track.setArtist(byNameAndSurname);
        }

        Track savedTrack = trackRepository.save(track);

        return savedTrack;
    }

}
