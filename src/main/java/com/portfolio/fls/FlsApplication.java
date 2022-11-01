package com.portfolio.fls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@SpringBootApplication
public class FlsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlsApplication.class, args);
	}

}
