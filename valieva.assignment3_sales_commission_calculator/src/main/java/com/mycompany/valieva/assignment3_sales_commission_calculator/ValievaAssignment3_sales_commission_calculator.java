/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.assignment3_sales_commission_calculator;
import java.util.Scanner;
/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaAssignment3_sales_commission_calculator {

    public static void main(String[] args) {
        double[] itemPrices = {239.99, 129.75, 99.95, 350.89};
        double totalEarnings = 200.0; //initial value is the base earning
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<itemPrices.length; i++){
            System.out.print("Enter number sold of product #" + (i+1) + ": ");
            int numSold = input.nextInt();
            
            double itemEarnings = itemPrices[i] * numSold;
            totalEarnings += 0.09 * itemEarnings;
        }
       
        System.out.printf("\nEarnings this week: $%.2f%n", totalEarnings);
                
    }
}


