package OOP;

import java.util.Scanner;

public class InputDataType {

    public static void main(String[] args) {
        int x = 1;
        while (x != -1) {
            System.out.println("Enter any data you preferred: ");
            Scanner scanner = new Scanner(System.in);

            String s = scanner.next();
            int i = scanner.nextInt();
            double d = scanner.nextDouble();
            float f = scanner.nextFloat();
            short ss = scanner.nextShort();
            long l = scanner.nextLong();
            byte b = scanner.nextByte();
            boolean bb = scanner.nextBoolean();

            System.out.println("String Output is " + s);


            System.out.println("Integer Output is " + i);


            System.out.println("Double Output is " + d);


            System.out.println("Float Output is " + f);


            System.out.println("Short Output is " + ss);


            System.out.println("Long Output is " + l);


            System.out.println("Byte Output is " + b);
            System.out.println("Boolean Output is " + bb);


        }
    }
}
