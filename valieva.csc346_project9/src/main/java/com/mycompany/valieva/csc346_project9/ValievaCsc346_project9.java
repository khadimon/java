/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.csc346_project9;
import java.util.Scanner;

/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaCsc346_project9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;
        int count=1;
        System.out.println ("\nMileage Calculator");
        System.out.print("----------------------------------------\n");
        
        while (true){
            System.out.print("Enter miles driven for the trip (-1 to quit): ");
            miles = scanner.nextInt();
            
            if (miles == -1)
                    break;
            
            System.out.print("Enter gallons used for the trip: ");
            gallons = scanner.nextInt();
            
            
            double mpg = (double) miles/gallons;
            System.out.printf("Miles per gallon for trip " + count+ ": %.2f%n", mpg);
            count +=1;
            
            totalMiles += miles;
            totalGallons += gallons;
            System.out.print("\n");
        }
        double totalMpg = (double) totalMiles/totalGallons;
            System.out.printf("Total miles per gallon for all trips: %.2f%n", totalMpg);
        
        System.out.println("\nProgram ended.");
    }
}


 