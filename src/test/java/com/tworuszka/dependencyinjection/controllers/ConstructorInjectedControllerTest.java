package com.tworuszka.dependencyinjection.controllers;

import com.tworuszka.dependencyinjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController underTest;

    @BeforeEach
    void setUp() {
        underTest = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(underTest.getGreeting());
    }
}