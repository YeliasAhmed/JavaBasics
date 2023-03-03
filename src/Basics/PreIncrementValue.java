package Basics;

import java.util.Scanner;

public class PreIncrementValue {

//    In pre increment, firstly value is incremented by 1 then print it


    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Value is "+ ++num); //taken input =10 printed=11
        System.out.println("Value is "+ ++num); // now input=11 printed=12
    }
}
