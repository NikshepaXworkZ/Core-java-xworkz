package com.xworkz.programms;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int rotateBy = 2;
        System.out.println("Original array:");
        System.out.println(Arrays.toString(originalArray));
        int[] rotatedArray = rotateRight(originalArray, rotateBy);
        System.out.println("\nArray after rotating to the right by " + rotateBy + " positions:");
        System.out.println(Arrays.toString(rotatedArray));
    }
    public static int[] rotateRight(int[] arr, int rotateBy) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        rotateBy %= n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, rotateBy - 1);
        reverseArray(arr, rotateBy, n - 1);
        return arr;
    }
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
