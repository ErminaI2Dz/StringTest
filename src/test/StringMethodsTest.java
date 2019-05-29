package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import string.StringMethods;

public class StringMethodsTest {

	StringMethods stringMethods;

	@Before
	public void setUp() {

		// arrange
		stringMethods = new StringMethods();
	}

	@Test
	public void charOnEvenPositionTest() {
		// act
		String result = stringMethods.charOnEvenPosition("abc123DEF");
		// assertion
		assertEquals("a c 2 D F ", result);
	}

	@Test
	public void charOnOddPositionTest() {
		String result = stringMethods.charOnOddPosition("abc123DEF");
		assertEquals("b 1 3 E ", result);
	}

	@Test
	public void upperCaseCharactersTest() {
		int result = stringMethods.upperCaseCharacters("abc123DEF");
		assertEquals(3, result);
	}

	@Test
	public void lowerCaseCharactersTest() {
		int result = stringMethods.lowerCaseCharacters("abc123DEF");
		assertEquals(3, result);
	}

	@Test
	public void charactersNoLettersTest() {
		String result = stringMethods.charactersNoLetters("abc123DEF");
		assertEquals("1 2 3 ", result);
	}
}
