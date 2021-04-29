package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class SwapLargestSmaller {
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
        int largestIndex = 0;
        for (int i = 0; i < arrLength; i++){
            if (largestN < array[i] ){
                largestN = array[i];
                largestIndex = i;
            }
        }
        int smallestN = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < arrLength; i++){
            if (smallestN > array[i] ){
                smallestN = array[i];
                smallestIndex = i;
            }
        }
        System.out.println("Largest number in array " + Arrays.toString(array) + " is " + largestN + " and the smallest is " + smallestN );
        array[smallestIndex] = largestN;
        array[largestIndex] = smallestN;
        System.out.println("Array after swap of the largest and smaller elements: " + Arrays.toString(array));
    }
}

