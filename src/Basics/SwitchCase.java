package Basics;

import java.util.Scanner;

public class SwitchCase {
    /*
    Syntax: expression;
            switch(){
            case value1: //body

            case value2: //body
            .
            .

          default: //body
            }
   */
//    write a program whether it is monday.

    public static void main(String[] args) {
        System.out.println("Enter a day:");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {

            case 1:
                System.out.println("It is Saturday");
                break;
            case 2:
                System.out.println("It is Sunday");
                break;
            case 3:
                System.out.println("It is Monday");
                break;
            case 4:
                System.out.println("It is Tuesday");
                break;
            case 5:
                System.out.println("It is Wednesday");
                break;
            case 6:
                System.out.println("It is Thursday");
                break;
            case 7:
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("Invalid day you entered");
        }

    }
}
