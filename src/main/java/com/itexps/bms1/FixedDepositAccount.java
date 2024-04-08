/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class FixedDepositAccount {
    private int termInMonths;
    private double interestRate;

    public FixedDepositAccount(int termInMonths, double interestRate) {
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "FixedDepositAccount{" + "termInMonths=" + termInMonths + ", interestRate=" + interestRate + '}';
    }
    
}
