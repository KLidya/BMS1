/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class Employee {
    private int id;
    private String name;
    private String email;
    private String address;
    private EmployeeType empType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeType getEmpType() {
        return empType;
    }

    public void setEmpType(EmployeeType empType) {
        this.empType = empType;
    }

    public Employee(int id, String name, String email, String address, EmployeeType empType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", empType=" + empType + '}';
    }
    
    
}
