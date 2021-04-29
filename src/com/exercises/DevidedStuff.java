package com.exercises;

import java.util.Scanner;

public class DevidedStuff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the second number: ");
        int y = input.nextInt();
        if (x % y == 0){
            System.out.println("True"+ "\n" + "Whole: " + x / y + "\n" + "Reminder: " + x % y);
        }else if (y % x == 0){
            System.out.println("True"+ "\n" + "Whole: " + y / x + "\n" + "Reminder: " + y % x);
        }else if (x % y != 0 ){
            System.out.println("False"+ "\n" + "Whole: " + x / y + "\n" + "Reminder: " + x % y);
        }else if (y % x != 0 ) {
            System.out.println("False"+ "\n" + "Whole: " + y / x + "\n" + "Reminder: " + y % x);
        }
    }
}
