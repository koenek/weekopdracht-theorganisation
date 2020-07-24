package com.theorganisation.rest;

import com.theorganisation.controller.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class EmployeeEndpoint {

    @Autowired
    EmployeeService es;

}
