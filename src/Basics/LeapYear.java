package class2;

import java.util.Scanner;


public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Enter any year:");
        Scanner s = new Scanner(System.in);
        int year =s.nextInt();

        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

    }
}


// Check whether a number is even or odd using if...else statement (Practice)
// check whether a number is positive or negative or zero()

