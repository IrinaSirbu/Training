package com.example.service;

import com.example.model.UserEntity;
import com.example.model.WeatherEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by isirbu on 11/21/2016.
 */

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Weather weather;

    @Autowired
    private User user;

    public WeatherEntity weather(String city) {

        return weather.getWeather(city);

    }

    public void save(UserEntity userEntity){

        user.saveUser(userEntity);

    }

    public Integer get(String name, String password){
        return user.getUser(name,password);
    }
}
