package com.rent.rank.repository;

import com.rent.rank.model.Rent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RentRepository extends MongoRepository<Rent, String> {

    List<Rent> findByHomeId(String homeId);
    List<Rent> findByUserId(String userId);
    List<Rent> findByHomeIdAndUserId(String homeId, String userId);
    Rent findByHomeIdAndUserIdAndStartDate(String homeId, String userId, Date startDate);
    List<Rent> findByHomeIdAndStartDate(String homeId, Date startDate);

}
