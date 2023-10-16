package com.example.smoothies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories("com.example.smoothies.repository")
public class SmoothiesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmoothiesAppApplication.class, args);
	}

}
