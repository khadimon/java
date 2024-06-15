/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project7_palindrome;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 * Author: Khadi Valieva
 * Program: Palindrome
 */
public class ValievaProject7_palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number, digits;
        
        do{
        System.out.print("Enter a five-digit integer: ");
        number = input.nextInt();
        digits = String.valueOf(number).length();
       
        
            if (digits!=5 || number<0 ){
                System.out.print("Error! Detected a zero, a negative or non-five-digit number. Please, try again.\n\n");
            }
        } while(digits!=5);
       
        
        int digit1 = number / 10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) / 10;
        int digit5 = number % 10;
        
        if (digit1 == digit5 && digit2==digit4){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}



