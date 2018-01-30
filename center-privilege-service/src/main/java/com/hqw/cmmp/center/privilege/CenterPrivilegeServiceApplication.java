package com.hqw.cmmp.center.privilege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CenterPrivilegeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CenterPrivilegeServiceApplication.class, args);
	}
}
