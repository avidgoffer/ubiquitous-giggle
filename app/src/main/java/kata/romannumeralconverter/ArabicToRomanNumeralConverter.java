package kata.romannumeralconverter;

public class ArabicToRomanNumeralConverter {

    private int _numberToConvert;

    public String convert(final Integer numberToConvert) {
        if(numberToConvert <= 0 || numberToConvert > 3999) throw new IllegalArgumentException("numberToConvert is not in an expected range of 1 to 3,999");

        _numberToConvert = numberToConvert;

        String[][] romanNumerals = new String[][]
                {
                        new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // ones
                        new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, // tens
                        new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, // hundreds
                        new String[]{"", "M", "MM", "MMM" } // thousands
                };

        // split integer string into array and reverse array
        String[] intArr = new StringBuilder(numberToConvert.toString()).reverse().toString().split("");
        int len = intArr.length;
        String romanNumeral = "";
        int i = len;

        // get the roman numeral representation for each place in the string
        while (i-- > 1)
        {
            romanNumeral += romanNumerals[i - 1][Integer.parseInt(intArr[i])];
        }

        return romanNumeral;
    }
}