/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.valieva.project4_account;

/**
 *
 * @author khadichabonuvalieva
 * 
 * Author: Khadichabonu Valieva
 */
public class Account {
    private String name;
    private double balance;
    
    public Account(String name, double balance)
    {
        this.name = name;
        
        if (balance>0.0){
            this.balance = balance;
        }
    }  
    
    public void deposit (double depositAmount){
        if (depositAmount>0.0){
            balance += depositAmount;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName (){
        return name;
    }
    
    public void debit (double debitAmount){
        if (debitAmount>balance){
            System.out.printf("%nDebit amount exceeded amount balance!%n%n");
        }
        else{
            balance -= debitAmount;
        }
    }
       
}
