package com.ust.m_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MConfigApplication.class, args);
	}

}
