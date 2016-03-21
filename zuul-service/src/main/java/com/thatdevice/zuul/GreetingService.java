package com.thatdevice.zuul;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gerardo on 18/03/16.
 */
@Service
public class GreetingService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getDefaultGreeting")
    public String getGreeting() {
        return restTemplate.exchange("http://GREETING-SERVICE/", HttpMethod.GET, null, String.class).getBody();
    }

    private String getDefaultGreeting() {
        return "Hasta la vista";
    }
}