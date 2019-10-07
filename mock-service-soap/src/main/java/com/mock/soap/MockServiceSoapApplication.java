package com.mock.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MockServiceSoapApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MockServiceSoapApplication.class, args);
	}

}
