package com.rent.rank.repository;

import com.rent.rank.model.House;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {

    House findByAddress(String address);
    House findByLocation(GeoJsonPoint location);

}
