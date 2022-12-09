package com.tworuszka.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
