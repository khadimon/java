/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project4_account;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 * 
 * Author: Khadichabonu Valieva
 * Date: 9-25-2023
 */
public class ValievaProject4_account {

    public static void main(String[] args) {
       
        Account account1 = new Account("Jane Gree", 50.00);
        Account account2 = new Account("John Blue", -7.53);
    
        System.out.printf("%s balance: $%.2f%n", account1.getName(),
                account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(),
                account2.getBalance());
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account balance %n%n",
                depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        
        
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account balance %n%n",
                depositAmount);
        account2.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        
        System.out.print("Enter debit amount for account1: ");
        double debitAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account balance %n%n",
                debitAmount);
        account1.debit(debitAmount);
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        
        System.out.print("Enter debit amount for account2: ");
        debitAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account balance %n%n",
                debitAmount);
        account2.debit(debitAmount);
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
        
        
    }
}
