package com.example.BLUE.COLLAR.SERVICE;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class BlueCollarServiceApplication  {



	public static void main(String[] args) {
		SpringApplication.run(BlueCollarServiceApplication.class, args);

	}

}
