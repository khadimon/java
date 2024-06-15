/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva_csc346_assignment4;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class Valieva_csc346_assignment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productNumber;
        int quantitySold;
        double total = 0.0;
      
        System.out.println("Product Prices:");
        System.out.println("1. Product 1 - $2.98");
        System.out.println("2. Product 2 - $4.50");
        System.out.println("3. Product 3 - $9.98");
        System.out.println("4. Product 4 - $4.49");
        System.out.println("5. Product 5 - $6.87");
        
        
        while (true) {
            System.out.print("\nEnter product number (0 to exit): ");
            productNumber = input.nextInt();
            
            if (productNumber == 0){
                break;
            }
            
            if (productNumber < 1 || productNumber > 5){
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }
            
            System.out.print("Enter quantity sold: ");
            quantitySold = input.nextInt();
            
            double price;
            
            
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;   
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    price = 0.0;
                    break;
            }
            double productTotal = price * quantitySold;
            total += productTotal;
            
            System.out.printf("Total for product %d: $%.2f%n", productNumber, productTotal);
        }
        System.out.printf("Total value of all products sold: $%.2f%n", total);
        
        
    }
}
