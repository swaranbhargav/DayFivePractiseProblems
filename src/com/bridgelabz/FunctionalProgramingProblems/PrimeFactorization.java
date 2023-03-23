package com.bridgelabz.FunctionalProgramingProblems;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to find its prime factors: ");
		int n = input.nextInt();
		input.close();
		System.out.print("Prime factors of " + n + ": ");
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}

	}

}
