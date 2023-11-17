package com.xworkz.programms;
import java.util.Scanner;
public class ElementFrequency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
