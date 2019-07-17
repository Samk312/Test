package com.sameer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat;

@SpringBootApplication(scanBasePackages = {"com.sameer.springboot"}) 
public class SpringMultiplePortApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiplePortApplication.class, args);
	}
}
