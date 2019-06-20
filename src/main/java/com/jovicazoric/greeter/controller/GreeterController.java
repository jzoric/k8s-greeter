package com.jovicazoric.greeter.controller;

import com.jovicazoric.greeter.model.Person;
import com.jovicazoric.greeter.service.PersonService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Data
public class GreeterController {

    private final PersonService personService;

    @GetMapping("/")
    public @ResponseBody
    List<Person> greetMe() {
        return personService.getAll();
    }
}
