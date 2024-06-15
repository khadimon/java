/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project10_coin_tossing;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaProject10_coin_tossing {

    private static SecureRandom randomNumbers = new SecureRandom();
    private static Scanner input = new Scanner(System.in);
    private static int heads = 0;
    private static int tails = 0;
    
    public static void main(String[] args) {
        int choice;
        System.out.println("\nGiven options:");
        System.out.println("1. Toss Coin");
        System.out.println("2. Exit");
        
        
        do {
            System.out.printf("\nChoose an option (1 or 2): ");
            choice = input.nextInt();
            
            switch (choice){
                case 1:
                    tossCoin();
                    break;
                case 2:
                    System.out.printf("Heads: %d%n", heads);
                    System.out.printf("Tails: %d%n", tails);
                    System.out.println("Program exits.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while (choice != 2);
        
    }
    
    private static int flip(){
        return randomNumbers.nextInt(2);
    }
    
    private static void tossCoin(){
        int result = flip();
        if (result==0){
            heads++;
            System.out.println("Heads!");
        }
        else {
            tails++;
            System.out.println("Tails!");
        }
    }
}
