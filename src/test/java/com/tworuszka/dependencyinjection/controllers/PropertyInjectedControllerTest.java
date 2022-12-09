package com.tworuszka.dependencyinjection.controllers;

import com.tworuszka.dependencyinjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController underTest;

    @BeforeEach
    void setUp() {
        underTest = new PropertyInjectedController();
        underTest.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(underTest.getGreeting());

    }
}