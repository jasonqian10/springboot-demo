package com.qjs.example.service.controller;

import com.qjs.example.api.api.HelloSpringBoot;
import com.qjs.example.api.response.HelloResponse;
import com.qjs.example.core.service.HelloService;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
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
public class HelloSpringBootController implements HelloSpringBoot {

    @Autowired
    private HelloService helloService;

    @GetMapping("/test")
    @Override
    public HelloResponse helloSpringboot(@RequestParam(value = "q") @NotBlank String q) {
        return helloService.processHello(q);
    }
}
