package Basics;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
/*
*
* Syntax:  if(condition){
*             if(condition){
*                    //body
*                }
*             }else{//body}
* */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter weight:");
        int weight = scanner.nextInt();

        if(age>=18)
        {
            if(weight>=50)
            {
                System.out.println("Eligible to donate blood");
            }
        }
        else {
            System.out.println("Not eligible to donate blood");
        }
    }
}
