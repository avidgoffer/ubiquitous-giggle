package kata.romannumeralconverter;

public class ArabicToRomanNumeralConverter {
    public String convert(int number) {
        StringBuilder romanNumerals = new StringBuilder();
        int iCount = 0;
        while(number > 0) {
            if(number - 5 >= 0) {
                number -= 5;
                romanNumerals.append("V");
            } else if(number - 1 >= 0) {
                number -= 1;
                iCount++;
                if(iCount > 3){
                    romanNumerals.delete(romanNumerals.length() - 3, romanNumerals.length());
                    romanNumerals.append("IV");
                    iCount = 0;
                } else {
                    romanNumerals.append("I");
                }
            }
        }
        return romanNumerals.toString();
    }
}