package com.herbinm.katas;

public class RomanNumber {

    private RomanDigit sequenceHead;

    public RomanNumber(String numeral) {
        buildRomanDigitSequence(numeral);
    }

    public int toArabic() {
        int arabic = 0;
        RomanDigit current = sequenceHead;
        while (current != null) {
            arabic += current.toArabic();
            current = current.next;
        }
        return arabic;
    }

    private void buildRomanDigitSequence(String numeral) {
        for (int i = numeral.length() - 1; i >= 0; i--) {
            sequenceHead = createRomanDigit(numeral.charAt(i));
        }
    }

    private RomanDigit createRomanDigit(char symbol) {
        return sequenceHead == null ? new RomanDigit(symbol) : new RomanDigit(symbol, sequenceHead);
    }

}
