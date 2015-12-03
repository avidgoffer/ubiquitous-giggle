package kata.romannumeralconverter;

public class ArabicToRomanNumeralConverter {
    public String convert(int number) {
        StringBuilder romanNumerals = new StringBuilder();
        while(number > 0) {
            if(number - 1 >= 0) {
                number -= 1;
                romanNumerals.append("I");
            }
        }
        return romanNumerals.toString();
    }
}