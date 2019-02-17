package com.rent.rank.repository;

import com.rent.rank.model.Apartment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApartmentRepository extends MongoRepository<Apartment, String> {

    List<Apartment> findByBuildingId(String buildingId);
    List<Apartment> findByBuildingIdAndFloor(String buildingId, int floor);
    Apartment findByBuildingIdAndFloorAndDoor(String buildingId, int floor, String door);
}
