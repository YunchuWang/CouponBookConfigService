package com.couponbook.ConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
//		System.out.println(System.getProperty("java.class.path"));
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
