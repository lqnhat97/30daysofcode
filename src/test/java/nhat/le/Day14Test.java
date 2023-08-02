package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day14Test {

    @Test
    void solve() {
        int[] arr = new int[]{1, 2, 5};
        int expected = 4;
        int result = Day14.solve(arr);
        Assertions.assertEquals(expected, result);
    }
}