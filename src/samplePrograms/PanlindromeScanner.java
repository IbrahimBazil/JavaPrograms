package samplePrograms;

import java.util.Scanner;

public class PanlindromeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		int length;
		System.out.println("Enter the Name: ");
		original = in.nextLine();
		length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("The Reverse of String is: " + reverse);

		if (original.equals(reverse)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}
	}
}
