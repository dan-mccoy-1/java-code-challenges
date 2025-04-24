package com.danmccoy.codeChallenges.controller;

import com.danmccoy.codeChallenges.service.UserService.UserService;
import com.danmccoy.codeChallenges.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("api/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();

        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
