package com.rent.rank.repository;

import com.mongodb.client.model.geojson.Polygon;
import com.rent.rank.model.Building;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BuildingRepository extends MongoRepository<BuildingRepository, String> {

    Building findBuildingById(String id);
    Building findBuildingByAddress(String address);
    List<Building> findByLocationWithin(Polygon polygon);
}
