package nhat.le;

import java.util.ArrayList;
import java.util.List;

public class Day7 {
//    Objective
//    Today, we will learn about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video.
//
//    Task
//    Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
//
//    Example
//      A = [1,2,3,4]
//
//    Print 4 3 2 1. Each integer is separated by one space.
//
//            Input Format
//
//    The first line contains an integer,  (the size of our array).
//    The second line contains  space-separated integers that describe array 's elements.
//
//
//            Constraints
//            1 <= N <= 1000
//        1 <= A[i] <= 10000, where A[i] is the i integer in the array.
//
//            Output Format
//    Print the elements of array  in reverse order as a single line of space-separated numbers.
//
//    Sample Input
//
//        4
//        1 4 3 2
//    Sample Output
//
//      2 3 4 1

    public static List<Integer> solve (List<Integer> a) {
        List<Integer> rs = new ArrayList<>();
        for (int i = a.size() -1; i >= 0; i--) {
            System.out.print(a.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
            rs.add(a.get(i));
        }
        return rs;
    }
}
