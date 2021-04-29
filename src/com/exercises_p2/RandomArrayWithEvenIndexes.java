package com.exercises_p2;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayWithEvenIndexes {
    public static void main(String[] args) {
        Random randomObj = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0) {
                array[i] = randomObj.nextInt(100) * 2;
            }else{
                array[i] = randomObj.nextInt(100) * 2 + 1;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
