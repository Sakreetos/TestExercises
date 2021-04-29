package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        int largestN = array[0];
        for (int i = 0; i < arrLength; i++){
            if (largestN < array[i] ){
                largestN = array[i];
            }
        }
        int smallestN = array[0];
        for (int i = 0; i < arrLength; i++){
            if (smallestN > array[i] ){
                smallestN = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Largest number in array " + Arrays.toString(array) + " is " + largestN + " and the smallest is " + smallestN );
    }
}
