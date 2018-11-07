package com.example.reyadmahabub.myapplication;

import java.io.Serializable;

/**
 * Created by ReyadMahabub on 11/6/2018.
 */

public class Student implements Serializable {
    private String name;
    private String department;
    private String roll;
    private String age;

    public Student() {
    }

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Student(String name, String department, String roll, String age) {
        this.name = name;
        this.department = department;
        this.roll = roll;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
