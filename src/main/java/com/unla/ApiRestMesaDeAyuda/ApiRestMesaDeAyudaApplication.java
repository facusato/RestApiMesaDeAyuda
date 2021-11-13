package com.unla.ApiRestMesaDeAyuda;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ApiRestMesaDeAyudaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestMesaDeAyudaApplication.class, args);
	}

}
