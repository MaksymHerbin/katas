package com.herbinm.katas;

import static com.herbinm.katas.RomanDigitDictionary.romanDigits;

public class RomanDigit {

    private final char symbol;
    final RomanDigit next;

    public RomanDigit(char symbol) {
        this.symbol = symbol;
        this.next = null;
    }

    public RomanDigit(char symbol, RomanDigit next) {
        this.symbol = symbol;
        this.next = next;
    }

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

}
