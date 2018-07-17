package com.eteration.bootcamp2k18.service;


import com.eteration.bootcamp2k18.model.User;

public interface UserService {
    User findUserByEmail(String email);
    void saveUser(User user);
}