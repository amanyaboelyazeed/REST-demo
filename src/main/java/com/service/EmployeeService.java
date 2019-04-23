package com.service;

import com.entity.Employee;
import com.repository.DepartmentRepository;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    @Autowired
    DepartmentRepository deptRepository;

    public void addOrUpdateEmployee(Employee employee) {
         if(employee.getEmail() != null && empRepository.countEmployeeByEmail(employee.getEmail()) > 0) {
            //TODO : throw exception

         }
         else {
             empRepository.save(employee);
         }
    }

    public void deleteEmployee(Employee employee) {
        empRepository.delete(employee);
    }

    public List<Employee> findAllEmployees() {
        return empRepository.findAll();
    }

    public  Employee findEmployeeById(String uuId) {
        return empRepository.findEmployeeByUuId(uuId);
    }




}
