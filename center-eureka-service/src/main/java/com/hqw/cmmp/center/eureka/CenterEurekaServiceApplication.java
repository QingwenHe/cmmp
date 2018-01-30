package com.hqw.cmmp.center.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CenterEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CenterEurekaServiceApplication.class, args);
	}
}
