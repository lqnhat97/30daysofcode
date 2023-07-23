package nhat.le;

public class Day3 {
//    Objective
//    In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.
//
//    Task
//    Given an integer, n, perform the following conditional actions:
//
//    If n is odd, print Weird
//    If n is even and in the inclusive range of 2 to 5, print Not Weird
//    If n is even and in the inclusive range of 6 to 20, print Weird
//    If n is even and greater than 20, print Not Weird
//    Complete the stub code provided in your editor to print whether or not  is weird.
//
//    Input Format
//    A single line containing a positive integer, .
//    Constraints
//    1 <= n <= 100

    //    Output Format
//    Print Weird if the number is weird; otherwise, print Not Weird.
    public static String solve(int n) {
        int i = n % 2;
        if (i == 1) {
            return "Weird";
        }
        if (n >= 2 && n <= 5) {
            return "Not Weird";
        }
        if (n >= 6 && n <= 20) {
            return "Weird";
        }
        return "Not Weird";
    }
}
