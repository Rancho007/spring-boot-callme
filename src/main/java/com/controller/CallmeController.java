package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallmeController {


    private static String name = "call-me";

    private static String version = "v2";

    private static final Logger LOGGER = LoggerFactory.getLogger(CallmeController.class);

    @RequestMapping("/ping")
    public String ping() {
        LOGGER.info("Ping: name={}, version={}", name, version);
        return name + ":" + version;
    }

}
