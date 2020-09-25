package com.martin.eurekaclientfeign.test;

import com.martin.eurekaclientfeign.proxy.HiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiClient hiClient;

    @RequestMapping("/hi")
    public String hi() {
        return hiClient.hi();
    }
}
