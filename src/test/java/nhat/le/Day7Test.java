package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day7Test {

    @Test
    void solve() {
        List<Integer> g = Arrays.asList(1,2,3,4);
        List<Integer> e = Arrays.asList(4,3,2,1);
        List<Integer> r = Day7.solve(g);
        Assertions.assertEquals(e, r);
    }
}