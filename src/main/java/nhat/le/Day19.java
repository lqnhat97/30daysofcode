package nhat.le;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class CalculatorD19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Day19 {
//    Objective
//    Today, we're learning about Interfaces. Check out the Tutorial tab for learning materials and an instructional video!
//
//    Task
//    The AdvancedArithmetic interface and the method declaration for the abstract divisorSum(n) method are provided for you in the editor below.
//
//    Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divisorSum(n) method must return the sum of all divisors of .
//
//    Example
//    n = 25
//    The divisors of 25 are 1,5,25. Their sum is 31.
//
//    n = 20
//    The divisors of 20 are 1,2,4,5,10,20 and their sum is 42.
//
//    Input Format
//
//    A single line with an integer, n.
//
//    Constraints
//    1 <= n <= 1000
//    Output Format
//
//    You are not responsible for printing anything to stdout. The locked template code in the editor below will call your code and print the necessary output.
//
//    Sample Input
//
//    6
//    Sample Output
//
//    I implemented: AdvancedArithmetic
//    12

    public static int solve(int n) {
        AdvancedArithmetic myCalculator = new CalculatorD19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
        return sum;
    }
}
