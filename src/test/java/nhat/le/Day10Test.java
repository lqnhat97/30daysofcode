package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day10Test {

    @Test
    void solve() {
        int n = 5;
        int expected = 1;
        int result = Day10.solve(n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve2() {
        int n = 13;
        int expected = 2;
        int result = Day10.solve(n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve3() {
        int n = 1000000;
        int expected = 6;
        int result = Day10.solve(n);
        Assertions.assertEquals(expected, result);
    }
}