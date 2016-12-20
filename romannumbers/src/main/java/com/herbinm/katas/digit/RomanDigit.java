package com.herbinm.katas.digit;

import java.util.HashMap;
import java.util.Map;

import static com.herbinm.katas.digit.RomanDigit.RomanDigitDictionary.romanDigits;
import static java.util.Collections.unmodifiableMap;

public class RomanDigit implements Digit {

    private final char symbol;
    public final RomanDigit next;

    public RomanDigit(char symbol) {
        this.symbol = symbol;
        this.next = null;
    }

    public RomanDigit(char symbol, RomanDigit next) {
        this.symbol = symbol;
        this.next = next;
    }

    @Override
    public int toArabic(){
        int digit = romanDigits.get(symbol);
        return lessThenNext() ? -digit : digit;
    }

    private boolean lessThenNext(){
        return hasNextDigit() && nextIsGreater();
    }

    private boolean hasNextDigit(){
        return next != null;
    }

    private boolean nextIsGreater() {
        return romanDigits.get(symbol) < romanDigits.get(next.symbol);
    }

    static class RomanDigitDictionary {

        static final Map<Character, Integer> romanDigits;

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

}
