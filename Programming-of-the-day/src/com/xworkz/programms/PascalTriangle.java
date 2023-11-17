package com.xworkz.programms;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int rows = scanner.nextInt();
        printPascalTriangle(rows);
        scanner.close();
    }
    public static void printPascalTriangle(int n) {
        int[][] pascalTriangle = new int[n][n];
        for (int line = 0; line < n; line++) {
            for (int spaces = 0; spaces < n - line - 1; spaces++) {
                System.out.print(" "); // Print spaces for formatting
            }
            for (int i = 0; i <= line; i++) {
                if (i == 0 || i == line) {
                    pascalTriangle[line][i] = 1;
                    System.out.print(" " + pascalTriangle[line][i] + " ");
                } else {
                    pascalTriangle[line][i] = pascalTriangle[line - 1][i - 1] + pascalTriangle[line - 1][i];
                    System.out.print(pascalTriangle[line][i] + " ");
                }
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
