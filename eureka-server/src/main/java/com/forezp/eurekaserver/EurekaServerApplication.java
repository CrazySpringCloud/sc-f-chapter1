package com.forezp.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);

	public static void main(String[] args) {
		logger.info("服务注册中心 Eureka Server begin to start......");
		SpringApplication.run(EurekaServerApplication.class, args);
		logger.info("服务注册中心 Eureka Server started......");
	}

}
