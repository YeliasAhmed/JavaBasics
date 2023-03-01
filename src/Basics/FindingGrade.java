package class2;

import java.util.Scanner;

public class FindingGrade {
    public static void main(String[] args) {
//        write a program to evaluate grade using java conditional statement(if-else)


        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 40 && num <= 49) {
            System.out.println("D grade");
        } else if (num >= 50 && num <= 59) {
            System.out.println("C grade");
        } else if (num >= 60 && num <= 69) {
            System.out.println("B grade");
        } else if (num >= 70 && num <= 79) {
            System.out.println("A grade");
        } else if (num >= 80 && num <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Failed");
        }
    }

}
