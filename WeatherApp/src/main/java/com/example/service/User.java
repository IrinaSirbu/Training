package com.example.service;

import com.example.model.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by isirbu on 11/25/2016.
 */
@org.springframework.stereotype.Service
public class User {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveUser(UserEntity user){

        userRepository.save(user);

    }

    @Transactional Integer getUser(String name, String password){

        UserEntity userEntity = userRepository.findByName(name);
        if(userEntity != null && userEntity.getPassword().equals(password)){
            return 1;
        } else {
            return 0;
        }
    }
}
