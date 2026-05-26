package com.example.microservice_app.controller;

import com.example.microservice_app.response.EmployeeResponse;

import com.example.microservice_app.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/employee")

public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/{id}")

    public EmployeeResponse getEmployee(
            @PathVariable int id) {

        return service.getEmployeeById(id);

    }

}