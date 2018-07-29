package com.example.jenkins.demo.service;

import com.example.jenkins.demo.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService(){
        employees = new ArrayList<>();
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
