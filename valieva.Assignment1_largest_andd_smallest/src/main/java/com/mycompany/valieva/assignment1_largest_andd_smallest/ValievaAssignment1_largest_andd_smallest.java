/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.assignment1_largest_andd_smallest;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaAssignment1_largest_andd_smallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        System.out.print("Enter forth number: ");
        int num4 = input.nextInt();
        
        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
       
        int smallest=num1;
        int largest=num1;
        
        if (num2>largest)
            largest=num2;
        if (num3>largest)
            largest=num3;
        if (num4 >largest)
            largest=num4;
        if (num5 > largest)
            largest=num5;
        
        if (num2<smallest)
            smallest=num2;
        if (num3<smallest)
            smallest=num3;
        if (num4 <smallest)
            smallest=num4;
        if (num5 <smallest)
            smallest=num5;
        
        
        System.out.printf('\n' + "The largest number: " + largest + '\n');
        System.out.printf("The smallest number: " + smallest);
    }
}
