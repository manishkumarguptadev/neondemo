package com.example.neondemo.dao;

import com.example.neondemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO{
    List<Employee> findAll();

}
