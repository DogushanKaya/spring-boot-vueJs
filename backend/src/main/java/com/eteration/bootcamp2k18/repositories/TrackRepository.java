package com.eteration.bootcamp2k18.repositories;

import com.eteration.bootcamp2k18.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrackRepository extends JpaRepository<Track,Long> {

    Track findByTitle(String title);


    Track findTopByOrderByTitleDesc();

    //@Query("select album from Album album where album.artist.name=:artistName")



}