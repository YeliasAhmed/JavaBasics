package Basics;

import java.util.Scanner;

public class TernaryOperator {
//    Syntax: Variable = (Condition)? exp1:exp2; // int number = (a<b)? exp1:exp2;

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int number = (a<b)? a:b;
        System.out.println("Expected Number is = "+number);
    }
}
