package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    @Test
    void test() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        boolean actual = jumpGame.canJump(nums);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        boolean actual = jumpGame.canJump(nums);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 0};
        boolean expected = true;
        boolean actual = jumpGame.canJump(nums);
        assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {1, 0};
        boolean expected = true;
        boolean actual = jumpGame.canJump(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {0, 1};
        boolean expected = false;
        boolean actual = jumpGame.canJump(nums);
        assertEquals(expected, actual);
    }


}