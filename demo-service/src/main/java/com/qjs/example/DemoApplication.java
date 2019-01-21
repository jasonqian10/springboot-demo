package com.qjs.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		new SpringApplicationBuilder(DemoApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.run(args);
	}

}

