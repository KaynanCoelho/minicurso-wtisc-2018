package com.minicurso.ms.mscoordinates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsCoordinatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCoordinatesApplication.class, args);
	}
}
