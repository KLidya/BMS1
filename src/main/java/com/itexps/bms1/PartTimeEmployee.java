/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class PartTimeEmployee extends Employee{
    private int hours;
    private float hourlyrate;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(float hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public PartTimeEmployee(int hours, float hourlyrate, int id, String name, String email, String address, EmployeeType empType) {
        super(id, name, email, address, empType);
        this.hours = hours;
        this.hourlyrate = hourlyrate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "hours=" + hours + ", hourlyrate=" + hourlyrate + '}';
    }
    
}
