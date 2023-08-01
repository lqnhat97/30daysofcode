package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day11Test {

    @Test
    void solve() {
        List<Integer> a1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> a2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> a3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> a4 = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> a5 = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> a6 = Arrays.asList(0, 0, 1, 2, 4, 0);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);
        arr.add(a6);
        int expected = 19;
        int result = Day11.solve(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve2() {
        List<Integer> a1 = Arrays.asList(0, -4, -6, 0, -7, -6);
        List<Integer> a2 = Arrays.asList(-1, -2, -6, -8, -3, -1);
        List<Integer> a3 = Arrays.asList(-8, -4, -2, -8, -8, -6);
        List<Integer> a4 = Arrays.asList(-3, -1, -2, -5, -7, -4);
        List<Integer> a5 = Arrays.asList(-3, -5, -3, -6, -6, -6);
        List<Integer> a6 = Arrays.asList(-3, -6, 0, -8, -6, -7);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);
        arr.add(a6);
        int expected = -19;
        int result = Day11.solve(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solve3() {
        List<Integer> a1 = Arrays.asList(-1, 1, -1, 0, 0, 0);
        List<Integer> a2 = Arrays.asList(0, -1, 0, 0, 0, 0);
        List<Integer> a3 = Arrays.asList(-1, -1, -1, 0, 0, 0);
        List<Integer> a4 = Arrays.asList(0, -9, 2, -4, -4, 0);
        List<Integer> a5 = Arrays.asList(-7, 0, 0, -2, 0, 0);
        List<Integer> a6 = Arrays.asList(0, 0, -1, -2, -4, 0);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);
        arr.add(a6);
        int expected = 0;
        int result = Day11.solve(arr);
        Assertions.assertEquals(expected, result);
    }
}