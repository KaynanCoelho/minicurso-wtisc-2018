package com.minicurso.ms.mscoordinates.worker;

import com.minicurso.ms.mscoordinates.api.DistanceCalculatorApi;
import com.minicurso.ms.mscoordinates.entities.Coordinate;
import com.minicurso.ms.mscoordinates.services.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CoordinateWorker {

    @Autowired
    private CoordinateService coordinateService;

    @Autowired
    private DistanceCalculatorApi api;

    private List<Coordinate> coordinates;

    @PostConstruct
    public void init() {
        coordinates = coordinateService.findAllByEquipmentKey("ALV9859", new PageRequest(0, 50)).getContent();
    }

    @Scheduled(initialDelay = 10000, fixedDelay = 100)
    public void process() {
        Double distance = api.getDistance(coordinates);
        System.out.println(distance);
    }

}
