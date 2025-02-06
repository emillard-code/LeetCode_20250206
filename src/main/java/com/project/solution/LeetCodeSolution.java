package com.project.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,3,4,6};
        System.out.println(tupleSameProduct(nums1));

        int[] nums2 = new int[]{1,2,4,5,10};
        System.out.println(tupleSameProduct(nums2));

    }

    public static int tupleSameProduct(int[] nums) {

        int numsLength = nums.length;
        Arrays.sort(nums);

        int totalNumberOfTuples = 0;

        // Iterate over all possible values for 'a'
        for (int aIndex = 0; aIndex < numsLength; aIndex++) {

            // Iterate over all possible values for 'b', starting from the end of the array
            for (int bIndex = numsLength - 1; bIndex >= aIndex + 1; bIndex--) {

                int product = nums[aIndex] * nums[bIndex];

                // Use a hash set to store possible values of 'd'
                Set<Integer> possibleDValues = new HashSet<>();

                // Iterate over all possible values for 'c' between 'a' and 'b'
                for (int cIndex = aIndex + 1; cIndex < bIndex; cIndex++) {

                    // Check if the product is divisible by nums[cIndex]
                    if (product % nums[cIndex] == 0) {

                        int dValue = product / nums[cIndex];

                        // If 'dValue' is in the set, increment the tuple count by 8
                        if (possibleDValues.contains(dValue)) {
                            totalNumberOfTuples += 8;
                        }

                        // Add nums[cIndex] to the set for future checks
                        possibleDValues.add(nums[cIndex]);
                    }

                }

            }

        }

        return totalNumberOfTuples;

    }

}
