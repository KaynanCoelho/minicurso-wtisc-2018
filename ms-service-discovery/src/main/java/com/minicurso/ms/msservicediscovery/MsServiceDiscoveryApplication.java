package com.minicurso.ms.msservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsServiceDiscoveryApplication.class, args);
    }
}
