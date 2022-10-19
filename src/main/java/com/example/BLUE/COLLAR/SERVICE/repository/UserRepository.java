package com.example.BLUE.COLLAR.SERVICE.repository;

import com.example.BLUE.COLLAR.SERVICE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long> {

    //User findByFirstname(String firstname);

     List<User> findByPassword(String passsword);
     List<User>findUserByLastname(String lastname);




}
