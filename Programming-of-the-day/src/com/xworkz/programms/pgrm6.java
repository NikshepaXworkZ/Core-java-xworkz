package com.xworkz.programms;

public class pgrm6 {
    /*Write a program.

1) Get the number from user

2) Read the number from 1 to N, which is divisible by  3 or 5

3)  P={3^2+5^2+6^2+9^2}

4)  Q={3+5+6+9}^2

5) Get the Absolute value of the P and q.

Note: don’t use Built in functions*/

/*


//1.import java.io.IOException;
import java.io.InputStream;

    public class GetUserInputWithoutBuiltInFunctions {
        public static void main(String[] args) throws IOException {
            System.out.print("Enter a number: ");

            int number = readNumberFromConsole(System.in);

            System.out.println("You entered: " + number);
        }

        public static int readNumberFromConsole(InputStream inputStream) throws IOException {
            int number = 0;
            boolean isNegative = false;
            int digit;

            while ((digit = inputStream.read()) != '\n') {
                if (digit == '-') {
                    isNegative = true;
                } else {
                    number = number * 10 + (digit - '0');
                }
            }

            return isNegative ? -number : number;
        }
    }


2.import java.util.Scanner;

    public class DivisibleByThreeWithoutFunctions {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (N): ");
            int N = scanner.nextInt();

            System.out.println("Numbers from 1 to " + N + " divisible by 3:");

            // Iterate from 1 to N and print numbers divisible by 3
            for (int i = 1; i <= N; i++) {
                // Check if the number is divisible by 3 without using %
                if (((i / 3) * 3) == i) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }
3.public class CalculatePWithoutBuiltInFunctions {
        public static void main(String[] args) {
            int P = calculateP();
            System.out.println("P = " + P);
        }

        public static int calculateP() {
            int P;
            // Calculate squares manually
            int square3 = 3 * 3;
            int square5 = 5 * 5;
            int square6 = 6 * 6;
            int square9 = 9 * 9;

            // Calculate P by adding the squares
            P = square3 + square5 + square6 + square9;

            return P;
        }
    }

4.public class CalculateQWithoutBuiltInFunctions {
        public static void main(String[] args) {
            int Q = calculateQ();
            System.out.println("Q = " + Q);
        }

        public static int calculateQ() {
            int Q;
            // Calculate the sum manually
            int sum = 3 + 5 + 6 + 9;

            // Calculate Q by squaring the sum
            Q = sum * sum;

            return Q;
        }
    }

5.
    public class AbsoluteValueWithoutBuiltInFunctions {
        public static void main(String[] args) {
            // Values of P and Q obtained previously
            int P = calculateP();
            int Q = calculateQ();

            int absP = getAbsoluteValue(P);
            int absQ = getAbsoluteValue(Q);

            System.out.println("Absolute value of P: " + absP);
            System.out.println("Absolute value of Q: " + absQ);
        }

        // Assume these methods have been previously defined as mentioned in previous answers
        public static int calculateP() {
            // Code to calculate P
            return 3 * 3 + 5 * 5 + 6 * 6 + 9 * 9;
        }

        public static int calculateQ() {
            // Code to calculate Q
            return (3 + 5 + 6 + 9) * (3 + 5 + 6 + 9);
        }

        public static int getAbsoluteValue(int num) {
            if (num < 0) {
                return -num; // If num is negative, return its positive equivalent
            } else {
                return num; // If num is already positive, return itself
            }
        }
    }

}*/
