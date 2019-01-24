package com.qjs.example.service.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qjs.example.api.api.HelloSpringBoot;
import com.qjs.example.api.response.HelloResponse;
import com.qjs.example.core.service.HelloService;

import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianjiasong
 * @date 2019/1/20
 */
@RestController
@RequestMapping("/hello")
public class HelloSpringBootController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloSpringBootController.class);

    @Autowired
    private HelloService helloService;
    @Autowired
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String serviceName;


    @GetMapping("/test")
//    @Override
    public HelloResponse helloSpringboot(@RequestParam(value = "q") @NotBlank String q) {
        LOGGER.warn("test begin");
        InstanceInfo instance = this.eurekaClient.getNextServerFromEureka(serviceName, false);
        LOGGER.warn(instance.getHomePageUrl());
        return helloService.processHello(q);
    }

    @GetMapping("/test2")
    public String serviceUrl(@RequestParam(value = "q") @NotBlank String q) {
        LOGGER.warn("test2 begin {}", serviceName);
        InstanceInfo instance = this.eurekaClient.getNextServerFromEureka(serviceName, false);
        return instance.getHomePageUrl();
    }

}
