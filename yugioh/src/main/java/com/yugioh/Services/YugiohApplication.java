package com.yugioh.Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.yugioh.Repository") // ← Escanea repositorios
@EntityScan("com.yugioh.Entity") // ← Escanea entidades
@ComponentScan(basePackages = {"com.yugioh.Services", "com.yugioh.Controllers", "com.yugioh.Repository", "com.yugioh.Entity"})


public class YugiohApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(YugiohApplication.class, args);
		
	}

}
