package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;


    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public List<Employee> findAllEmployees() {
        return this.empService.findAllEmployees();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public  Employee findEmployeeById (@PathVariable("id") String id) {
        return this.empService.findEmployeeById(id);
    }


}
