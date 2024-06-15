/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva_csc346_project9;

/**
 *
 * @author khadichabonuvalieva
 * 
 * 
 Program 1: Sum the odd integers between 1 and 99, using a for statement. 
 * Assume that the integer variables sum and count have been declared. 
 * Print out the product before the program terminates.

Program 2: Print the integers from 5 to 100 incrementing by 5 each iteration. 
* Use a for loop and the counter variable i to iterate through the loop.  
* Print only five integers per line. 
* [Hint: Use a new line counter and an if statement (i.e. if (l > 5) to print out a line 
* return else print out a tab. Assume that this code is an application. 
* Use the System.out.println() method to output the newline character, 
* and use the System.out.print(‘\t’) method to output the tab character.] 
 * 
 */
public class Valieva_csc346_project9 {

    public static void main(String[] args) {
        int sum = 0;
        
        for (int count=1; count<100; count++){
            sum += count;
                    }
        System.out.print("Program 1.\n");
        System.out.printf("Sum of numbers between 1 and 99 is %d%n", sum);
        System.out.print("\n");
        
        
        System.out.print("Program 2.\n");
        int I=0;
        for (int i=5; i<101; i+=5){
            System.out.print(i+"\t");
            I+=1;
          
            if (I>=5){
                System.out.println();
                I=0;
            }      
        }
        
        if (I>0){
            System.out.println();
        }
       
    }
    
    
}
