package com.ibm.healthplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HealthplannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthplannerApplication.class, args);
	}

}
