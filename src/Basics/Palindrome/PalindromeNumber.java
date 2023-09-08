package Basics.Palindrome;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number, reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number whether palindrome or not: ");
        number = scanner.nextInt();
        int temp = number;
        while (number !=0){
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }

        if (temp==reverse){
            System.out.println(temp+" is a palindrome");
        } else{
            System.out.println(temp+" is not a palindrome");
        }
    }
}
