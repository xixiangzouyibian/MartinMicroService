package com.martin.eurekaclientfeign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MICROSERVICE")
public interface HiClient{

    @RequestMapping("/hello")
    String hi();
}
