package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.repositories.AlbumRepository;
import com.eteration.bootcamp2k18.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistController {


    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ArtistRepository artistRepository;
}
