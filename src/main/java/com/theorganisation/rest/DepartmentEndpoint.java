package com.theorganisation.rest;

import com.theorganisation.controller.DepartmentService;
import com.theorganisation.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentEndpoint {

    @Autowired
    DepartmentService ds;

    /*
    - post
    - get(all)
    - get by id
    - get by name
    - delete by id
    - update by id
    */

    @PostMapping("/new")
    public Department addDepartment(@RequestBody Department dp) {
        return ds.addDepartment(dp);
    }

    @GetMapping("/all")
    public Iterable<Department> getDepartments() {
        return ds.getAllDepartments();
    }

    @GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable(value="id")long id) {
        return ds.getById(id);
    }

    // Doesn't work correctly as of now(returns empty department if nothing is found)
    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable(value="name")String name) {
        return ds.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable(value="id") long id) {
        ds.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Department updateDepartmentById(@PathVariable(value="id")long id, @RequestBody Department dp) {
        return ds.updateById(id, dp);
    }



}
