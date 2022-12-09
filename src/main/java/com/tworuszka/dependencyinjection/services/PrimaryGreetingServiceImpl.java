package com.tworuszka.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */
@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - from the PRIMARY bean";
    }
}
