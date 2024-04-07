/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class Account {
    private int id;
    private float balance;
    private AccountType accType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public AccountType getAccType() {
        return accType;
    }

    public void setAccType(AccountType accType) {
        this.accType = accType;
    }

    public Account(int id, float balance, AccountType accType) {
        this.id = id;
        this.balance = balance;
        this.accType = accType;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", accType=" + accType + '}';
    }
    
}
