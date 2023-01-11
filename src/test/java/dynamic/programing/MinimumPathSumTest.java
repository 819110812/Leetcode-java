package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

        @Test
        void test() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
            int expected = 7;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test2() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,2,3},{4,5,6}};
            int expected = 12;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test3() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,2,3}};
            int expected = 6;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test4() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1},{2},{3}};
            int expected = 6;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test5() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,2},{5,6},{1,1}};
            int expected = 8;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test6() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,2,5},{3,2,1}};
            int expected = 6;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }

        @Test
        void test7() {
            MinimumPathSum minimumPathSum = new MinimumPathSum();
            int[][] grid = {{1,2,5},{3,2,1}};
            int expected = 6;
            int actual = minimumPathSum.minPathSum(grid);
            assertEquals(expected, actual);
        }


}