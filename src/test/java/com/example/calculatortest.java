package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatortest {

    @Test
    void testAdd() {
        calculator calc = new calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        calculator calc = new calculator();
        assertEquals(2, calc.subtract(5, 3));
    }
}
