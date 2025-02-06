package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void tupleSameProductTest() {

        int[] nums1 = new int[]{2,3,4,6};
        assertEquals(8, LeetCodeSolution.tupleSameProduct(nums1));

        int[] nums2 = new int[]{1,2,4,5,10};
        assertEquals(16, LeetCodeSolution.tupleSameProduct(nums2));

    }

}
