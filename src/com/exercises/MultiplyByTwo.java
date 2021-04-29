package com.exercises;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scan.nextInt();
        if (x % 7 == 0){
            System.out.println("Here`s your multiplied "+ x+": " + x*2 );
        }else {
            System.out.println(x+" Can't be devided by 7 without reminder");
        }
    }
}
