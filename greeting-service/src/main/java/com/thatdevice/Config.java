package com.thatdevice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * Created by gerardo on 17/03/16.
 */
@Configuration
public class Config {

    @Bean
    public UUID instanceId () {
        return UUID.randomUUID();
    }

    @Bean
    public Greetings greetings (@Value("${greetings}") String greetings) {
        return new Greetings(greetings);
    }
}
