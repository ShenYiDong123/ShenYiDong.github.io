package com.syd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@EnableDubbo(scanBasePackages="com.syd")
@SpringBootApplication
public class SeataOrderProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataOrderProviderApplication.class, args);
	}

}
