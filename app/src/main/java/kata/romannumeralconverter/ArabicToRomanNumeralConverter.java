package kata.romannumeralconverter;

import android.support.annotation.NonNull;

public class ArabicToRomanNumeralConverter {

    private int _numberToConvert;

    public String convert(final int numberToConvert) {
        if(numberToConvert <= 0 || numberToConvert > 300) throw new IllegalArgumentException("numberToConvert is not in an expected range of 1 to 3,000");

        _numberToConvert = numberToConvert;
        StringBuilder romanNumerals = new StringBuilder();
        romanNumerals.append(getNumerals("X", "L", "C", 10, 50, 100));
        romanNumerals.append(getNumerals("I", "V", "X", 1, 5, 10));
        return romanNumerals.toString();
    }

    @NonNull
    private String getNumerals(final String lowNumeral, final String midNumeral, final String highNumeral,
                               final int lowValue, final int midValue, final int highValue) {
        StringBuilder romanNumerals = new StringBuilder();
        int iCount = 0;
        int number = _numberToConvert;

        while(number >= lowValue) {
            if(number - highValue >= 0) {
                number -= highValue;
                romanNumerals.append(highNumeral);
            } else if(number - midValue >= 0 && number - midValue <= lowValue * 3) {
                number -= midValue;
                romanNumerals.append(midNumeral);
            } else if(number - midValue >= 0 && number - midValue > lowValue * 3) {
                number -= highValue - 1;
                romanNumerals
                        .append(lowNumeral)
                        .append(highNumeral);
            } else if(number - lowValue >= 0) {
                number -= lowValue;
                iCount++;
                if(iCount > 3){
                    romanNumerals.delete(romanNumerals.length() - 3, romanNumerals.length());
                    if(number > 0) {
                        romanNumerals
                                .append(midNumeral)
                                .append(lowNumeral);
                    } else {
                        romanNumerals
                                .append(lowNumeral)
                                .append(midNumeral);
                    }
                    iCount = 0;
                } else {
                    romanNumerals.append(lowNumeral);
                }
            }
        }
        _numberToConvert = number;
        return romanNumerals.toString();
    }
}