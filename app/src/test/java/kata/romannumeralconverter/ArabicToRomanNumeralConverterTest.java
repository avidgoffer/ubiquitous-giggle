package kata.romannumeralconverter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ArabicToRomanNumeralConverterTest {
    @Test
    public void whenArabicToRomanNumeralConverterIsPassedANumberItReturnsTheCorrectRomanNumeral() {
        ArabicToRomanNumeralConverter arabicToRomanNumeralConverter = new ArabicToRomanNumeralConverter();
        assertEquals("I", arabicToRomanNumeralConverter.convert(1));
    }
}