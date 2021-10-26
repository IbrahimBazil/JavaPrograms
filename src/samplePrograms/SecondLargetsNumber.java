package samplePrograms;

public class SecondLargetsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 50, 60, 89, 73, 100, 160 };
		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondlargest = largest;
				largest = array[i];
			} else if (array[i] > secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println("Second Largest Number is: " + secondlargest);
		System.out.println("Largest Number is: " + largest);
	}
}
