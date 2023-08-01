package nhat.le;

import java.util.List;

public class Day11 {
    //    Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.
//
//    Context
//    Given a 6x6 2D Array, A:
//
//            1 1 1 0 0 0
//            0 1 0 0 0 0
//            1 1 1 0 0 0
//            0 0 0 0 0 0
//            0 0 0 0 0 0
//            0 0 0 0 0 0
//    We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
//
//    a b c
//      d
//    e f g
//    There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
//
//    Task
//    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
//
//    Example
//
//    In the array shown above, the maximum hourglass sum is 7 for the hourglass in the top left corner.
//
//            Input Format
//
//    There are 6 lines of input, where each line contains 6 space-separated integers that describe the 2D Array A.
//
//            Constraints
//          -9 <= A[i][j]<= 9
//          0 <= i,j <=5
//    Output Format
//
//    Print the maximum hourglass sum in A.
//
//    Sample Input
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//    Sample Output
//
//         19
    public static int solve(List<List<Integer>> arr) {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int result;
            for (int k = 0; k < 4; k++) {
                System.out.println(arr.get(k).get(i) + arr.get(k).get(i + 1) + arr.get(k).get(i + 2));
                System.out.println(arr.get(k+1).get(i + 1));
                System.out.println(arr.get(k + 2).get(i) + arr.get(k + 2).get(i + 1) + arr.get(k + 2).get(i + 2));
                System.out.println("--------");
                result = arr.get(k).get(i) + arr.get(k).get(i + 1) + arr.get(k).get(i + 2) + arr.get(k + 1).get(i + 1) + arr.get(k + 2).get(i) + arr.get(k + 2).get(i + 1) + arr.get(k + 2).get(i + 2);
                if (i == 0 && k == 0) {
                    max = result;
                }
                if (max <= result) {
                    max = result;
                }
            }
            System.out.println("-------------Line---------------");

        }
        return max;
    }
}
