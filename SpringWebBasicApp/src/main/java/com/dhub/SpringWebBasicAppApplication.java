package com.dhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebBasicAppApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/dhub");
		SpringApplication.run(SpringWebBasicAppApplication.class, args);
	}

}
