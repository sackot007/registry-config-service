package com.kohls.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RegistryConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryConfigurationServerApplication.class, args);
	}
}
