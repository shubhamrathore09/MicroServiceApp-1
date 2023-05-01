package com.masai.userServiceInMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceInMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceInMicroApplication.class, args);
	}

}
