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
public class BusinessCustomer extends Customer{
    private String businessName;

    public BusinessCustomer(String businessName, int id, String name, String email, String address, String phone, CustomerType custType) {
        super(id, name, email, address, phone, custType);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" + "businessName=" + businessName + '}';
    }
    

}
