package com.danmccoy.codeChallenges.service.UserService;

import com.danmccoy.codeChallenges.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final String API_URL = "https://jsonplaceholder.typicode.com/users";

    @Autowired
    private RestTemplate restTemplate;

    public List<User> getUsers() {
        User[] users = restTemplate.getForObject(API_URL, User[].class);
        return Arrays.asList(users);
    }
}
