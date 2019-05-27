package com.cajuina.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CajuinaApp {
	public static void main(String[] args) {
		SpringApplication.run(CajuinaApp.class, args);
	}
}
