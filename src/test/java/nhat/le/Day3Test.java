package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day3Test {
    @Test
    void solve_thenWeird() {
        int n = 5;
        String result = Day3.solve(n);
        Assertions.assertEquals("Weird", result);
    }

    @Test
    void solve_thenNotWeird() {
        int n = 22;
        String result = Day3.solve(n);
        Assertions.assertEquals("Not Weird", result);
    }
}