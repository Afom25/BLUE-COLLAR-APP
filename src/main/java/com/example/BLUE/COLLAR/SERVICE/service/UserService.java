package com.example.BLUE.COLLAR.SERVICE.service;

import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.model.User;

import com.example.BLUE.COLLAR.SERVICE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().limit(20).collect(Collectors.toList());
    }
    @Autowired
    private UserRepository userRepository;

    public List<User> userList() {
        return  userRepository.findAll();

    }
//    public List<User> byLastname(String first){
//        return userRepository.findUserByLastname(first);
//    }
    public void save(User user){
        System.out.println(user.toString());
         userRepository.save(user);

    }


    public User registerNewUser(User user){
        return userRepository.save(user);
    }



//    @Override
//    public UserDetails loadUserByUsername(String firstname) throws UsernameNotFoundException {
//        User user = userRepository.findByFirstname(firstname);
//        return new org.springframework.security.core.userdetails.User(user.getFirstname(),user.getPassword(),new ArrayList<>());
//    }
}
