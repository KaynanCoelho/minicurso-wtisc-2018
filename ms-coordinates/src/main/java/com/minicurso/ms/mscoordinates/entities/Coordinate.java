package com.minicurso.ms.mscoordinates.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Coordinate {

    @Id
    private String id;
    private String equipmentKey;
    private Position position;
    private Long odometerMeters;
    private Double speedKmh;
    private Boolean engineOn;
    private Date date;

    public Coordinate() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipmentKey() {
        return equipmentKey;
    }

    public void setEquipmentKey(String equipmentKey) {
        this.equipmentKey = equipmentKey;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getOdometerMeters() {
        return odometerMeters;
    }

    public void setOdometerMeters(Long odometerMeters) {
        this.odometerMeters = odometerMeters;
    }

    public Double getSpeedKmh() {
        return speedKmh;
    }

    public void setSpeedKmh(Double speedKmh) {
        this.speedKmh = speedKmh;
    }

    public Boolean getEngineOn() {
        return engineOn;
    }

    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "id='" + id + '\'' +
                ", equipmentKey='" + equipmentKey + '\'' +
                ", position=" + position +
                ", odometerMeters=" + odometerMeters +
                ", speedKmh=" + speedKmh +
                ", engineOn=" + engineOn +
                ", date=" + date +
                '}';
    }
}
