package com.xworkz.programms;
import java.util.*;
import java.io.*;

public class pgrm10 {
        public static int[] find(int[]arr,int target) {
            return null;
        }

        public static void main(String[]args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[]arr = new int[n];
            for(int i=0;i < n;i++) {
                arr[i] = scn.nextInt();
            }
            int target = scn.nextInt();
            int[]ans = find(arr,target);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

/*public class FindRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] range = searchRange(nums, target);

        if (range[0] == -1 && range[1] == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Starting Position: " + range[0]);
            System.out.println("Ending Position: " + range[1]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        // Find the starting position
        int start = findPosition(nums, target, true);
        if (start == nums.length || nums[start] != target) {
            return result; // If target not found, return {-1, -1}
        }

        // Find the ending position
        int end = findPosition(nums, target, false);

        result[0] = start;
        result[1] = end - 1; // Adjust end position

        return result;
    }

    // Helper method to find the position of the target value (start or end position)
    public static int findPosition(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target || (isFirst && nums[mid] == target)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}*/
