package nhat.le;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day10 {
//    Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!
//
//    Task
//    Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.
//
//    Example
//    n = 125
//    The binary representation of 125(10) is 1111101(2). In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.
//    Input Format
//
//    A single integer, n.
//
//    Constraints
//    1 <= n <= 10^6
//
//    Output Format
//
//    Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.
//
//    Sample Input 1
//
//            5
//    Sample Output 1
//
//            1
//    Sample Input 2
//
//            13
//    Sample Output 2
//
//            2

    public static int solve(int n) {
        List<Integer> bytes = new ArrayList<>();
        while (n > 0) {
            bytes.add(n % 2);
            n /= 2;
        }
        Map<Integer, Integer> map = Stream.of(new Object[][]{
                {1, 0},
                {0, 0}
        }).collect(Collectors.toMap(k -> (Integer) k[0], v -> (Integer) v[1]));
        int max = 0;
        for (int b : bytes) {
            map.put(b, map.get(b) + 1);
            if (map.get(b) > max) {
                max = map.get(b);
            }
            if (b == 0) {
                map.put(1, 0);
            } else {
                map.put(0, 0);
            }
        }
        return max;
    }
}
