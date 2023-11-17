package com.xworkz.programms;

public class LikesDisplayText {
    public static void main(String[] args) {
        // Test cases
        String[] arr1 = {};
        String[] arr2 = {"Peter"};
        String[] arr3 = {"Jacob", "Alex"};
        String[] arr4 = {"Max", "John", "Mark"};
        String[] arr5 = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(generateDisplayText(arr1));
        System.out.println(generateDisplayText(arr2));
        System.out.println(generateDisplayText(arr3));
        System.out.println(generateDisplayText(arr4));
        System.out.println(generateDisplayText(arr5));
    }
    public static String generateDisplayText(String[] names) {
        int length = names.length;
        if (length == 0) {
            return "no one likes this";
        } else if (length == 1) {
            return names[0] + " likes this";
        } else if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            int othersCount = length - 2;
            return names[0] + ", " + names[1] + " and " + othersCount + " others like this";
        }
    }
}
