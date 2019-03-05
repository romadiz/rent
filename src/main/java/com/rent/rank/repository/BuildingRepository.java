package com.rent.rank.repository;

import com.mongodb.client.model.geojson.Polygon;
import com.rent.rank.model.Building;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends MongoRepository<Building, String> {

    Building findBuildingByBuildingId(long buildingId);
    Building findBuildingByAddress(String address);
    List<Building> findByLocationWithin(Polygon polygon);
}
