package com.example.BLUE.COLLAR.SERVICE.repository;

import com.example.BLUE.COLLAR.SERVICE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
