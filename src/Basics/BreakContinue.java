package Basics;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i;
        for(i=0; i<num;i++){
//            System.out.println(i);

            if(i==3){
               continue;
            }

            System.out.println(i);

//            if(i==7){
//                break;
//            }
//            System.out.println(i);
        }
    }
}
