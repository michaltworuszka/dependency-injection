package com.tworuszka.dependencyinjection.controllers;

import com.tworuszka.dependencyinjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */
class SetterInjectedControllerTest {

    SetterInjectedController underTest;

    @BeforeEach
    void setUp() {
        underTest = new SetterInjectedController();
        underTest.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(underTest.getGreeting());
    }
}