package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrayParts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Your Array: " + Arrays.toString(array));

        int[] fistHalfArray = Arrays.copyOfRange(array,0, array.length/2);
        int[] secondHalfArray = Arrays.copyOfRange(array, array.length/2, array.length);
        int fistHalfArraySum = 0;
        for (int j : fistHalfArray) {
            fistHalfArraySum += j;
        }
        int secondHalfArraySum = 0;
        for (int j : secondHalfArray) {
            secondHalfArraySum += j;
        }
        if (fistHalfArraySum/fistHalfArray.length > secondHalfArraySum/secondHalfArray.length){
            System.out.println("First half arithmetic mean is bigger: "+ Arrays.toString(fistHalfArray));
        }else if (fistHalfArraySum/fistHalfArray.length < secondHalfArraySum/secondHalfArray.length){
            System.out.println("Second half arithmetic mean is bigger: "+ Arrays.toString(secondHalfArray));
        }else {
            System.out.println("Two half's of array are equal");
        }
    }
}
