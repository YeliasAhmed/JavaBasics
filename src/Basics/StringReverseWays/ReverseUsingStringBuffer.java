package Basics.StringReverseWays;

import java.util.Scanner;

public class ReverseUsingStringBuffer {

    public static String reverseStringBuffer(String str){
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();

    }

    public static void main(String[] args) {

        String st ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        st = scanner.nextLine();
        System.out.println(ReverseUsingStringBuffer.reverseStringBuffer(st));

    }
}
