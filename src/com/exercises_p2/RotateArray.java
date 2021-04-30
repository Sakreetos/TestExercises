package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.print("How much time i need to rotate array to the right: ");
        int rotateValue = input.nextInt();

        int[] rotatedArray = rotateArrayToRight(array, array.length, rotateValue);

        System.out.println("Array after rotate " + Arrays.toString(rotatedArray));

    }
    private static int[] rotateArrayToRight(int[] array, int length, int rotateValue) {
        for (int i = 0; i < rotateValue; i++) {
            int temp = array[0];
            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = temp;
        }
        return array;

    }
}
