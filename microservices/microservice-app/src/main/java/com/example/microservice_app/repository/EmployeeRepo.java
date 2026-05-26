package com.example.microservice_app.repository;

import com.example.microservice_app.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo
        extends JpaRepository<Employee, Integer> {

}