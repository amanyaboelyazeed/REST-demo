package com.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Employee {

    @Id
    String uuId;
    String email;
    String name;
    Date birthday;
    @DBRef
    @Field("dept")
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getUuId() {
        return uuId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }


}
