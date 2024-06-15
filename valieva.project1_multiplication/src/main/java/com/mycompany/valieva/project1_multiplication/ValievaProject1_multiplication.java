/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project1_multiplication;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaProject1_multiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        int mult = num1 * num2;
        System.out.printf("Multiplication is " + mult);
    }
}


