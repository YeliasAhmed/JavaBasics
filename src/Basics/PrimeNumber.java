package Basics;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i=2;i<number;i++){
           if (number%i==0){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();
        if (isPrime(num)){
            System.out.println(num+ " is a prime number");
        }
        else {
            System.out.println(num+" is not a prime number");
        }
    }
}
