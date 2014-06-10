package kata.roman.number;

public class RomanNumber {

	public String convert(int arabicNumber) {
		if(arabicNumber == 0) {
			return "";
		}
		if(arabicNumber == 1) {
			return "I";
		}
		if(arabicNumber == 5) {
			return "V";
		}
		return "I" + convert(arabicNumber - 1);
	}

}
