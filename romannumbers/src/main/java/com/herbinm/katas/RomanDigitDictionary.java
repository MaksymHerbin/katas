package com.herbinm.katas;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.unmodifiableMap;

public class RomanDigitDictionary {

    public static final Map<Character, Integer> romanDigits;

    static {
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
        romanDigits = unmodifiableMap(dictionary);
    }

}
