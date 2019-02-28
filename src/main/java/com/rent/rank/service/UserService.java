package com.rent.rank.service;

import com.rent.rank.model.User;
import com.rent.rank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Transactional
    public User createUser(User user){
        if(user.getId() == null){
            return userRepository.insert(user);
        }
        return user;
    }

    @Transactional
    public User updateUser(User user){
        return userRepository.save(user);
    }

    public Iterable<User> findAll(Collection<String> userIds){
        return userRepository.findAllById(userIds);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }


}
