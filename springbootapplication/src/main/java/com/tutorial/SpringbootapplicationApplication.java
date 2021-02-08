package com.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootapplicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringbootapplicationApplication.class, args);
		System.out.println("welcome to springboot..");
	}

}
