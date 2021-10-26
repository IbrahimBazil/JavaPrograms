package samplePrograms;

import java.util.Arrays;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 35;
		// int d = 2;

		int d[] = { 1, 2, 10, 7, 4 };
		int e = 0;
		int temp;
		int length = d.length;

		if (a > b && a > c) {
			System.out.println(a + " is greater than " + b + " and " + c);
		}

		if (b > a && b > c) {
			System.out.println(b + " is greater than " + a + " and " + c);
		}

		if (c > a && c > b) {
			System.out.println(c + " is greater than " + a + " and " + b);
		}

		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] > d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}

		System.out.println(d[length - 1]);
		
		
		Arrays.sort(d);
		System.out.println(d[length-1]);
		
	}

}
