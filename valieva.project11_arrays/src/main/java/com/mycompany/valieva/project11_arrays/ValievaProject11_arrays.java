/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project11_arrays;

/**
 *
 * @author khadichabonuvalieva
 */
public class ValievaProject11_arrays {

    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i=0; i<counts.length; i++){
            counts[i] += 1;
            
        }
        System.out.println("'Counts' array elements: ");
        printArray(counts);
        
        //if you meant "counts" elements should be from 0 to 9, then adding 1 to each of them:
        int[] counts1 = new int[10];
        for (int i=0; i<10; i++){
            counts1[i] = i+1;
     
        }
        System.out.println("'Counts1' array of 10 elements from 0 to 9, then adding 1 to each: ");
        printArray(counts1);
        
        
        
        int[] values = {3, 7, 9, 12, 15};
        for (int i=0;i<values.length; i++){
            values[i] *= 3;
        }
        System.out.println("Values of the array after multiplying by 3: ");
        printArray(values);
    }
    
    private static void printArray(int[] arr){
        for (int value: arr){
            System.out.println(value+ " ");
        }
        System.out.println();
    }
}
