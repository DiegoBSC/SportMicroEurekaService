package com.sport.system.play.sporteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SportSportEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportSportEurekaServiceApplication.class, args);
	}

}
