package com.eteration.bootcamp2k18.repositories;

import com.eteration.bootcamp2k18.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {

    Album findByName(String name);

    Album findByYear(String year);

    Album findTopByOrderByNameDesc();

    //@Query("select album from Album album where album.artist.name=:artistName")



}
