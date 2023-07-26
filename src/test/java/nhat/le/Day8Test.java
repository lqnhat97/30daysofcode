package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Day8Test {

    @Test
    void solve() {
        int n = 3;
        List<String> data = Arrays.asList("sam 99912222", "tom 11122222", "harry 12299933", "sam", "edward", "harry");
        Map<String, Integer> expected = Stream.of(new Object[][]{
                {"sam", 99912222},
                {"edward", -1},
                {"harry", 12299933}
        }).collect(Collectors.toMap(k -> (String) k[0], v -> (Integer) v[1]));
        Map<String, Integer> result = Day8.solve(n, data);
        Assertions.assertEquals(expected, result);
    }
}