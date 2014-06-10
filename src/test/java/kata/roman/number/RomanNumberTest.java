package kata.roman.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	RomanNumber romanNumber = new RomanNumber();
	
	@Test
	public void zeroNotValidInRomanNumberShouldReturnEmptyString() {
		assertEquals("", romanNumber.convert(0));
	}
	
	@Test
	public void oneShouldReturnI() {
		assertEquals("I", romanNumber.convert(1));
	}
	
	@Test
	public void fiveShouldReturnV() {
		assertEquals("V", romanNumber.convert(5));
	}

}
