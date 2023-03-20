package com.bridgelabz.FunctionalProgramingProblems;
import java.util.Scanner;
import java.util.Random;

public class FlipaCoin {
	public static void main(String[] args) {
        Scanner times = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int n = times.nextInt();

        int heads = 0, tails = 0;
        Random number = new Random();

        for (int i = 1; i <= n; i++) {
            if (number.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headPercentage = (heads * 100.0) / n;
        double tailPercentage = (tails * 100.0) / n;
        System.out.println("Heads: " + heads + " (" + headPercentage + "%)");
        System.out.println("Tails: " + tails + " (" + tailPercentage + "%)");
    

}


	

		    
		

}


