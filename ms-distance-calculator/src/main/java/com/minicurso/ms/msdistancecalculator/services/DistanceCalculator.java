package com.minicurso.ms.msdistancecalculator.services;

import com.minicurso.ms.msdistancecalculator.entities.Coordinate;

import java.util.List;

public interface DistanceCalculator {

    Double calculateInMeters(List<Coordinate> coordinates);

}
