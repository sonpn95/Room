package com.example.room.controllers;

import com.example.room.models.entities.Employee;
import com.example.room.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public Employee register(@RequestBody Employee employee) {
        employee.setPassword(new BCryptPasswordEncoder().encode(employee.getPassword()));
        return employeeService.createEmployee(employee);
    }
}
