package com.ticket.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages="com.ticket.demo")
@SpringBootApplication
public class TrainresApplication implements CommandLineRunner {

	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private VbookRepository vbookRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrainresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Train t1 = new Train("1", "memo", "1000", "Pune", "Noida", "Express", 250l, 1447l, 300, 10, 21, 2);
		Train t2 = new Train("2", "hali", "2000", "Ahmedabad", "Mumbai", "Express", 350l, 534l, 300, 9, 16, 1);

		trainRepository.save(t1);
		trainRepository.save(t2);

		System.out.println("*********");

		List<Train> trains = trainRepository.findAll();

		for (Train t : trains) {
			System.out.println(t.toString());
		}

		User u1 = new User("101", "abc@gmail.com", "ram", "abc", "9876543210", 1990 - 12 - 01);
		User u2 = new User("102", "def@gmail.com", "dev", "def", "9876543211", 1990 - 11 - 01);

		userRepository.save(u1);
		userRepository.save(u2);

		System.out.println("*********");

		List<User> users = userRepository.findAll();

		for (User u : users) {
			System.out.println(u.toString());
		}
		
		
		
		Vbook v1= new Vbook("1","memo","1000","Pune", "Noida",250l);
		vbookRepository.save(v1);
		
		System.out.println("*********");
		
		List<Vbook> vbooks = vbookRepository.findAll();

		for (Vbook v : vbooks) {
			System.out.println(v.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
