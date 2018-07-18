package com.eteration.bootcamp2k18.repositories;

import com.eteration.bootcamp2k18.model.Album;
import com.eteration.bootcamp2k18.type.FormatEnum;
import com.eteration.bootcamp2k18.type.GenreEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {

    Album findByName(String name);

    Album findByYear(String year);

    Album findTopByOrderByNameDesc();

    List<Album> findByFormat(FormatEnum format);

    List<Album> findByGenre(GenreEnum genre);


    //@Query("select album from Album album where album.artist.name=:artistName")



}
