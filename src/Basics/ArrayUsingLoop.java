package Basics;

import java.util.Scanner;

public class ArrayUsingLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] name = new String[5];
        int[] number = new int[5];
        int output;

        System.out.println("Input = ");
        for (int i=0; i< 5; i++){
            number[i] = s.nextInt();
        }
        System.out.println("Output = ");
        for(int i =0;i<5;i++){
           output= number[i];
            System.out.println(output);
        }

    }
}
