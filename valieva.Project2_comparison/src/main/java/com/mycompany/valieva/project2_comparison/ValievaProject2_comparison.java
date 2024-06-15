/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project2_comparison;

/**
 *
 * @author khadichabonuvalieva
 * Modulus is the remainder value of the devision of integer numbers.
 * For example: 5%3 = 2 (5/3 = 1 with remainder 2)
 */
public class ValievaProject2_comparison {

    public static void main(String[] args) {
        int a=4;
        int b=12;
        int c=37;
        int d=51;
       
        //part 1
        System.out.print("a<b"+'\n'+"a>b" + '\n' + "d<=c" + '\n'+ "c!=d" + '\n' + '\n');
        
        //part 2
        int result = d % a * c + a % b + a;
        System.out.print("The result of d % a * c + a % b + a = ");
        System.out.print(d + " % " + a + " * " + c + " + " + a + " % " + b + " + " + a + " = ");
        System.out.print(result);
        
        
      
        
        
        
    }
}
