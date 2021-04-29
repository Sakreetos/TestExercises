package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] firstArray = new int[arrLength];
        int[] secondArray = new int[arrLength];
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + " of the first array: ");
            firstArray[i] = input.nextInt();
        }
        System.out.println("First array: " + Arrays.toString(firstArray));
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + " of the first array: ");
            secondArray[i] = input.nextInt();
        }
        System.out.println("Second array: " + Arrays.toString(secondArray));
        int[] superArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++){
            superArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("Here is your super array(sum of 2 arrays): " + Arrays.toString(superArray));
    }
}
