package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer

@SpringBootApplication
public class Proy2MicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proy2MicroserviceConfigServerApplication.class, args);
	}

}
