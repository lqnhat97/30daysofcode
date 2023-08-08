package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day19Test {

    @Test
    void solve() {
        int n = 6;
        int expected = 12;
        int result = Day19.solve(n);
        Assertions.assertEquals(expected, result);
    }
}