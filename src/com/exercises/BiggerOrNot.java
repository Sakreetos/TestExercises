package com.exercises;

import java.util.Scanner;

public class BiggerOrNot {
    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the second number: ");
        int y = input.nextInt();
        if (x > y){
            result = x-y;
            System.out.println("The first number was bigger, here is the difference of the entered numbers: " + result);
        }else if(y > x){
            result = x+y;
            System.out.println("The second number was bigger, here is the sum of the entered numbers: " + result);
        }else {
            System.out.println("Entered numbers are equal");
        }
    }
}
