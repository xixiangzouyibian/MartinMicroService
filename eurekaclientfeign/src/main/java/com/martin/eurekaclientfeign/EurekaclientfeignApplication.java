package com.martin.eurekaclientfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.martin" })
@EnableEurekaClient
@EnableFeignClients
public class EurekaclientfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientfeignApplication.class, args);
	}
}
