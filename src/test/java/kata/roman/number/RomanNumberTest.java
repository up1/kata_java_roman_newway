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
	public void twoShouldReturnII() {
		assertEquals("II", romanNumber.convert(2));
	}
	
	@Test
	public void threeShouldReturnIII() {
		assertEquals("III", romanNumber.convert(3));
	}
	
	@Test
	public void fourShouldReturnIV() {
		assertEquals("IV", romanNumber.convert(4));
	}
	
	@Test
	public void fiveShouldReturnV() {
		assertEquals("V", romanNumber.convert(5));
	}
	
	@Test
	public void tenShouldReturnX() {
		assertEquals("X", romanNumber.convert(10));
	}
	
	@Test
	public void anotherCase() {
		assertEquals("L", romanNumber.convert(50));
		assertEquals("C", romanNumber.convert(100));
		assertEquals("D", romanNumber.convert(500));
		assertEquals("M", romanNumber.convert(1000));
	}

}
