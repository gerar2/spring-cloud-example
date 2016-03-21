package com.thatdevice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * Created by gerardo on 18/03/16.
 */
@Configuration
public class Config {

    @Bean
    public Names names (@Value("${names}") String names) {
        return new Names(names);
    }

    @Bean
    public UUID instanceId() {
        return UUID.randomUUID();
    }
}
