package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.model.User;
import com.eteration.bootcamp2k18.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


@Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }


    @PostMapping("/save")
    public User saveUser(@RequestBody User user){

        User savedUser = userRepository.save(user);

        return savedUser;
    }

}
