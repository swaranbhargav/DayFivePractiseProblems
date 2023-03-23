package com.bridgelabz.FunctionalProgramingProblems;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = input.nextInt();
		input.close();
		if (n == 0) {
			System.out.println("Error: N must be a non-zero positive integer.");
			return;
		}
		double harmonicNumber = 0;
		for (int i = 1; i <= n; i++) {
			harmonicNumber = harmonicNumber + 1.0 / i;
		}
		System.out.println("The " + n + "th Harmonic Number is: " + harmonicNumber);

	}

}
