/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.assignment2_employee_test;

/**
 *
 * @author khadichabonuvalieva
 */

public class ValievaAssignment2_employee_test {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Rick", "Sanchez", 5000);
        Employee employee2 = new Employee("Morty", "Smith", 1000);

        System.out.printf("%n%s %s Monthly Salary: $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(), employee1.getMonthlySalary());
        System.out.printf("%s %s Monthly Salary: $%.2f%n", employee2.getFirstName(),
                employee2.getLastName(), employee2.getMonthlySalary());

        double yearly_salary1 = 12 * employee1.getMonthlySalary();
        System.out.printf("%nYearly Salary of Employee1: $%.2f%n", yearly_salary1);
        double yearly_salary2 = 12 * employee2.getMonthlySalary();
        System.out.printf("Yearly Salary of Employee2: $%.2f%n", yearly_salary2);

        double raise_to_monthly_salary1 = employee1.getMonthlySalary() * 1.1;
        System.out.printf("%nMonthly Salary of Employee1 after 10%% raise: $%.2f%n", raise_to_monthly_salary1);
        double raise_to_monthly_salary2 = employee2.getMonthlySalary() * 1.1;
        System.out.printf("Monthly Salary of Employee2 after 10%% raise: $%.2f%n", raise_to_monthly_salary2);

        double raise_to_yearly_salary1 = yearly_salary1 * 1.1;
        System.out.printf("%nYearly Salary of Employee1 after 10%% raise: $%.2f%n", raise_to_yearly_salary1);
        double raise_to_yearly_salary2 = yearly_salary2 * 1.1;
        System.out.printf("Yearly Salary of Employee2 after 10%% raise: $%.2f%n", raise_to_yearly_salary2);
    }
}
