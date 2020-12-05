package org.example.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    @DisplayName("3の倍数の場合Fizzが返る")
    void fizzIsReturnedIfItIsAMultipleOf3() {
        int data = 3;
        String actual = FizzBuzz.calculate(data);
        String expect = "Fizz";
        assertEquals(actual, expect);
    }
}
