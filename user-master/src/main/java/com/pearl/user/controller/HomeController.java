package com.pearl.user.controller;

import com.pearl.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String sayHello(){

        loadSample();
        return "Welcome to user-master";
    }

    private void loadSample() {

        userService.loadUser();
    }
}
