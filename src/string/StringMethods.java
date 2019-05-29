package string;

public class StringMethods {

	// Method displays characters on even positions
	public String charOnEvenPosition(String str) {

		String charOnEvenPosition = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0 && str.charAt(i) != ' ') {
				charOnEvenPosition += str.charAt(i) + " ";
			}
		}

		return charOnEvenPosition;
	}

	// Method displays characters on odd positions
	public String charOnOddPosition(String str) {

		String charOnOddPosition = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0 && str.charAt(i) != ' ') {
				charOnOddPosition += str.charAt(i) + " ";
			}
		}

		return charOnOddPosition;
	}

	// Method counts uppercase characters of a string
	public int upperCaseCharacters(String str) {

		int counterUpperCaseCharacters = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				counterUpperCaseCharacters++;
			}
		}

		return counterUpperCaseCharacters;
	}

	// Method counts lowercase characters of a string
	public int lowerCaseCharacters(String str) {

		int counterLowerCaseCharacters = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				counterLowerCaseCharacters++;
			}
		}

		return counterLowerCaseCharacters;
	}

	// Method displays characters that are not letters
	public String charactersNoLetters(String str) {

		String charactersNoLetters = "";

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)) && str.charAt(i) != ' ') {
				charactersNoLetters += str.charAt(i) + " ";
			}
		}

		return charactersNoLetters;
	}
}
