package com.minicurso.ms.msdistancecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsDistanceCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDistanceCalculatorApplication.class, args);
    }
}
