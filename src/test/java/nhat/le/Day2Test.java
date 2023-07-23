package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2Test {

    @Test
    void solve() {
        double meal_cost = 12;
        int tip_percent = 20;
        int tax_percent = 8;
        double result = Day2.solve(meal_cost, tip_percent, tax_percent);
        Assertions.assertEquals(15, result);
    }
}