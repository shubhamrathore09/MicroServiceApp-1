package com.masai.ratingServiceMirco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingServiceMircoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceMircoApplication.class, args);
	}

}
