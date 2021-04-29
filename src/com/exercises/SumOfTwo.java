package com.exercises;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the second number: ");
        int y = input.nextInt();
        if(11 <= x+y && x+y<=19 ){
            int sum = x + y;
            System.out.println("Here is the sum of "+ x + " and " + y + ": " + sum);
        }else {
            System.out.println("Sum of " + x + " and "+ y + " is not in 11-19 range" );
        }
    }
}