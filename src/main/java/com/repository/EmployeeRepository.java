package com.repository;

import com.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findEmployeeByBirthday(Date birthday);
    Employee findEmployeeByUuId(String uuId);
    Employee findEmployeeByName(String name);
    int countEmployeeByEmail(String email);


}
