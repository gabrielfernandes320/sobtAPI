package com.sobt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages={"com.sobt.controller"})
public class SobtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SobtApplication.class, args);
	}

}
