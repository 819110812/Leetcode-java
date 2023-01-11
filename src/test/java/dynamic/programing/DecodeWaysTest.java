package dynamic.programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

        @Test
        void test() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "12";
            int expected = 2;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test2() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "226";
            int expected = 3;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test3() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "0";
            int expected = 0;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test4() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "06";
            int expected = 0;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test5() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "1";
            int expected = 1;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test6() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "10";
            int expected = 1;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test7() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "27";
            int expected = 1;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test8() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "100";
            int expected = 0;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

        @Test
        void test9() {
            DecodeWays decodeWays = new DecodeWays();
            String s = "101";
            int expected = 1;
            int actual = decodeWays.numDecodings(s);
            assertEquals(expected, actual);
        }

}