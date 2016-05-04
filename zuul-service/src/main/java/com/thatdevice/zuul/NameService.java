package com.thatdevice.zuul;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gerardo on 18/03/16.
 */
@Service
public class NameService {

    @Autowired
    @LoadBalanced
    private OAuth2RestOperations restTemplate;

    @HystrixCommand(fallbackMethod = "getDefaultName")
    public String getName() {
        return restTemplate.exchange("http://NAME-SERVICE/", HttpMethod.GET, null, String.class).getBody();
    }

    private String getDefaultName() {
        return "Baby";
    }

}
