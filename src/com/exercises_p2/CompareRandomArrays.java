package com.exercises_p2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class CompareRandomArrays {
    public static void main(String[] args) {
        Random randomObj = new Random();
        int[] firstArray = new int[5];
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = randomObj.nextInt(25) + 50;
        }
        System.out.println("Your first array: " + Arrays.toString(firstArray));

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = randomObj.nextInt(25) + 50;
        }
        System.out.println("Your second array: " + Arrays.toString(secondArray));

        int firstArrayCounter = 0;
        for (int k : firstArray) {
            if (k % 2 == 0) {
                firstArrayCounter++;
            }
        }
        int secondArrayCounter = 0;
        for (int j : secondArray) {
            if (j % 2 == 0) {
                secondArrayCounter++;
            }
        }
        if (firstArrayCounter > secondArrayCounter){
            System.out.println("First array has more even elements: " + firstArrayCounter);
        }else if (firstArrayCounter < secondArrayCounter) {
            System.out.println("Second array has more even elements: " + secondArrayCounter);
        }
    }
}
