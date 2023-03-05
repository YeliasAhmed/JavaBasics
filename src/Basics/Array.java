package Basics;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] name = new String[5];
        int[] number= new int[3];
        int sum;

        System.out.println("Enter numbers: ");
        number[0]=input.nextInt();
        number[1]=input.nextInt();
        number[2]= input.nextInt();
        sum = number[0]+number[1]+number[2];
        System.out.println("Sum = "+sum);
        System.out.println("\n");

        System.out.println("Enter String input: ");
        name[0] = input.next();
        name[1] = input.next();
        name[2]= input.next();
        System.out.println("String Output: ["+name[0] + ", "+ name[1] +", "+ name[2] +"]");

    }
}
