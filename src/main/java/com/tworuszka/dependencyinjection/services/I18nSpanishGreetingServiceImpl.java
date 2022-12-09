package com.tworuszka.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Michał Tworuszka
 * @project dependency-injection
 */

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
