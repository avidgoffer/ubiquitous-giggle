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
        assertEquals("VI", arabicToRomanNumeralConverter.convert(6));
        assertEquals("V", arabicToRomanNumeralConverter.convert(5));
        assertEquals("VII", arabicToRomanNumeralConverter.convert(7));
        assertEquals("VIII", arabicToRomanNumeralConverter.convert(8));
        assertEquals("IX", arabicToRomanNumeralConverter.convert(9));
        assertEquals("X", arabicToRomanNumeralConverter.convert(10));
        assertEquals("XI", arabicToRomanNumeralConverter.convert(11));
        assertEquals("XII", arabicToRomanNumeralConverter.convert(12));
        assertEquals("XIII", arabicToRomanNumeralConverter.convert(13));
        assertEquals("XIV", arabicToRomanNumeralConverter.convert(14));
        assertEquals("XV", arabicToRomanNumeralConverter.convert(15));
        assertEquals("XVI", arabicToRomanNumeralConverter.convert(16));
        assertEquals("XVII", arabicToRomanNumeralConverter.convert(17));
        assertEquals("XVIII", arabicToRomanNumeralConverter.convert(18));
        assertEquals("XIX", arabicToRomanNumeralConverter.convert(19));
        assertEquals("XX", arabicToRomanNumeralConverter.convert(20));
        assertEquals("XXI", arabicToRomanNumeralConverter.convert(21));
        assertEquals("XL", arabicToRomanNumeralConverter.convert(40));
        assertEquals("L", arabicToRomanNumeralConverter.convert(50));
        assertEquals("XC", arabicToRomanNumeralConverter.convert(90));
        assertEquals("MLXVI", arabicToRomanNumeralConverter.convert(1066));
        assertEquals("MCMLXXXIX", arabicToRomanNumeralConverter.convert(1989));
    }
}