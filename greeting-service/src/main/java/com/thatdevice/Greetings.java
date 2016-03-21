package com.thatdevice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gerardo on 17/03/16.
 */
public class Greetings {
    private List<String> greetings;
    private Random random;

    Greetings (String greetings) {
        this.greetings = Stream.of(greetings.split(",")).collect(Collectors.toList());
        this.random = new Random();
    }

    public String getGreeting() {
        return greetings.get(random.nextInt(greetings.size()));
    }

    public List<String> getAllGreetings () {
        return greetings;
    }
}
