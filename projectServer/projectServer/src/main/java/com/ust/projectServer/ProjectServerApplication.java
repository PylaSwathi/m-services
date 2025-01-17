package com.ust.projectServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectServerApplication.class, args);
	}

}
