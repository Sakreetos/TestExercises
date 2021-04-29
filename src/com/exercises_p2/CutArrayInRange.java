package com.exercises_p2;

import java.util.Arrays;
import java.util.Random;

public class CutArrayInRange {
    public static int[] splitArray(int[] arr, int start, int end) {
        int[] cutArray = new int[end - start];

        for (int i = 0; i < cutArray.length; i++) {
            cutArray[i] = arr[start + i];
        }
        return cutArray;
    }

    public static void main(String[] args) {
        Random randomObj = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomObj.nextInt(25) + 50;
        }
        System.out.println(Arrays.toString(arr));

        int start = 2, end = 4;
        int[] cutArray = splitArray(arr, start, end + 1);
        System.out.println(Arrays.toString(cutArray));
    }

}