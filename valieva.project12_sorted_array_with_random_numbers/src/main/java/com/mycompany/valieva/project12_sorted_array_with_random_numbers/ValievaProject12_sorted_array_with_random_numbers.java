package com.mycompany.valieva.project12_sorted_array_with_random_numbers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *
 * @author khadichabonuvalieva
 */

import java.util.Random;

public class ValievaProject12_sorted_array_with_random_numbers {

    public static class SortArray {

        static void sort(int[] array) {
            int n = array.length;
            int temp = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arraySize = 20;
        int[] array = new int[arraySize];
        Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(1000) + 1;
        }

        System.out.println("Array before sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        SortArray.sort(array);

        System.out.println("\nArray after sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
