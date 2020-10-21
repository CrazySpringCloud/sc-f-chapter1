package com.forezp.servicefeign.hystrix;

import com.forezp.servicefeign.feign.HelloFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloFeignClient{

    @Override
    public String sayHiFromClientOne(String name) {
        return "I am sorry," + name + ",程序崩溃了耶～";
    }
}
