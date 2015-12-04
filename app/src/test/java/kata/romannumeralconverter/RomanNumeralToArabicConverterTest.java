package kata.romannumeralconverter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RomanNumeralToArabicConverterTest {
    @Test
    public void whenRomanNumeralToArabicConverterIsPassedARomanNumeralItReturnsTheCorrectNumber() {
        RomanNumeralToArabicConverter romanNumeralToArabicConverter = new RomanNumeralToArabicConverter();
        assertEquals(1, romanNumeralToArabicConverter.convert("I"));
        assertEquals(3, romanNumeralToArabicConverter.convert("III"));
        assertEquals(9, romanNumeralToArabicConverter.convert("IX"));
        assertEquals(1066, romanNumeralToArabicConverter.convert("MLXVI"));
        assertEquals(1989, romanNumeralToArabicConverter.convert("MCMLXXXIX"));
    }
}