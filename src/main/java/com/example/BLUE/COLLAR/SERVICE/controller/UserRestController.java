package com.example.BLUE.COLLAR.SERVICE.controller;

import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.model.User;
import com.example.BLUE.COLLAR.SERVICE.service.JobService;
import com.example.BLUE.COLLAR.SERVICE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value="/api")
    public class UserRestController {


        @Autowired
        private UserService userService;

        @GetMapping(value="/users")
        public List<User> displayUsers(){
            return userService.getAllUsers();
        }
    }

