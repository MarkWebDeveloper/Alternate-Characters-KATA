package dev.mark;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    static char currentChar;
    static char prevChar;

    public static boolean isAlt(String word) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> consonants = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));

        for (int i = 1; i < word.length(); i++) {

            currentChar = word.charAt(i);
            prevChar = word.charAt(i - 1);

            if (vowels.contains(currentChar) && consonants.contains(prevChar)) {
                continue;
            } else if (consonants.contains(currentChar) && vowels.contains(prevChar)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
