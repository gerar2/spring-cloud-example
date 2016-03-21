package com.thatdevice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gerardo on 18/03/16.
 */
public class Names {

    private List<String> names;
    private Random random;


    public Names(String names) {
        this.names = Stream.of(names.split(",")).collect(Collectors.toList());
        this.random = new Random();
    }

    public String getName() {
        return names.get(random.nextInt(names.size()));
    }

    public List<String> getAllNames() {
        return names;
    }

}
