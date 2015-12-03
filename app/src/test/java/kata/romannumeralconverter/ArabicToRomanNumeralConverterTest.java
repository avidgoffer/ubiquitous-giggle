package kata.romannumeralconverter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ArabicToRomanNumeralConverterTest {
    @Test
    public void whenArabicToRomanNumeralConverterIsPassedANumberItReturnsTheCorrectRomanNumeral() {
        ArabicToRomanNumeralConverter arabicToRomanNumeralConverter = new ArabicToRomanNumeralConverter();
        assertEquals("I", arabicToRomanNumeralConverter.convert(1));
        assertEquals("II", arabicToRomanNumeralConverter.convert(2));
        assertEquals("III", arabicToRomanNumeralConverter.convert(3));
        assertEquals("IV", arabicToRomanNumeralConverter.convert(4));
        assertEquals("V", arabicToRomanNumeralConverter.convert(5));
        assertEquals("VI", arabicToRomanNumeralConverter.convert(6));
    }
}