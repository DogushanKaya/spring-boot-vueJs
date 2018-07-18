package com.eteration.bootcamp2k18.controller;

import com.eteration.bootcamp2k18.model.User;
import com.eteration.bootcamp2k18.repositories.UserRepository;
import javafx.scene.control.Alert;
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


    @PostMapping("/register")
    public User registerUser(@RequestBody User user){

        User registeredUser = userRepository.save(user);

        return registeredUser;
    }
    @PostMapping("/login")
    public User loginUser(@RequestBody User user){

        User byEmailAndPassword = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (byEmailAndPassword != null) {
            byEmailAndPassword.setActive(true);
        }

        return byEmailAndPassword;
    }

}