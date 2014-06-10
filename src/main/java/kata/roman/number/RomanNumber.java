package kata.roman.number;

import java.util.ArrayList;

public class RomanNumber {

	public String convert(int arabicNumber) {
		if (arabicNumber == 0) {
			return "";
		}

		MyNumber number = getConvertFactor(arabicNumber);
		return number.roman + convert(arabicNumber - number.arabic);
	}

	private MyNumber getConvertFactor(int arabicNumber) {
		ArrayList<MyNumber> myNumber = new ArrayList<MyNumber>();
		myNumber.add(new MyNumber(1000, "M"));
		myNumber.add(new MyNumber(900, "CM"));
		myNumber.add(new MyNumber(500, "D"));
		myNumber.add(new MyNumber(400, "CD"));
		myNumber.add(new MyNumber(100, "C"));
		myNumber.add(new MyNumber(90, "XC"));
		myNumber.add(new MyNumber(50, "L"));
		myNumber.add(new MyNumber(40, "XL"));
		myNumber.add(new MyNumber(10, "X"));
		myNumber.add(new MyNumber(9, "IX"));
		myNumber.add(new MyNumber(5, "V"));
		myNumber.add(new MyNumber(4, "IV"));
		myNumber.add(new MyNumber(1, "I"));

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
