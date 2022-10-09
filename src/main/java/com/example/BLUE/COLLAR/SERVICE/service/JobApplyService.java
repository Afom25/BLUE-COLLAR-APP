package com.example.BLUE.COLLAR.SERVICE.service;


import com.example.BLUE.COLLAR.SERVICE.model.JobApply;
import com.example.BLUE.COLLAR.SERVICE.repository.JobApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplyService {

    @Autowired
    private JobApplyRepository jobApplyRepository;

   private List<JobApply> listall(){
        return jobApplyRepository.findAll();
    }
    private JobApply save(JobApply jobApply){
        return jobApplyRepository.save(jobApply);
    }

}
