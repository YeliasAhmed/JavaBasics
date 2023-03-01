package Basics;

import java.util.Scanner;

public class PostIncrementValue {

//    In post increment, firstly input value is printed then increment by one(1).

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("This is printed first and printed value is "+num++); //print input number
        System.out.println("This is printed after increment and value is "+num++); //print after increment
    }
}
