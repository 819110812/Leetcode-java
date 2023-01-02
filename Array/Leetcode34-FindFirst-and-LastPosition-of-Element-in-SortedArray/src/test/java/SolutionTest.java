import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void Should_Return_Correct_Answers(){
        Solution sol = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] expected = {3,4};
        int[] actual = sol.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

}
