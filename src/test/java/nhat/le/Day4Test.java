package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day4Test {
    @Test
    void test() {
        int test1 = -1;
        int test2 = 3;
        int test3 = 15;
        int test4 = 22;

        Day4.Person p1 = new Day4.Person(test1);
        Day4.Person p2 = new Day4.Person(test2);
        Day4.Person p3 = new Day4.Person(test3);
        Day4.Person p4 = new Day4.Person(test4);

        p1.yearPasses();
        p2.yearPasses();
        p3.yearPasses();
        p4.yearPasses();

        int result1 = p1.amIOld();
        int result2 = p2.amIOld();
        int result3 = p3.amIOld();
        int result4 = p4.amIOld();

        Assertions.assertEquals(0, result1);
        Assertions.assertEquals(0, result2);
        Assertions.assertEquals(1, result3);
        Assertions.assertEquals(2, result4);
    }
}