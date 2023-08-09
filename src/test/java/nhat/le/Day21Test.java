package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Day21Test {

    @Test
    void solve() {
        List<Integer> n = Arrays.asList(1, 2, 3);
        List<String> arr = Arrays.asList("a", "b", "c");
        Assertions.assertDoesNotThrow(() -> Day21.solve(n, arr));
    }
}