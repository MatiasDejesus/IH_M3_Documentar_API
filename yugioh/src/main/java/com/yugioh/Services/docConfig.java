package com.yugioh.Services;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration

public class docConfig {


 @Bean

 public OpenAPI customOpenAPI() {

 return new OpenAPI()

 .info(new Info()

 .title("Mi API de YUGIOH")

 .version("1.0.0")

 .description("CRUD incompleto con base de datos de Cartas y perosnajes de YUGIOH"));

 }

}
