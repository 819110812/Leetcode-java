package dynamic.programing;

public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return true;
        }

        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max > i) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
