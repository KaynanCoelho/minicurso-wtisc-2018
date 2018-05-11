package com.minicurso.ms.mscoordinates.repository;

import com.minicurso.ms.mscoordinates.entities.Coordinate;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends MongoRepository<Coordinate, String> {

    Page<Coordinate> findAllByEquipmentKey(String equipmentKey);
}
