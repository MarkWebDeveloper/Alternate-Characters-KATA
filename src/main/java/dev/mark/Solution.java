package dev.mark;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isAlt(String word) {
        //make note that 'y' should not be treated as vowel

        // isAlt("amazon")
        // // true
        // isAlt("apple")
        // // false
        // isAlt("banana")
        // // true

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> consonants = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));

        boolean isEven = word.length() % 2 == 0;
        int expectedNumOfVowels = 0;
        int expectedNumOfConsonants = 0;
        int numberOfMatchingConsonants = 0;
        int numberOfMatchingVowels = 0;
        boolean result = false;

        if (isEven) {
            expectedNumOfVowels = word.length() / 2;
            expectedNumOfConsonants = word.length() / 2;
        } else if (!isEven && vowels.contains(word.charAt(0))) {
            expectedNumOfVowels = word.length() / 2 + 1;
            expectedNumOfConsonants = word.length() / 2;
        } else if (!isEven && consonants.contains(word.charAt(0))) {
            expectedNumOfVowels = word.length() / 2;
            expectedNumOfConsonants = word.length() / 2 + 1;
        }

        if (vowels.contains(word.charAt(0))) {

            for (int i = 0; i < word.length(); i = i + 2) {
                if (vowels.contains(word.charAt(i))) {
                    numberOfMatchingVowels++;
                }
            }

            for (int i = 1; i < word.length(); i = i + 2) {
                if (consonants.contains(word.charAt(i))) {
                    numberOfMatchingConsonants++;
                }
            }

            if (expectedNumOfVowels == numberOfMatchingVowels && expectedNumOfConsonants == numberOfMatchingConsonants) {
                result = true;
            } else {
                result = false;
            }
        }

        if (consonants.contains(word.charAt(0))) {

            for (int i = 0; i < word.length(); i = i + 2) {
                if (consonants.contains(word.charAt(i))) {
                    numberOfMatchingConsonants++;
                }
            }

            for (int i = 1; i < word.length(); i = i + 2) {
                if (vowels.contains(word.charAt(i))) {
                    numberOfMatchingVowels++;
                }
            }

            if (expectedNumOfVowels == numberOfMatchingVowels && expectedNumOfConsonants == numberOfMatchingConsonants) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }
}