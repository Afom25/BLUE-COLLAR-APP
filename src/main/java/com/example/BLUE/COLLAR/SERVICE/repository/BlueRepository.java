package com.example.BLUE.COLLAR.SERVICE.repository;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlueRepository extends JpaRepository<Job,Long> {

}
