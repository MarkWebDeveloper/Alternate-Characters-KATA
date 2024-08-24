package dev.mark;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public static boolean isAlt(String word) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 1; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i)) && !vowels.contains(word.charAt(i - 1)) 
                || vowels.contains(word.charAt(i - 1)) && !vowels.contains(word.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
