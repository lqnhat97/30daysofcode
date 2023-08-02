package nhat.le;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day13Test {

    @Test
    void solve() {
        String title = "The Alchemist";
        String author = "Paulo Coelho";
        int price = 248;
        Assertions.assertDoesNotThrow(() -> Day13.solve(title, author, price));
    }
}