package com.promotion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.promotion.config.OpenAPI3Config;


@SpringBootApplication
@Import(OpenAPI3Config.class)
public class Application {

	public static void main(String[] args){
        SpringApplication.run(Application.class, args);
	}

}