package com.thatdevice.zuul;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gerardo on 18/03/16.
 */

@RestController
public class GreetingPersonController {

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private NameService nameService;

    @RequestMapping("/greeting-person")
    public String greetingPerson() {

        return greetingService.getGreeting() + " " + nameService.getName();

    }
}
