package com.forezp.servicefeign.feign;


import com.forezp.servicefeign.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = HelloHystrix.class)
public interface HelloFeignClient {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
