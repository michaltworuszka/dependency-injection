package com.tworuszka.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
