package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day15Test {

    @Test
    void solve() {
        int[] arr = new int[] {2,3,4,1};
        Assertions.assertDoesNotThrow(()->Day15.solve(arr));
    }
}