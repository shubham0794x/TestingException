package com.ironhack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MathLibraryTest {

    @Test
    public void multiply_largeInts_IllegalArgumentException() {
        MathLibrary math = new MathLibrary();
        assertThrows(IllegalArgumentException.class, () -> math.multiply(90000000,40000000));
    }
}