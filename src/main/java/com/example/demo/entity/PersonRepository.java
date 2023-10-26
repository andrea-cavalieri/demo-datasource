//create PersonRepository.java
package com.example.demo.entity;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    
}