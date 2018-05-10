package com.minicurso.ms.msconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableConfigServer
@SpringCloudApplication
public class MsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigServerApplication.class, args);
    }
}
