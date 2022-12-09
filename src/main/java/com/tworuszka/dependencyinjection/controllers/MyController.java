package com.tworuszka.dependencyinjection.controllers;

import com.tworuszka.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
