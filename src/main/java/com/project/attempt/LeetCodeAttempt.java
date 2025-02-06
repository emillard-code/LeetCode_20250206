package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,3,4,6};
        System.out.println(tupleWithSameProduct(nums1));

        int[] nums2 = new int[]{1,2,4,5,10};
        System.out.println(tupleWithSameProduct(nums2));

    }

    // This method returns the number of tuples that fulfill the challenge specifications.
    public static int tupleWithSameProduct(int[] nums) {

        int tuples = 0;

        // We will loop through the array through four different layers,
        // to test all possible 4-number tuple combinations.
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                // We skip the current loop when any of the indexes are the same.
                if (j == i) { continue; }

                for (int k = 0; k < nums.length; k++) {

                    // We skip the current loop when any of the indexes are the same.
                    if (k == i || k == j) { continue; }

                    for (int l = 0; l < nums.length; l++) {

                        // We skip the current loop when any of the indexes are the same.
                        if (l == i || l == j || l == k) { continue; }

                        // We test a * b = c * d as per challenge specifications with all
                        // possible index combinations, and increment int tuples each time
                        // that the combination of numbers leads to the statement being true.
                        if (nums[i] * nums[j] == nums[k] * nums[l]) { tuples++; }

                    }

                }

            }

        }

        // At the end, we return the final value of int tuples.
        return tuples;

    }

}
