package kata.romannumeralconverter;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralToArabicConverter {

    private static final Map<String, Integer> _romanNumerals;

    static {
        _romanNumerals = new LinkedHashMap<>();
        _romanNumerals.put("MMM", 3000);
        _romanNumerals.put("MM",  2000);
        _romanNumerals.put("M",   1000);

        _romanNumerals.put("CM", 900);
        _romanNumerals.put("DCCC", 800);
        _romanNumerals.put("DCC", 700);
        _romanNumerals.put("DC", 600);
        _romanNumerals.put("D", 500);
        _romanNumerals.put("CD", 400);
        _romanNumerals.put("CCC", 300);
        _romanNumerals.put("CC", 200);
        _romanNumerals.put("C", 100);

        _romanNumerals.put("XC", 90);
        _romanNumerals.put("LXXX", 80);
        _romanNumerals.put("LXX", 70);
        _romanNumerals.put("LX", 60);
        _romanNumerals.put("XL", 50);
        _romanNumerals.put("XXX", 40);
        _romanNumerals.put("XX", 30);
        _romanNumerals.put("X", 20);
        _romanNumerals.put("L", 10);

        _romanNumerals.put("IX", 9);
        _romanNumerals.put("VIII", 8);
        _romanNumerals.put("VII", 7);
        _romanNumerals.put("VI", 6);
        _romanNumerals.put("V", 5);
        _romanNumerals.put("IV", 4);
        _romanNumerals.put("III", 3);
        _romanNumerals.put("II", 2);
        _romanNumerals.put("I", 1);
    }

    public int convert(final String romanNumeralToConvert) {
        StringBuilder numerals = new StringBuilder(romanNumeralToConvert);
        int number = 0;
        for(Map.Entry<String, Integer> numeral : _romanNumerals.entrySet()){
            if(numerals.indexOf(numeral.getKey()) == 0) {
                numerals.delete(0, numeral.getKey().length());
                number += numeral.getValue();
                if(numerals.length() == 0) break;
            }
        }

        return number;
    }
}