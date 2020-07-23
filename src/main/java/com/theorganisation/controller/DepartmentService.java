package com.theorganisation.controller;

import com.theorganisation.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    DepartmentRepository dr;

    /*
    - post
    - get(all)
    - get by id
    - get by name
    - delete by id
    - update by id
    */

    // post/add method
    public Department addDepartment(Department dp) {
        System.out.println("Added department");
        return dr.save(dp);
    }

    // get all departments method
    public Iterable<Department> getAllDepartments() {
        System.out.println("Request for all departments received");
        return dr.findAll();
    }

    // get department by id
    public Department getById(long id) {
        System.out.println("Request for department based on id received");
        return dr.findById(id).get();
    }

    // get department by name
    public Department getByName(String name) {
        System.out.println("Request for department based on name received");
        for (Department d : getAllDepartments()) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public void deleteById(long id) {
        System.out.println("Request received to delete department based on id");
        dr.deleteById(id);
    }

    public Department updateById(long id, Department dp) {
        System.out.println("Request received to update department based on id");
        Department d = getById(id);
        if (dp.getName() != null && dp.getName() != "") {
            d.setName(dp.getName());
        }
        return dr.save(d);
    }
}
