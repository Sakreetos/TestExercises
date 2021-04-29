package com.exercises;

import java.util.Scanner;

public class IamBusy {
    public static void main(String[] args){

        System.out.print("enter hour number from 0 to 24: ");
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        if (9 >= time && time <= 18){
            System.out.println("I am working now!");
        }else if (time > 24 || time < 0){
            System.out.println("Error: Out of range");
        }else {
            System.out.println("I am free");
        }
    }
}
