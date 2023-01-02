package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    void test() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int actual = maximumSubarray.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {1};
        int expected = 1;
        int actual = maximumSubarray.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {5,4,-1,7,8};
        int expected = 23;
        int actual = maximumSubarray.maxSubArray(nums);
        assertEquals(expected, actual);
    }


}