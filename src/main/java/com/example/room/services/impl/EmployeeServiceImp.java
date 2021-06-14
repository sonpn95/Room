package com.example.room.services.impl;

import com.example.room.models.entities.Employee;
import com.example.room.repositories.EmployeeRepository;
import com.example.room.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }
}
