package com.xworkz.programms;
import  java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int mergedLength = arr1.length + arr2.length;
        int[] mergedArray = new int[mergedLength];

        int index = 0;

        for (int element : arr1) {
            mergedArray[index] = element;
            index++;
        }

        for (int element : arr2) {
            mergedArray[index] = element;
            index++;
        }

        return mergedArray;
    }
}
