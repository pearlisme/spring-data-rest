package com.pearl.user.service;

import com.pearl.user.domain.User;
import com.pearl.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void loadUser() {

        List<User> userList = new ArrayList<>();

        userList.add(User.builder().name("Pearl").contact(56453534L).build());
        userList.add(User.builder().name("Muel").contact(56453534L).build());
        userList.add(User.builder().name("Curl").contact(56453534L).build());
        userList.add(User.builder().name("Docker").contact(56453534L).build());
        userList.add(User.builder().name("Kubctl").contact(56453534L).build());
        userList.add(User.builder().name("Helm").contact(56453534L).build());
        userRepository.saveAll(userList);
    }
}
