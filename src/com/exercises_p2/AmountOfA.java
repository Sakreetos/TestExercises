package com.exercises_p2;

import java.util.Scanner;

public class AmountOfA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String newStr = input.nextLine();
        char[] charArray = new char[newStr.length()];
        System.out.print("Which char you want to count: ");
        char lookingForChar = input.next().charAt(0);

        for (int i = 0; i < newStr.length(); i++) {
            charArray[i] = newStr.charAt(i);
        }
        int counter = 0;
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] == lookingForChar){
                counter++;
            }
        }
        System.out.println("Amount of " + lookingForChar + " in array is " + counter);
    }
}
