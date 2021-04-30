package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class InvertArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i<arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int i, j = 0;
        for (i = 0; i < array.length / 2; i++ ){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length- i - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
