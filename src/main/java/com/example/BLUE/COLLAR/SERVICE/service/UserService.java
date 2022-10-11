package com.example.BLUE.COLLAR.SERVICE.service;

import com.example.BLUE.COLLAR.SERVICE.model.User;

import com.example.BLUE.COLLAR.SERVICE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public List<User> userList() {
        return  userRepository.findAll();

    }
    public void save(User user){
        System.out.println(user.toString());
         userRepository.save(user);


    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(user.getFirstname(),user.getPassword(),new ArrayList<>());
    }
}
