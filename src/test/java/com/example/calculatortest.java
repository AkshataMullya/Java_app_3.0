package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatortest {  // class name matches filename

    @Test
    public void testAdd() {
        calculator calc = new calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        calculator calc = new calculator();
        int result = calc.subtract(5, 3);
        assertEquals(2, result);
    }
}
