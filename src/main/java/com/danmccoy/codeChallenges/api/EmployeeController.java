package com.danmccoy.codeChallenges.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// A very simple (but operational) API.
// This can be built upon in future tutorials/code challenges/personal learning projects.

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{employeeId}")
    public String getEmployee(@PathVariable String employeeId){
        return "Employee found: " + employeeId;
    };
}
