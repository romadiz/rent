package com.rent.rank.controller;

import com.rent.rank.model.User;
import com.rent.rank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "rentRank")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/email/{email}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseEntity<User> getUserByEmail(@PathVariable(required = true) String email){
        // TODO validar correo
    }
}
