package com.exercises;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args){
        int[] array = new int[3];
        int i = 0;
        int largest, j;
        int counter = 1;
        while (i != 3){
            System.out.print("Enter "+ counter +" number: ");
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
            i++;
            counter++;
        }

        largest = array[0];

        for(j=0; j<3; j++){
            if(largest < array[j]){
                largest = array[j];
            }
        }
        System.out.println("Largest number is: "+largest);
    }
}
