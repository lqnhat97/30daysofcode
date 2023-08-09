package nhat.le;

import java.util.List;

class Printer<T> {

    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return anything.
     *
     * @param array generic array
     **/

    // Write your code here
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Day21 {
    //    Objective
//    Today we're discussing Generics; be aware that not all languages support this construct, so fewer languages are enabled for this challenge. Check out the Tutorial tab for learning materials and an instructional video!
//
//    Task
//    Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.
//
//    Note: You must use generics to solve this challenge. Do not write overloaded functions.
//
//            Input Format
//
//    The locked Solution class in your editor will pass different types of arrays to your printArray function.
//
//    Constraints
//
//    You must have exactly 1 function named printArray.
//            Output Format
//
//    Your printArray function should print each element of its generic array parameter on a new line.
    public static void solve(List<Integer> n, List<String> arr) {
        Printer<Integer> intPrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();
        intPrinter.printArray(n.toArray(new Integer[0]));
        stringPrinter.printArray(arr.toArray(new String[0]));
    }
}
