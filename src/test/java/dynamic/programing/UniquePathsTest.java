package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    @Test
    void test() {
        UniquePaths uniquePaths = new UniquePaths();
        int m = 3;
        int n = 2;
        int expected = 3;
        int actual = uniquePaths.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        UniquePaths uniquePaths = new UniquePaths();
        int m = 7;
        int n = 3;
        int expected = 28;
        int actual = uniquePaths.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        UniquePaths uniquePaths = new UniquePaths();
        int m = 3;
        int n = 7;
        int expected = 28;
        int actual = uniquePaths.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

}