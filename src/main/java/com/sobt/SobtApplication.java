package com.sobt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.sobt.controller"})
public class SobtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SobtApplication.class, args);
	}

}
