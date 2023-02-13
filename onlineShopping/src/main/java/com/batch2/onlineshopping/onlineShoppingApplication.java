package com.batch2.onlineshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity( prePostEnabled = true)
public class onlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(onlineShoppingApplication.class, args);
	}

}
