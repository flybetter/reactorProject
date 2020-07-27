package com.michael.reactorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ReactorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactorProjectApplication.class, args);
	}

}
