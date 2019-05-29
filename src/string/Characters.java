package string;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringMethods string = new StringMethods();

		java.lang.String str;

		System.out.println("Input string: ");
		str = input.nextLine();

		System.out.println("Characters on even position: ");
		System.out.println(string.charOnEvenPosition(str));

		System.out.println("Characters on odd position: ");
		System.out.println(string.charOnOddPosition(str));

		System.out.println("Number of uppercase characters: ");
		System.out.println(string.upperCaseCharacters(str));

		System.out.println("Number of lowercase characters: ");
		System.out.println(string.lowerCaseCharacters(str));

		System.out.println("Characters that are not letters");
		System.out.println(string.charactersNoLetters(str));

		input.close();
	}

}
