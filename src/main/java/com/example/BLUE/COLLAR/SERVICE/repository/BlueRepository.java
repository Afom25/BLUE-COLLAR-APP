package com.example.BLUE.COLLAR.SERVICE.repository;


import com.example.BLUE.COLLAR.SERVICE.model.Job;
import com.example.BLUE.COLLAR.SERVICE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BlueRepository extends JpaRepository<Job,Long> {
    @Query(value = "select j from Job as j where j.location=?1")
    User findBylocation(String location);

//    List<Job> findbyLocation(String location);
//    List<Job> findJobByDatepostAnd

}
