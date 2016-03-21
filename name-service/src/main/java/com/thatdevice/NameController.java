package com.thatdevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by gerardo on 18/03/16.
 */
@RestController
public class NameController {

    @Autowired
    public Names names;

    @Autowired
    public UUID uuid;

    @RequestMapping("/")
    public String name() {
        return names.getName();
    }

    @RequestMapping("/instance")
    public UUID getInstance() {
        return uuid;
    }


}
