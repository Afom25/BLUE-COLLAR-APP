package com.example.BLUE.COLLAR.SERVICE.service;

import com.example.BLUE.COLLAR.SERVICE.model.User;

import com.example.BLUE.COLLAR.SERVICE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> userList() {
        return  userRepository.findAll();

    }
    public User save(User user){
        System.out.println(user.toString());
        return userRepository.save(user);
    }

}
