package com.slokam.Eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Eurekaclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient2Application.class, args);
	System.out.println("client2");
	}
	

	
}
