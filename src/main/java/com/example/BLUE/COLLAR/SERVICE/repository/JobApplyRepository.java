package com.example.BLUE.COLLAR.SERVICE.repository;


import com.example.BLUE.COLLAR.SERVICE.model.JobApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplyRepository extends JpaRepository<JobApply,Long> {
}
