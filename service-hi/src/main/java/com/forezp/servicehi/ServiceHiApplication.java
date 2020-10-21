package com.forezp.servicehi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ServiceHiApplication.class);

	public static void main(String[] args) {
		logger.info("服务提供者SERVICE-HI begin to start......");
		SpringApplication.run(ServiceHiApplication.class, args);
		logger.info("服务提供者SERVICE-HI started......");
	}
}
