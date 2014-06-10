package kata.roman.number;

import java.util.ArrayList;

public class RomanNumber {

	public String convert(int arabicNumber) {
		if (arabicNumber == 0) {
			return "";
		}

		ArrayList<MyNumber> myNumber = new ArrayList<MyNumber>();
		myNumber.add(new MyNumber(5, "V"));
		myNumber.add(new MyNumber(1, "I"));

		for (MyNumber number : myNumber) {
			if (number.arabic <= arabicNumber) {
				return number.roman + convert(arabicNumber - number.arabic);
			}
		}
		return "";
	}

}

class MyNumber {
	public int arabic;
	public String roman;

	public MyNumber(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}
}
