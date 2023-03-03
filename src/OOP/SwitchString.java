package OOP;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        switch (name){
            case "Saturday":
                System.out.println("Its Saturday");
                break;
            case "Sunday":
                System.out.println("Its Sunday");
                break;
            case "Monday":
                System.out.println("Its Monday");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday");
                break;
            case "Wednesday":
                System.out.println("Its Wednesday");
                break;
            case "Thursday":
                System.out.println("Its Thursday");
                break;
            case "Friday":
                System.out.println("Its Friday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
