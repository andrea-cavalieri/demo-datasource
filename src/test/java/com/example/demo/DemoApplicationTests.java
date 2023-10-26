package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonRepository;

//@SpringBootTest
@DataJpaTest 
class DemoApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
		
		//load 1000 different persons
		//calculate time taken to load 1000 persons
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			personRepository.save(new Person("John", "Doe", i));
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to load 1000 persons: " + (end - start) + " ms");
	
	}

}
