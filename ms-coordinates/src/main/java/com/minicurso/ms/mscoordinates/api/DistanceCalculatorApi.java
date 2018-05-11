package com.minicurso.ms.mscoordinates.api;

import com.minicurso.ms.mscoordinates.entities.Coordinate;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "ms-distance-calculator-kaynan", configuration = FeignAutoConfiguration.class)
public interface DistanceCalculatorApi {


    @RequestMapping(method = RequestMethod.POST, value = "/DistanceCalculator")
    Double getDistance(List<Coordinate> coordinates);

}
