package com.qjs.example.core.service;

import com.qjs.example.api.response.HelloResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author qianjiasong
 * @date 2019/1/20
 */
@Service
public class HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

    public HelloResponse processHello(String q) {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setCode("200");
        helloResponse.setMessage("Hello springboot");
        LOGGER.warn("result: {}", helloResponse);
        return helloResponse;
    }
}
