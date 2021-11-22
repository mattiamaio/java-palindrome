package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = "";
		String inputReverse = "";

		System.out.print("Scrivi qui una parola: ");
		input = scan.nextLine();

		for (int i = input.length() - 1; i >= 0; i--) {
			inputReverse += input.charAt(i);
		}

		if (inputReverse.equals(input)) {
			System.out.println("Il contrario della parola inserita è " + inputReverse + " ed è lunga "
					+ inputReverse.length() + " caratteri");
			System.out.println("La parola inserita è un palindromo");
		} else {
			System.out.println("Il contrario della parola inserita è: " + inputReverse);
			System.out.println("La parola inserita non è un palindromo");

		}

		scan.close();

	}

}
