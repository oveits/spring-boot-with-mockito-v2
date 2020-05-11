package com.vocon_it.spring_boot_with_mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
// Works also:
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class SpringBootWithMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMockitoApplication.class, args);
	}

}
