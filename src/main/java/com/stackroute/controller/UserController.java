package com.stackroute.controller;

import com.stackroute.service.UserService;
import com.stackroute.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    ResponseEntity responseEntity;

    private UserService userService;

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping
//    public Collection<User> getAll() {
//        return userService.getAllUsers();
//    }

    @PostMapping(value ="/user")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        responseEntity = new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
        return responseEntity;
    }


}
