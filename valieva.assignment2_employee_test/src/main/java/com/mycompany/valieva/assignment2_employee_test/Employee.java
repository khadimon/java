/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.valieva.assignment2_employee_test;

/**
 *
 * @author khadichabonuvalieva
 */
/*
public class Employee {
    private String first_name;
    private String last_name;
    private double monthly_salary;


    public Employee (String first_name, String last_name, double monthly_salary){
        this.first_name = first_name;
        this.last_name = last_name;
        this.monthly_salary = monthly_salary;
    }
    
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }
    
    public void setMonthlySalary(double monthly_salary){
        if (monthly_salary>0.0)
            this.monthly_salary = monthly_salary;
    }
    
    public String getFirstName(){
        return first_name;
    }

    public String getLastName(){
        return last_name;
    }
    
    public double getMonthlySalary(){
        return monthly_salary;
    }
}
*/
public class Employee {
    private String first_name;
    private String last_name;
    private double monthly_salary;

    public Employee(String first_name, String last_name, double monthly_salary) {
        setFirstName(first_name);
        setLastName(last_name);
        setMonthlySalary(monthly_salary);
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setMonthlySalary(double monthly_salary) {
        if (monthly_salary > 0.0)
            this.monthly_salary = monthly_salary;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public double getMonthlySalary() {
        return monthly_salary;
    }
}
