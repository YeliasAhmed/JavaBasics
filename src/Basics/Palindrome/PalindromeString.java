package Basics.Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public String palindromeString(String str){
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
            System.out.println("\nEnter String to reverse: ");
            st = scanner.nextLine();
            PalindromeString ps = new PalindromeString();
            if (st.equals(ps.palindromeString(st))){
                System.out.println(st+" is a Palindrome");
            }else {
                System.out.println(st+" is not a Palindrome");
            }
        }

    }
}
