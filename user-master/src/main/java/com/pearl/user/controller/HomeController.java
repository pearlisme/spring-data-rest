package com.pearl.user.controller;

import com.pearl.user.model.User;
import com.pearl.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
class HomeController {

    @Autowired
    private UserService userService;

    @SuppressWarnings("SameReturnValue")
    @GetMapping("/")
    public String sayHello(){

        return "Welcome to user-master";
    }

    @SuppressWarnings("SameReturnValue")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured")
    public String securedHello() {
        return "Secured Hello";
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
