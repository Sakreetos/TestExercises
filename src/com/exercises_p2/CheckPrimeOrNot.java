package com.exercises_p2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter array value #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime){
                System.out.println(array[i] + " is prime ");
            }else{
                System.out.println(array[i] + " is not prime ");
            }
        }
    }
}