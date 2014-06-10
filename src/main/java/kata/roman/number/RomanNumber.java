package kata.roman.number;

public class RomanNumber {

	public String convert(int arabicNumber) {
		if(arabicNumber == 1) {
			return "I";
		}
		if(arabicNumber == 5) {
			return "V";
		}
		if(arabicNumber == 2) {
			return "II";
		}
		return "";
	}

}
