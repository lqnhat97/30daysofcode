package nhat.le;

public class Day6 {
//    Objective
//    Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the Tutorial tab for learning materials and an instructional video.
//
//    Task
//    Given a string, S, of length N that is indexed from 0 to n-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
//
//    Note: 0 is considered to be an even index.
//
//            Example
//          s = adbecf
//
//    Print abc def
//
//    Input Format
//
//    The first line contains an integer, <></> (the number of test cases).
//    Each line i of the T subsequent lines contain a string, S.
//
//    Constraints
//      1 <= T < 10
//    Output Format
//
//    For each String S(j) (where 0 <= j <= T-1), print S(j)'s even-indexed characters, followed by a space, followed by 's odd-indexed characters.
    public static String solve(String s) {
        s = s.trim().replaceAll("\\s", "");
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();
        for (int i = 0; i<s.length();i++) {
            if (i%2==0) {
                r1.append(s.charAt(i));
            } else {
                r2.append(s.charAt(i));
            }
        }
        return r1 + " " + r2;
    }
}
