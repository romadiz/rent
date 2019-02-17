package com.rent.rank.repository;

import com.rent.rank.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByUserName(String id);
    User findByEmail(Email email);

}
