package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day9Test {

    @Test
    void factorial() {
        int n = 3;
        int expected = 6;
        int result = Day9.factorial(n);
        Assertions.assertEquals(expected, result);
    }
}