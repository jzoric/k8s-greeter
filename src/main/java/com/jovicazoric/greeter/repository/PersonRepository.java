package com.jovicazoric.greeter.repository;

import com.jovicazoric.greeter.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
