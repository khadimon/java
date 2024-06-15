/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva_css346_final;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author khadichabonuvalieva
 */
public class Valieva_css346_final {

    public static void main(String[] args) {
        
        //program 1
        System.out.print("---------- Program 1 ----------\n");
        int[] count = new int[10];
        
        SecureRandom random = new SecureRandom();
        for (int i=0; i<100; i++){
            int randomNumber = random.nextInt(10);
            count[randomNumber]++;
        }
        
        for (int i=0; i<count.length; i++){
            System.out.printf("Count of %d's: %d%n", i, count[i]);
        }
      
        
        //program 2
        System.out.print("\n\n---------- Program 2 ----------\n");
        int[] numbers = new int[10];
        
        Scanner input = new Scanner(System.in);
        System.out.println("      Enter ten integers ");
        for (int i=0; i<numbers.length; i++){
            System.out.printf("Enter integer #%d: ", i+1);
            numbers[i] = input.nextInt();
    
        }
        
        System.out.println("\nIntegers in reverse order wihtout 5th value: ");
        for (int i=numbers.length-1; i>=0; i--){
            if (i==4){
                continue;
            }
            System.out.println(numbers[i]);
        }
    

    
}
    
    
    
}



