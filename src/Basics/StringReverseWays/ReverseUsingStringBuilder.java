package Basics.StringReverseWays;

import java.util.Scanner;

public class ReverseUsingStringBuilder {

    public static String reverseStringBuilder(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String text = sc.nextLine();
        StringBuilder s = new StringBuilder(text);
        System.out.println("Simple reverse: "+s.reverse());

//        Using method
        System.out.println("Using method: "+ReverseUsingStringBuilder.reverseStringBuilder(text));
    }
}
