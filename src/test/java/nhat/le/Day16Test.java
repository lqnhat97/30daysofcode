package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day16Test {

    @Test
    void solve() {
        String s = "He11o";
        int expected = -999;
        int result = Day16.solve(s);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve2() {
        String s = "123";
        int expected = 123;
        int result = Day16.solve(s);
        Assertions.assertEquals(expected, result);
    }
}