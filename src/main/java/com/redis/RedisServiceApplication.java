package com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedisServiceApplication {

	@RequestMapping("/healthCheck")
	String healthCheck() {
		return "Hello This Is Redis Service";
	}

	public static void main(String[] args) {
		SpringApplication.run(RedisServiceApplication.class, args);
	}
}
