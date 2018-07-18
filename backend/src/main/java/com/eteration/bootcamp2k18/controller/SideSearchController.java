package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.model.Album;
import com.eteration.bootcamp2k18.repositories.AlbumRepository;
import com.eteration.bootcamp2k18.repositories.ArtistRepository;
import com.eteration.bootcamp2k18.type.FormatEnum;
import com.eteration.bootcamp2k18.type.GenreEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SideSearchController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ArtistRepository artistRepository;

    @RequestMapping(path = "/genre/{genre}", method = RequestMethod.GET)
    public List<Album> getAlbumByGenre(@PathVariable("genre") GenreEnum genre) {
        return albumRepository.findByGenre(genre);
    }

    @RequestMapping(path = "/format/{format}", method = RequestMethod.GET)
    public List<Album> getAlbumByFormat(@PathVariable("format") FormatEnum format) {
        return albumRepository.findByFormat(format);
    }
}