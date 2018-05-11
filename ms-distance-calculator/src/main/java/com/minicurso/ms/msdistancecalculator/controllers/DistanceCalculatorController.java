package com.minicurso.ms.msdistancecalculator.controllers;

import com.minicurso.ms.msdistancecalculator.entities.Coordinate;
import com.minicurso.ms.msdistancecalculator.services.DistanceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DistanceCalculator")
public class DistanceCalculatorController {

    @Autowired
    private DistanceCalculator distanceCalculator;

    @PostMapping
    public Double getDistance(@RequestBody List<Coordinate> coordinates) {
        System.out.println("CHEGOU AQUI");
        return distanceCalculator.calculateInMeters(coordinates);
    }

}
