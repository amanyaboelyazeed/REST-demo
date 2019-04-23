package com.repository;

import com.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {

    public Department findDepartmentById(String id);
    public Department findDepartmentByName(String name);

}
