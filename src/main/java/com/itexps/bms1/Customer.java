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
public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phone;
    private CustomerType custType;
    ArrayList<Account> accounts;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomerType getCustType() {
        return custType;
    }

    public void setCustType(CustomerType custType) {
        this.custType = custType;
    }

    public Customer(int id, String name, String email, String address, String phone, CustomerType custType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.custType = custType;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone + ", custType=" + custType + '}';
    }
    
}
