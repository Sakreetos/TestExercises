package com.exercises;

import java.util.Scanner;

public class DecimalToBinary {
    public void DecimalToBinary() {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimalN = input.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while(decimalN > 0){
            binary[index++] = decimalN%2;
            decimalN = decimalN/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }

        System.out.print("\n" + "Enter binary number: ");
        int binaryN = input.nextInt();
        int p = 0;
        int decimal = 0;
        while(true){
            if(binaryN == 0){
                break;
            } else {
                int temp = binaryN%10;
                decimal += temp*Math.pow(2, p);
                binaryN = binaryN/10;
                p++;
            }
        }
        System.out.println(decimal);
    }



    public static void main(String a[]){
        DecimalToBinary obj = new DecimalToBinary();
        obj.DecimalToBinary();
    }
}
