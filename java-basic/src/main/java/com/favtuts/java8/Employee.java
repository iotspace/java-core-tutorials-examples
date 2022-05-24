package com.favtuts.java8;

import java.math.BigDecimal;

public class Employee {

    String name;
    Integer age;
    BigDecimal salary;

    // generated by IDE, getters, setters, constructor, toString

    public Employee(String name, Integer age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            " name='" + getName() + "'" +
            ", age=" + getAge() +
            ", salary=" + getSalary() + 
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    
    
}
