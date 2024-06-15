/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project5_if_else_program;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaProject5_if_else_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        if (age >= 65){
            System.out.print("Age is greater than or equal to 65\n");
        }
        else {
            System.out.print("Age is less than 65\n");
        }
        
        if (age < 18){
            System.out.print("This person is a minor\n\n");
        }
        else {
            System.out.print("This person can legally vote\n\n");
        }
    }
}
