package com.masai.hotelServiceMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelServiceMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceMicroApplication.class, args);
	}

}
