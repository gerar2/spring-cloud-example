package com.thatdevice.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by gerardo on 08/05/2016.
 */
@RestController
public class HelloController {

    @RequestMapping ("/")
    public Principal hello(Principal principal) {
        return principal;
    }
}
