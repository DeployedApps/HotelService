package com.jat.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info = @Info(title = "This Hotel API Microservices", version = "3.0", description = "It contains Hotel Information along with ratings & other criteria. API is powered by salient features of Spring Boot e.g. resilence4j, ratelimiters, circuitbreakers" +
		"and further to specify by Feign client. The api will be being consumed by Rating Services Api & finally Hotel Services API. It is already registered on Eurka server " +
		"https://serviceregitsry-production.up.railway.app/ whereas planned to be protected by Okta Auth & JWT"))
@ApiOperation("It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER,API-GATWAY, DOCUMENT SERVER & SPING SECURITY with OKTA AUTH")
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}

}
