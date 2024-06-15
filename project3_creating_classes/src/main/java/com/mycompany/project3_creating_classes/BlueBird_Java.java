/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3_creating_classes;

/**
 *
 * @author khadichabonuvalieva
 */
public class BlueBird_Java {
    private String breed;
    private int age;
    private String name;
    
    public BlueBird_Java(String breed, int age, String name){
        this.breed = breed;
        this.age = age;
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
