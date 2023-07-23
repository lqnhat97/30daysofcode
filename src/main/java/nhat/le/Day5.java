package nhat.le;

public class Day5 {
//    Objective
//    In this challenge, we will use loops to do some math. Check out the Tutorial tab to learn more.
//
//    Task
//    Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.

    public static void solve(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
