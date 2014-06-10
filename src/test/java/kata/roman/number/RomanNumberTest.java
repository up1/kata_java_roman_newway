package kata.roman.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void zeroNotValidInRomanNumberShouldReturnEmptyString() {
		RomanNumber romanNumber = new RomanNumber();
		assertEquals("", romanNumber.convert(0));
	}
	
	@Test
	public void oneShouldReturnI() {
		RomanNumber romanNumber = new RomanNumber();
		assertEquals("I", romanNumber.convert(1));
	}

}
