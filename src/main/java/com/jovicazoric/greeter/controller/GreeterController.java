package com.jovicazoric.greeter.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreeterController {

    private static final List<String> NAMES = List.of("Adriana", "Djordje", "Jovica", "Milos", "Sinisa", "Vuk", "Mladen");

    @GetMapping("/")
    public @ResponseBody String greetMe() {
        return NAMES.get(new Random().nextInt(NAMES.size()));
    }
}