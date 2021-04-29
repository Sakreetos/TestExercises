package com.exercises;

import java.util.Scanner;

public class HowMuchDigits {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 0;
        while (number > 0){
            if (number % 10 == 8)
                counter++;
                number /= 10;
        }
        System.out.println(counter);
    }


    }