package com.martin.eurekaclientfeign.test;

import com.martin.eurekaclientfeign.proxy.HiClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiClient hiClient;

//    @RequestMapping("/hi")
//    public String hi() {
//        return hiClient.hi();
//    }

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "fallBack",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "5000"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "30"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000")

            })
    public String hi() {
        return hiClient.hi();
    }

    //fallback
    public String fallback() {
        return "This ia hystrix fallback";
    }
}
