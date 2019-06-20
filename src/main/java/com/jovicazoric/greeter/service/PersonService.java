package com.jovicazoric.greeter.service;

import com.jovicazoric.greeter.model.Person;
import com.jovicazoric.greeter.repository.PersonRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
