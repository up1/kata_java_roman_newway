package kata.roman.number;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanNumber {

	public String convert(int arabicNumber) {
		if (arabicNumber == 0) {
			return "";
		}

		if (arabicNumber == 5) {
			return "V";
		}

		ArrayList<MyNumber> myNumber = new ArrayList<MyNumber>();
		myNumber.add(new MyNumber(1, "I"));

		return myNumber.get(0).roman
				+ convert(arabicNumber - myNumber.get(0).arabic);
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
