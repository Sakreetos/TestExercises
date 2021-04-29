package com.exercises_p2;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySwapLargestSmaller {
    public static void main(String[] args) {
        Random randomObj = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++){
            array[i] = randomObj.nextInt();
        }
        System.out.println("Array with random values: " + Arrays.toString(array));

        int largestN = array[0];
        int largestIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (largestN < array[i] ){
                largestN = array[i];
                largestIndex = i;
            }
        }
        int smallestN = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++){
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
