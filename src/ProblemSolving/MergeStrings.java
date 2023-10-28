package ProblemSolving;

/*

Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end
of the merged string.
Return the merged string.

Input: word1="abc", word2="pqr"
Output: "apbqcr"
*/

import java.util.Scanner;

public class MergeStrings {

    public static String mergeAlternatively(String word1, String word2){
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i<word1.length() || j<word2.length()){

            if(i<word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
    public static void main(String[] args) {

        System.out.println("Enter two string:");
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        String merged = mergeAlternatively(word1,word2);
        System.out.println(merged);

    }
}
