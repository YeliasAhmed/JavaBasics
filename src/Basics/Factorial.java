package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, number, fact=1;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your number: ");
        number = s.nextInt();

        if (number<0){
            System.out.println("Please, enter non-negative number");
        }
        else {
            for (i=1; i<=number; i++){
                fact = fact * i;
            }
            System.out.println("Factorial number of "+number+ "= "+fact);

        }
    }
}
