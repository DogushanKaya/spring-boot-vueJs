package com.eteration.bootcamp2k18.service;

import com.eteration.bootcamp2k18.model.User;
import com.eteration.bootcamp2k18.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(user.getPassword());
        user.setActive(1);
        userRepository.save(user);
    }

}