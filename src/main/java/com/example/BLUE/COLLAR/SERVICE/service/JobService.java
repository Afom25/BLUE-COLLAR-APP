package com.example.BLUE.COLLAR.SERVICE.service;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
//import com.example.BLUE.COLLAR.SERVICE.repository.BlueRepository;
import com.example.BLUE.COLLAR.SERVICE.repository.BlueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
//@Transactional
public class JobService {

    @Autowired
    private BlueRepository repo;

    public List<Job> listAll(){
        return repo.findAll();
    }
    public Job save(Job job){
        System.out.printf(job.toString());
        return repo.save(job);

    }
//    public void sav e (P)
}
