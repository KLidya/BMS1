/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class FullTimeEmployee extends Employee {
    private float salary;

    public FullTimeEmployee(float salary, int id, String name, String email, String address, EmployeeType empType) {
        super(id, name, email, address, empType);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "salary=" + salary + '}';
    }

}
