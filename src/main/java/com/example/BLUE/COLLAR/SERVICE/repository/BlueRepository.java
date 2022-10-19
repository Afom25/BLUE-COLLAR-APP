package com.example.BLUE.COLLAR.SERVICE.repository;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface BlueRepository extends JpaRepository<Job,Long> {



    @Query("FROM Job WHERE jobTitle = ?1")
    List<Job> findJobBy(String jobtitle);
    @Query("FROM Job WHERE location = ?1")
    List<Job>getlocation(String location);
    @Query("FROM Job Where user = ?1")
    List<Job>getJobUsers(String user);








}
