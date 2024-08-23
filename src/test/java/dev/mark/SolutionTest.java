package dev.mark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals(true, Solution.isAlt("amazon"));
        assertEquals(false, Solution.isAlt("apple"));
        assertEquals(true, Solution.isAlt("banana"));
    }
}
