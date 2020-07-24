package com.theorganisation.controller;

import com.theorganisation.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    // post/add method
    public Employee addEmployee(Employee e) {
        System.out.println("Added Employee");
        return er.save(e);
    }
}
