package com.library;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateFine_WithFine() {
        // 2 books, 10 days (3 days extra). 3 * 10 * 2 = 60
        assertEquals(60, App.calculateFine(2, 10));
    }

    @Test
    public void testCalculateFine_NoFine() {
        // 5 books, 5 days (No extra days). Fine should be 0
        assertEquals(0, App.calculateFine(5, 5));
    }
}
