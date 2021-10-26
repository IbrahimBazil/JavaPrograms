package samplePrograms;

public class ReverseStringUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Bazil";
		String reverse = "";
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
}
