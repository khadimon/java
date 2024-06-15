/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project3_creating_classes;

/**
 *
 * @author khadichabonuvalieva
 */
public class Project3_creating_classes {

    public static void main(String[] args) {
        BlueBird_Java myBird = new BlueBird_Java("Blue Jay", 1, "BeBe");
        BlueBird_Java yourBird = new BlueBird_Java("Indigo Bunting", 2, "BuBu");
        
        //myBlueBird
        System.out.printf("My blue bird's age is %d%n", myBird.getAge());
        System.out.printf("My blue bird's breed is %s%n", myBird.getBreed());
        
        myBird.setName("BoBo");
        System.out.printf("My blue bird's name is %s%n%n", myBird.getName());
        
        //yourBlueird
        System.out.printf("Your blue bird's age is %d%n", yourBird.getAge());
        System.out.printf("Your blue bird's breed is %s%n", yourBird.getBreed());
        System.out.printf("Your blue bird's name is %s%n%n", yourBird.getName());
    }
}
