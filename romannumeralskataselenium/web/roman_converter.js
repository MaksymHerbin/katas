var ROMAN_DIGITS = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}

function convertRomanToNumeric(romanNumeral){
   var numericValue = 0;
   var previous = 0;
   for(i = romanNumeral.length - 1; i >= 0; i--){
      current = ROMAN_DIGITS[romanNumeral.charAt(i)];
      numericValue += calculateDigit(current, previous);
      previous = current;
   }
   return numericValue;
}

function calculateDigit(current, previous){
   return current < previous ? -current : current;
}