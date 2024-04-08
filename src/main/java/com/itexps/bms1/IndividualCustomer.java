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
public class IndividualCustomer extends Customer{
    private String socialSecurityNumber;
    private String occupation;
    private double incomeLevel;

    public IndividualCustomer(String socialSecurityNumber, String occupation, double incomeLevel, int id, String name, String email, String address, String phone, CustomerType custType) {
        super(id, name, email, address, phone, custType);
        this.socialSecurityNumber = socialSecurityNumber;
        this.occupation = occupation;
        this.incomeLevel = incomeLevel;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getIncomeLevel() {
        return incomeLevel;
    }

    public void setIncomeLevel(double incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" + "socialSecurityNumber=" + socialSecurityNumber + ", occupation=" + occupation + ", incomeLevel=" + incomeLevel + '}';
    }
    
}
