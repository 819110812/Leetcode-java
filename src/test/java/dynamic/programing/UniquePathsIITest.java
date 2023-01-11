package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsIITest {

    @Test
    void test() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int expected = 2;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,1},{0,0}};
        int expected = 1;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,0},{1,1},{0,0}};
        int expected = 0;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,0},{0,1}};
        int expected = 0;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,0},{1,1},{0,0}};
        int expected = 0;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int expected = 2;
        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

}