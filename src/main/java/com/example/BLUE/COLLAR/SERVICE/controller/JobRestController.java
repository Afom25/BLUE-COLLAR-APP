package com.example.BLUE.COLLAR.SERVICE.controller;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping(value="/jobs")
    public List<Job> displayJobs(){
        return jobService.getAllJobs();
    }
}
