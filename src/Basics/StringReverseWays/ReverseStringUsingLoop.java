package Basics.StringReverseWays;

import java.util.Scanner;

public class ReverseStringUsingLoop {

    public String reverseString(String str){
        String reverseString = "";
        for (int i = str.length() - 1; i>=0;i--){
            reverseString += str.charAt(i);

        }
        return reverseString;

    }

    public static void main(String[] args) {
     while (true)
     {
         String st ;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter String to reverse: ");
         st = scanner.nextLine();
         ReverseStringUsingLoop rl = new ReverseStringUsingLoop();

         System.out.println( rl.reverseString(st));
     }

    }
}
