package com.eteration.bootcamp2k18.repositories;


import com.eteration.bootcamp2k18.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByName(String name);
    //User findByNammeAndLastName (String name, String last_name);

}
