package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticMeanOfArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array));
        int arraysum = 0;
        for (int i = 0; i < arrLength; i++){
            arraysum += array[i];
        }
        System.out.println("Arithmetic mean of "+ Arrays.toString(array) + " is: " + arraysum / arrLength);
    }
}
