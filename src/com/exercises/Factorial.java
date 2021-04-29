package com.exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int f= 1;
        for (int i = 1; i <= number; i++ ){
            f = f*i;
        }
        System.out.print("Factorial of " + number + " = " + f );
    }
}
