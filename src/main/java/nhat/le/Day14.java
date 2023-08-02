package nhat.le;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] arr) {
        this.elements = arr;
    }

    public void computeDifference() {
        int min = this.elements[0];
        int max = this.elements[0];
        for (int e : elements) {
            if (e > max) {
                max = e;
            }
            if (e < min) {
                min = e;
            }
        }
        this.maximumDifference = max - min;
    }
}

public class Day14 {
//    Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!
//
//    The absolute difference between two integers, a and b, is written as |a-b|. The maximum absolute difference between two integers in a set of positive integers, elements, is the largest absolute difference between any two integers in __elements.
//
//    The Difference class is started for you in the editor. It has a private integer array (elements) for storing N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.
//
//            Task
//    Complete the Difference class by writing the following:
//
//    A class constructor that takes an array of integers as a parameter and saves it to the __elements instance variable.
//    A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
//    Input Format
//
//    You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in 2 lines of input. The first line contains N, the size of the elements array. The second line has N space-separated integers that describe the __elements array.
//
//    Constraints
//    1 <= N <= 10
//    1 <= __elements[i] <= 100, where 0 < i < N-1

//    Output Format
//
//    You are not responsible for printing any output; the Solution class will print the value of the maximumDifference instance variable.
//
//    Sample Input
//
//    STDIN   Function
//    -----   --------
//    3       __elements[] size N = 3
//    1 2 5   __elements = [1, 2, 5]
//    Sample Output
//    4

    public static int solve(int[] arr) {
        Difference difference = new Difference(arr);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
        return difference.maximumDifference;
    }
}
