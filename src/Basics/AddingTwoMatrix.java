package Basics;

import java.util.Scanner;

public class AddingTwoMatrix {
    public static void main(String[] args) {
        int rows, columns, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and column: ");
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];


        System.out.println("Enter the elements of first matrix: ");
        for (i = 0; i<rows;i++){
            for (j = 0; j<columns; j++){
                firstMatrix [i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element of second matrix: ");
        for (i=0; i<rows;i++){
            for (j=0; j<columns; j++){
                secondMatrix [i][j] = scanner.nextInt();
            }
        }

        int [][] result = new int[rows][columns];
        System.out.println("Add two matrix: ");
        for (i=0; i<rows; i++){
            for (j=0; j<columns; j++){
                result [i][j] = firstMatrix[i][j] + secondMatrix [i][j];
            }
        }

//        Result of two matrix

        for (i = 0; i<rows; i++){
            for (j=0; j<columns; j++){
                System.out.print(result [i][j]+"\t");
            }
            System.out.println();
        }

    }
}
