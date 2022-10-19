package com.example.BLUE.COLLAR.SERVICE.service;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
//import com.example.BLUE.COLLAR.SERVICE.repository.BlueRepository;
import com.example.BLUE.COLLAR.SERVICE.model.User;
import com.example.BLUE.COLLAR.SERVICE.repository.BlueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class JobService {
    public List<Job> getAllJobs() {
        return repo.findAll().stream().limit(20).collect(Collectors.toList());
    }

    @Autowired
    private BlueRepository repo;

    public List<Job> listAll(){
        return repo.findAll();
    }
    public Job save(Job job){
       // System.out.printf(job.toString());
        return repo.save(job);

    }

    public List<Job> byjobtitle(String first){
        return repo.findJobBy(first);
    }

    public List<Job> byjoblocation(String second) {
        return repo.getlocation(second);
    }

    public List<Job> byjobUser(String third) {
        return repo.getJobUsers(third);
    }
}
