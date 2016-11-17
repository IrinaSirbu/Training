package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.Service;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by isirbu on 11/14/2016.
 */

@org.springframework.stereotype.Controller
public class Controller {

   @Autowired Service service;

    /* REST */

    @RequestMapping (value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public User add(@RequestBody User user){
        return service.save(user);
    }

    @RequestMapping (value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void delete(@RequestBody User user){
        service.delete(user);
    }

    @RequestMapping (value = "/list", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<User> list(){
        return service.getUsers();
    }

    @RequestMapping (value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user){
        return service.update(user);
    }


    /* JSP */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String createUser(Map<String, Object> model) {

        User user = new User();
        model.put("user", user);
        return "user";
    }

    @RequestMapping(value = "/user/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {

        service.save(user);
        return "add";
    }

    @RequestMapping(value = "/listUsers", method = RequestMethod.GET)
    public ModelMap listUsers(){

        ModelMap model = new ModelMap();
        model.addAttribute("userList", service.getUsers());

        return model;
    }

    @RequestMapping(value = "/user/deleteUser", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute("user") User user) {

        service.delete(user);
        return "delete";
    }

    @RequestMapping(value = "/user/updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("user") User user) {

        service.update(user);
        return "update";
    }
}
