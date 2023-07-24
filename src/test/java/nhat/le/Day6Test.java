package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day6Test {

    @Test
    void solve() {
        String s = "Hacker";
        String result = Day6.solve(s);
        Assertions.assertEquals("Hce akr", result);
    }

    @Test
    void solve2() {
        String s = "      Hac   ker    ";
        String result = Day6.solve(s);
        Assertions.assertEquals("Hce akr", result);
    }
}