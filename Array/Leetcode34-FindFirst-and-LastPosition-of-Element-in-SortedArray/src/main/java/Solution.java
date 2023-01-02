import java.util.*;


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false) - 1;
        if (left > right) {
            return new int[]{-1, -1};
        }
        return new int[]{left, right};
    }

    public int binarySearch(int[] nums, int target, boolean isLeft) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((nums[mid] > target) || (isLeft && nums[mid] == target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}