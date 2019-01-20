package com.example.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.first.*")
public class SpringbootFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstApplication.class, args);
	}

}

