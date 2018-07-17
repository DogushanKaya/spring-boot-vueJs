package com.eteration.bootcamp2k18.repositories;

import com.eteration.bootcamp2k18.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist,Long> {

    Artist findByNameAndSurname(String name, String surname);
}
