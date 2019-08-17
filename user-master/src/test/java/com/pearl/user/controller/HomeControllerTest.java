package com.pearl.user.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeControllerTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void sayHello() {

        ResponseEntity<String> message = restTemplate.getForEntity("http://localhost:9090/",String.class);

        Assert.assertEquals("Welcome to user-master",message.getBody());
    }

//    @Test
//    void securedHello() {
//    }
//
//    @Test
//    void addUser() {
//    }
}