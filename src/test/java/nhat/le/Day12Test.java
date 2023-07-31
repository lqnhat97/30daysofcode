package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day12Test {
    @Test
    void solve() {
        String studentInfo = "Heraldo Memelli 8135627";
        String scores = "100 80";
        String expected = "O";
        String result = Day12.solve(studentInfo, scores);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve2() {
        String studentInfo = "Ritika Trikha 3648762";
        String scores = "100 50 70 60 80 60";
        String expected = "A";
        String result = Day12.solve(studentInfo, scores);
        Assertions.assertEquals(expected, result);
    }
}