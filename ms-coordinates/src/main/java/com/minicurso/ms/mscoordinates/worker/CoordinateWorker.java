package com.minicurso.ms.mscoordinates.worker;

import com.minicurso.ms.mscoordinates.entities.Coordinate;
import com.minicurso.ms.mscoordinates.services.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CoordinateWorker {

    @Autowired
    private CoordinateService coordinateService;

    @PostConstruct
    public void init() {
        List<Coordinate> coordinates = coordinateService.findAllByEquipmentKey("ALV9859", new PageRequest(0, 50)).getContent();
        coordinates.forEach(coordinate -> System.out.println(coordinate.toString()));
    }

}
