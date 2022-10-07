package com.example.BLUE.COLLAR.SERVICE.repository;


import com.example.BLUE.COLLAR.SERVICE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

    User findByEmail(String Email);
    User findByUserName(String username);
}
