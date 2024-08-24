package dev.mark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution2Test {
    @Test
    public void exampleTests() {
        assertEquals(true, Solution2.isAlt("amazon"));
        assertEquals(false, Solution2.isAlt("asshgsde"));
        assertEquals(false, Solution2.isAlt("apple"));
        assertEquals(true, Solution2.isAlt("banana"));
        assertEquals(false, Solution2.isAlt("aaacabegi"));
        assertEquals(true, Solution2.isAlt("parabola"));
        assertEquals(false, Solution2.isAlt("shmakiskd"));
    }
}
