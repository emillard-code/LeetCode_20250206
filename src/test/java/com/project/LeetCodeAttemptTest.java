package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void tupleWithSameProductTest() {

        int[] nums1 = new int[]{2,3,4,6};
        assertEquals(8, LeetCodeAttempt.tupleWithSameProduct(nums1));

        int[] nums2 = new int[]{1,2,4,5,10};
        assertEquals(16, LeetCodeAttempt.tupleWithSameProduct(nums2));

    }

}
