package Day1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //    for(initialize;condition;inc/dec)

        int number, i;
        int j = 0;
        int k = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = s.nextInt();

        System.out.println("for loop starts");
        for (i = 0; i < number; i++) {
            System.out.println(i);
        }
        System.out.println("End for loop");

        // while(condition){
        // inc/dec}


        System.out.println("While loop starts");
        while (j < number) {
            System.out.println(j);
            j++;
        }
        //    for each loop
//    for(dtype variable : variables)
        System.out.println("for each loop starts");
        try {
            int arr[] = {1,2,4,5,6,8};
            System.out.println(arr[6]);
        }catch (Exception e){
            System.out.println(e);
        }

//        do{
//        body
//        inc/dec
//        }while(cond)


        System.out.println("Do while loop");
        do {
            System.out.println(k);
            k++; // i=i+1
        } while (k < number);


        //    try{}catch(Exception e)
        try {
            int result = number/0;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
