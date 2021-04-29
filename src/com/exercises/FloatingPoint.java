package com.exercises;

import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        System.out.print("Enter number with floating dot: ");
        Scanner input = new Scanner(System.in);
        float x= input.nextFloat();
        if (x > 0 && x< 1){
            System.out.println("Entered number is in 0-1 range");
        }else{
            System.out.println("Entered number is not in 0-1 range");
        }
    }
}
