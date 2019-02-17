package com.rent.rank.service;

import com.mongodb.client.model.geojson.Polygon;
import com.rent.rank.model.Building;
import com.rent.rank.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public Building findByAddress(String address){
        return buildingRepository.findBuildingByAddress(address);
    }

    public List<Building> findByPlygon(Polygon polygon){
        return buildingRepository.findByLocationWithin(polygon);
    }
}
