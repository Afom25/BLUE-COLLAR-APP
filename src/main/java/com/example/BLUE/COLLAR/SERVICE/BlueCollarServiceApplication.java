package com.example.BLUE.COLLAR.SERVICE;

import com.example.BLUE.COLLAR.SERVICE.model.BlueCollarItem;
import com.example.BLUE.COLLAR.SERVICE.repository.BlueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BlueCollarServiceApplication implements CommandLineRunner {


	private BlueRepository blueRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlueCollarServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		BlueCollarItem c1 = new BlueCollarItem("hidri","low","high","good",1);
		BlueCollarItem c2 = new BlueCollarItem("hidri1","low1","high1","good1",2);
		BlueCollarItem c3 = new BlueCollarItem("hidri2","low2","high2","good2",3);
		BlueCollarItem c4 = new BlueCollarItem("hidri3","low3","high3","good3",4);

//		blueRepository.save(c1);
//		blueRepository.save(c2);
//		blueRepository.save(c3);
//		blueRepository.save(c4);
//
//		List<BlueCollarItem> blueCollarItemList = blueRepository.findAll();




	}

}
