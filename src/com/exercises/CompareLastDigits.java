package com.exercises;

import java.util.Scanner;

public class CompareLastDigits {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the second number: ");
        int y = input.nextInt();
        int lastDigitOfx = x%10;
        int lastDigitOfy = y%10;
        if (lastDigitOfx == lastDigitOfy){
            System.out.print(x + " " + y + " - " + "True");
        }else {
            System.out.print(x + " " + y + " - " + "False");
        }
    }
}