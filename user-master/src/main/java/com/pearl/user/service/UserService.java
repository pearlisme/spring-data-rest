package com.pearl.user.service;


import com.pearl.user.model.User;
import com.pearl.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        User flush = userRepository.save(user);
        return flush.getName()+": User Added";
    }
}
