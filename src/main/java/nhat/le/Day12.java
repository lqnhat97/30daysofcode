package nhat.le;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day12 {
//    Objective
//    Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.
//
//    Task
//    You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
//
//    Complete the Student class by writing the following:
//
//    A Student class constructor, which has 4 parameters:
//    A string, firstName.
//    A string, lastName.
//    An integer, idNumber.
//    An integer array (or vector) of test scores, scores.
//    A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
//    Grading scale
//    Letter O | 90 <= a <= 100
//    Letter E | 80 <= a < 90
//    Letter A | 70 <= a < 80
//    Letter P | 55 <= a < 70
//    Letter D | 40 <= a < 55
//    Letter T | a < 40
//
//    Input Format
//
//    The locked stub code in the editor reads the input and calls the Student class constructor with the necessary arguments. It also calls the calculate method which takes no arguments.
//
//    The first line contains firstName, lastName, and idNumber, separated by a space. The second line contains the number of test scores. The third line of space-separated integers describes scores.
//
//            Constraints
//    1 <= length of firstName, length of lastName <= 10
//    length of idNumber = 7
//    0 <= scores <= 100
//
//    Output Format
//
//    Output is handled by the locked stub code. Your output will be correct if your Student class constructor and calculate() method are properly implemented.
//
//    Sample Input
//    Heraldo Memelli 8135627
//            2
//            100 80

    //    Sample Output
//    Name: Memelli, Heraldo
//    ID: 8135627
//    Grade: O

    public static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    public static class Student extends Person {
        private int[] testScores;

        public Student(String firstName, String lastName, int idNumber, int[] testScores) {
            super(firstName, lastName, idNumber);
            this.testScores = testScores;
        }

        private String calculate() {
            int average = 0;
            int len = this.testScores.length;
            for (int i = 0; i < len; i++) {
                average += this.testScores[i];
            }
            average /= len;
            if (90 <= average && average <= 100) {
                return "O";
            } else if (80 <= average && average < 90) {
                return "E";
            } else if (70 <= average && average < 80) {
                return "A";
            } else if (55 <= average & average < 70) {
                return "P";
            } else if (40 <= average && average < 55) {
                return "D";
            } else {
                return "T";
            }
        }
    }

    public static String solve(String studentInfo, String scores) {
        String[] infoArr = studentInfo.trim().split(" ");
        List<String> arr = Arrays.stream(scores.trim().split(" ")).collect(Collectors.toList());
        int[] scoreArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            scoreArr[i] = Integer.parseInt(arr.get(i));
        }
        Student student = new Student(infoArr[0], infoArr[1], Integer.parseInt(infoArr[2]), scoreArr);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
        return student.calculate();
    }
}
