package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day17Test {

    @Test
    void solve() {
        int n = 3;
        int p = 5;
        int expected = 243;
        int result = Day17.solve(n, p);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve2() {
        int n = -3;
        int p = 5;
        Assertions.assertThrows(RuntimeException.class, () -> Day17.solve(n, p));
    }
}