package com.forezp.servicezuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceZuulApplication {

	private static final Logger logger = LoggerFactory.getLogger(ServiceZuulApplication.class);

	public static void main(String[] args) {
		logger.info("动态路由 service-zuul begin to start......");
		SpringApplication.run(ServiceZuulApplication.class, args);
		logger.info("动态路由 service-zuul started......");
	}

}
