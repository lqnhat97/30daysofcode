package nhat.le;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8 {
//    Objective
//    Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure. Check out the Tutorial tab for learning materials and an instructional video!
//
//    Task
//    Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.
//
//    Note: Your phone book should be a Dictionary/Map/HashMap data structure.
//
//            Input Format
//
//    The first line contains an integer, n, denoting the number of entries in the phone book.
//    Each of the n subsequent lines describes an entry in the form of  space-separated values on a single line. The first value is a friend's name, and the second value is an 8-digit phone number.
//
//    After the n lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.
//
//    Note: Names consist of lowercase English alphabetic letters and are first names only.
//
//    Constraints
//    1<= n <= 10^5
//
//    Output Format
//    1<= queries <= 10^5
//
//    On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full  and  in the format name=phoneNumber.
//
//            Sample Input
//
//    3
//    sam 99912222
//    tom 11122222
//    harry 12299933
//    sam
//    edward
//    harry

//    Sample Output
//
//    sam=99912222
//    Not found
//    harry=12299933

    public static Map<String, Integer> solve(int n, List<String> data) {
        Map<String, Integer> book = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] seperateData = data.get(i).trim().split(" ");
            String name = seperateData[0];
            Integer phone = Integer.parseInt(seperateData[1]);
            book.put(name, phone);
        }
        for (int k = n; k < data.size(); k++) {
            if (null != book.get(data.get(k))) {
                System.out.println(data.get(k) + "=" + book.get(data.get(k)));
                result.put(data.get(k), book.get(data.get(k)));
            } else {
                System.out.println("Not found");
                result.put(data.get(k), -1);
            }
        }
        return result;
    }
}
