package com.xworkz.programms;

public class StringRotation {
    public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "lohel";

    boolean isRotation = isRotation(str1, str2);

    if (isRotation) {
        System.out.println("\"" + str2 + "\" is a rotation of \"" + str1 + "\"");
    } else {
        System.out.println("\"" + str2 + "\" is not a rotation of \"" + str1 + "\"");
    }
}

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenatedStr = str1 + str1;

        return concatenatedStr.contains(str2);
    }
}

