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
    ROMAN_NUMERALS_MAP.put(5, "V");
    ROMAN_NUMERALS_MAP.put(4, "IV");
    ROMAN_NUMERALS_MAP.put(1, "I");
  }
  
  public static String convert(int number){
    if (number < 1 || number > 6) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 3.");
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

