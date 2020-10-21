package com.forezp.servicehi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ServiceHiApplication.class);

	public static void main(String[] args) {
		logger.info("服务提供者SERVICE-HI begin to start......");
		SpringApplication.run(ServiceHiApplication.class, args);
		logger.info("服务提供者SERVICE-HI started......");
	}


	@Value("${server.port}")
	String port;


	@RequestMapping("/hi")
	public String home(@RequestParam(value="name", defaultValue = "forezp") String name) {
		return "hi " + name + ", i am from port:" + port;
	}

}
