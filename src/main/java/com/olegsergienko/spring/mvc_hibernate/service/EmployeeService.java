package com.olegsergienko.spring.mvc_hibernate.service;

import com.olegsergienko.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);

}