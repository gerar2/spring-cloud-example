package com.thatdevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by gerardo on 15/03/16.
 */

@RestController
public class GreetingController {

    @Autowired
    private UUID instanceID;

    @Autowired
    private Greetings greetings;

    @RequestMapping("/")
    String greetingMessage () {
        return greetings.getGreeting();
    }

    @RequestMapping("/instance")
    String instance() {
        return instanceID.toString();
    }

}
