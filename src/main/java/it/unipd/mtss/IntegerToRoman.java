////////////////////////////////////////////////////////////////////
// Gabriele Di Pietro 2010000
// Elio Greggio 2012831
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.TreeMap;

public class IntegerToRoman {
  
  // Map che associa i numeri arabi ai corrispondenti numeri romani
  private static final TreeMap<Integer, String> ROMAN_NUMERALS_MAP = new TreeMap<>();
  static {
    ROMAN_NUMERALS_MAP.put(1000, "M");
    ROMAN_NUMERALS_MAP.put(900, "CM");
    ROMAN_NUMERALS_MAP.put(500, "D");
    ROMAN_NUMERALS_MAP.put(400, "CD");
    ROMAN_NUMERALS_MAP.put(100, "C");
    ROMAN_NUMERALS_MAP.put(90, "XC");
    ROMAN_NUMERALS_MAP.put(50, "L");
    ROMAN_NUMERALS_MAP.put(40, "XL");
    ROMAN_NUMERALS_MAP.put(10, "X");
    ROMAN_NUMERALS_MAP.put(9, "IX");
    ROMAN_NUMERALS_MAP.put(5, "V");
    ROMAN_NUMERALS_MAP.put(4, "IV");
    ROMAN_NUMERALS_MAP.put(1, "I");
  }
  
  public static String convert(int number){

    if (number < 1 || number > 1000) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000.");
    }
    
    StringBuilder romanNumber = new StringBuilder();
    int floorEntry;
    while (number > 0) {
      floorEntry = ROMAN_NUMERALS_MAP.floorKey(number);
      romanNumber.append(ROMAN_NUMERALS_MAP.get(floorEntry));
      number -= floorEntry;
    }
    
    return romanNumber.toString();
  }
}

