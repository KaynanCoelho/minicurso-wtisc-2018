package com.minicurso.ms.msdistancecalculator.services;

import com.minicurso.ms.msdistancecalculator.commons.HaversineDistanceUtil;
import com.minicurso.ms.msdistancecalculator.entities.Coordinate;

import java.util.List;

public class HaversineDistanceCalculator implements DistanceCalculator {


    @Override
    public Double calculateInMeters(List<Coordinate> coordinates) {
        Double total = 0.0;
        int indexA = 0;
        int indexB;

        do {
            Coordinate coordinateA = coordinates.get(indexA);
            indexB = indexA + 1;
            indexA++;
            if (indexB < coordinates.size()) {
                Coordinate coordinateB = coordinates.get(indexB);
                total += HaversineDistanceUtil.distanceInMeters(coordinateA.getPosition().getLatitude(),
                        coordinateA.getPosition().getLongitude(), coordinateB.getPosition().getLatitude(),
                        coordinateB.getPosition().getLongitude());
            }
        } while (indexB < coordinates.size());


        return total;
    }
}
