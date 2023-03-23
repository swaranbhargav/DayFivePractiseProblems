package com.bridgelabz.FunctionalProgramingProblems;

import java.util.Scanner;

public class FlipaCoin {
	public static void main(String[] args) {
		Scanner times = new Scanner(System.in);
		System.out.print("Enter the number of times to flip the coin: ");
		int n = times.nextInt();
		times.close();

		int heads = 0;
		int tails = 0;
		for (int i = 0; i < n; i++) {
			double rand = Math.random();
			if (rand < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		double headsPercentage = (double) heads / n * 100;
		double tailsPercentage = (double) tails / n * 100;
		System.out.println("Percentage of heads: " + headsPercentage);
		System.out.println("Percentage of tails: " + tailsPercentage);

	}

}
