/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva_csc346_assignment5;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author khadichabonuvalieva
 */
public class Valieva_csc346_assignment5 
{
    private static SecureRandom randomNumbers = new SecureRandom();
    private static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        while (true){
            System.out.print("\n");
            askNewQuestion();
        }
    }
        
    public static void askNewQuestion()
    {
        int number1 = randomNumbers.nextInt(10);
        int number2 = randomNumbers.nextInt(10);
        
        
            System.out.printf("How much is %d time %d? ", number1, number2);
            int guess = input.nextInt();
            
            while (guess != (number1*number2)){
                System.out.printf("No. Please try again: ");
                guess = input.nextInt();
            }
            System.out.println("Very good!");
        
    }
}