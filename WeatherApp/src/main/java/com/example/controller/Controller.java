package com.example.controller;

import com.example.model.UserEntity;
import com.example.service.User;
import com.example.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.example.service.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by isirbu on 11/21/2016.
 */

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service service;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/da")
    @ResponseBody
    public String print(){
        return "da";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){

        return "home";
    }

    @RequestMapping(value = "/city/weather", method = RequestMethod.GET)
    public ModelAndView getCityWeather(@RequestParam String city){

        System.out.println(city);
        ModelAndView model = new ModelAndView("homeweather");
        model.addObject("cit", service.weather(city));

        return model;
    }

    @RequestMapping(value = "/home",method = RequestMethod.POST)
    public String register(@ModelAttribute("user") UserEntity user, BindingResult bindingResult,Model m){

        System.out.println(user.toString());
        userValidator.validate(user, bindingResult);
        if(bindingResult.hasErrors()){
            m.addAttribute("error","username existent");
            return "home";
        }

        service.save(user);
        return "home";
    }

    @RequestMapping(value="/city/weather", method = RequestMethod.POST)
    public String login(@ModelAttribute("name")String name,@ModelAttribute("password") String password){

        if(service.get(name,password) == 1){
            return "homeweather";
        } else {
            return "home";
        }
    }
}