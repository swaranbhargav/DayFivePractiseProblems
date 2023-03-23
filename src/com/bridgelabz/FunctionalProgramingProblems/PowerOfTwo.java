package com.bridgelabz.FunctionalProgramingProblems;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = input.nextInt();
		input.close();
		if (n < 0 || n >= 31) {
			System.out.println("Error: N must be between 0 and 30.");
			return;
		}
		System.out.println("Powers of 2 that are less than or equal to 2^" + n + ":");
		for (int i = 0; i <= n; i++) {
			System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
		}
	}

}
