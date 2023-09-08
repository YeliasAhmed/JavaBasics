package Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


        while (true){
            int n, reverse = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Input number: ");
            n = s.nextInt();
            while (n != 0){
                reverse = reverse * 10;
                reverse = reverse + n%10;
                n = n/10;
            }
            System.out.println("Reverse Number: "+reverse);
        }
    }
}
