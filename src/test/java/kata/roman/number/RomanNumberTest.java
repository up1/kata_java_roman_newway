package kata.roman.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void zeroNotValidInRomanNumberShouldReturnEmptyString() {
		RomanNumber romanNumber = new RomanNumber();
		assertEquals("", romanNumber.convert(0));
	}

}
