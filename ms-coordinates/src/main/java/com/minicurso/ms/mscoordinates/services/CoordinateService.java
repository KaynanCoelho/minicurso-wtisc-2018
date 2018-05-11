package com.minicurso.ms.mscoordinates.services;

import com.minicurso.ms.mscoordinates.entities.Coordinate;
import com.minicurso.ms.mscoordinates.repository.CoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CoordinateService {

    @Autowired
    private CoordinateRepository coordinateRepository;

    public Page<Coordinate> findAllByEquipmentKey(String equipmentKey, Pageable page) {
        return coordinateRepository.findAllByEquipmentKeyOrderByDateAsc(equipmentKey, page);
    }

}
