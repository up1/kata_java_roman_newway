package kata.roman.number;

import java.util.ArrayList;

public class RomanNumber {

	ArrayList<MyNumber> myNumber = new ArrayList<MyNumber>() {
		{
			add(new MyNumber(1000, "M"));
			add(new MyNumber(900, "CM"));
			add(new MyNumber(500, "D"));
			add(new MyNumber(400, "CD"));
			add(new MyNumber(100, "C"));
			add(new MyNumber(90, "XC"));
			add(new MyNumber(50, "L"));
			add(new MyNumber(40, "XL"));
			add(new MyNumber(10, "X"));
			add(new MyNumber(9, "IX"));
			add(new MyNumber(5, "V"));
			add(new MyNumber(4, "IV"));
			add(new MyNumber(1, "I"));
		}
	};

	public String convert(int arabicNumber) {
		if (arabicNumber == 0) {
			return "";
		}

		MyNumber number = getConvertFactor(arabicNumber);
		return number.roman + convert(arabicNumber - number.arabic);
	}

	private MyNumber getConvertFactor(int arabicNumber) {
		for (MyNumber number : myNumber) {
			if (number.arabic <= arabicNumber) {
				return number;
			}
		}
		return null;
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
