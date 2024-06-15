/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valieva.project6_celsius_to_fahrenheit_converter;

/**
 *
 * @author khadichabonuvalieva
 * Author: Khadichabonu Valieva
 * Program: Celsius to Fahrenheit Converter
 */
public class ValievaProject6_celsius_to_fahrenheit_converter {

    public static void main(String[] args) {
        System.out.printf("Celsius      Fahrenheit\n");
        int cel= 0;
     
        while (cel <= 50){
            double fah = (cel * 9.0/5) + 32;
            System.out.printf("  %-8d      %.1f%n", cel, fah);
            cel++;
        }
    }
}

