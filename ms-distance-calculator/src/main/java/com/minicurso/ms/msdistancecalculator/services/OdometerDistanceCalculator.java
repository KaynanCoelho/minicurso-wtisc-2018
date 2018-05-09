package com.minicurso.ms.msdistancecalculator.services;

import com.minicurso.ms.msdistancecalculator.entities.Coordinate;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OdometerDistanceCalculator implements DistanceCalculator {

    @Override
    public Double calculateInMeters(List<Coordinate> coordinates) {
        Coordinate firstCoordinate = findFirstCoordinate(coordinates);
        Coordinate lastCoordinate = findLastCoordinate(coordinates);
        return (double) (lastCoordinate.getOdometerMeters() - firstCoordinate.getOdometerMeters());
    }

    private Coordinate findFirstCoordinate(List<Coordinate> coordinates) {
        return Collections.min(coordinates, Comparator.comparing(Coordinate::getDate));
    }

    private Coordinate findLastCoordinate(List<Coordinate> coordinates) {
        return Collections.max(coordinates, Comparator.comparing(Coordinate::getDate));
    }
}
