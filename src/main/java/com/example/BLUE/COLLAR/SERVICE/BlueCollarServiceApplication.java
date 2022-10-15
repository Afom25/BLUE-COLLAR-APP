package com.example.BLUE.COLLAR.SERVICE;


import com.example.BLUE.COLLAR.SERVICE.model.User;
import com.example.BLUE.COLLAR.SERVICE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;


import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class BlueCollarServiceApplication  {


//	@Autowired
//	private UserRepository userRepository;
//
//	@PostConstruct
//	public void initUsers(){
//		List<User> users = Stream.of(
//
//		new User("hidri1","ab1","a1@gmail.com","1231","1231"),
//		new User("hidri2","ab2","a2@gmail.com","1232","1232")
//
//		).collect(Collectors.toList());
//		userRepository.saveAll(users);
//	}



	public static void main(String[] args) {
		SpringApplication.run(BlueCollarServiceApplication.class, args);

	}

}
