package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
    public void run(ApplicationArguments args) throws Exception {
        long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			personRepository.save(new Person("John", "Doe", i));
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to load 1000 persons: " + (end - start) + " ms");
    }
}
