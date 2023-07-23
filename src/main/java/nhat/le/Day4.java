package nhat.le;

public class Day4 {
//    Task
//    Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as  is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
//
//    yearPasses() should increase the age instance variable by 1.
//    amIOld() should perform the following conditional actions:
//    If age < 13, print You are young..
//    If age >= 13 and age < 18, print You are a teenager..
//    Otherwise, print You are old..
//    To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!
//
//    Note: Do not remove or alter the stub code in the editor.
//
//            Input Format
//
//    Input is handled for you by the stub code in the editor.
//
//    The first line contains an integer, T (the number of test cases), and the T subsequent lines each contain an integer denoting the  of a Person instance.
//
//    Constraints
//
//    Output Format
//
//    Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. If your methods are implemented correctly, each test case will print  or  lines (depending on whether or not a valid  was passed to the constructor).
//    Constraints
//
//    1 <= T <= 4
//    -5 <= age <= 30
//      Sample Input
//
//          4
//        -1
//        10
//        16
//        18
//      Sample Output
//
//    Age is not valid, setting age to 0.
//    You are young.
//    You are young.
//
//    You are young.
//    You are a teenager.
//
//    You are a teenager.
//    You are old.
//
//    You are old.
//    You are old.

    public static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0");
            } else {
                this.age = initialAge;
            }
        }

        public int amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (this.age < 13) {
                System.out.println("You are young.");
                return 0;
            } else if (this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
                return 1;
            } else {
                System.out.println("You are old");
                return 2;
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            this.age += 1;
        }
    }
}
