package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Day20Test {

    @Test
    void solve() {
        int n = 4;
        int[] arr = new int[]{4, 3, 1, 2};
        int[] expected = new int[]{1, 2, 3, 4};
        int[] data = Day20.solve(n, arr);
        boolean result = Arrays.equals(expected, data);
        Assertions.assertTrue(result);
    }
}