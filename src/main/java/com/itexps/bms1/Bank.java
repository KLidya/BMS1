/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class Bank {
    private int id;
    private String name;
    private String phone;
    ArrayList<Employee> employees;
    ArrayList<Customer> customers;

    public Bank(int id, String name, String phone, ArrayList<Employee> employees, ArrayList<Customer> customers) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.employees = employees;
        this.customers = customers;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", employees=" + employees + ", customers=" + customers + '}';
    }
    
}
