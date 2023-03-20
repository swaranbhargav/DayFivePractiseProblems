package com.bridgelabz.FunctionalProgramingProblems;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter the value of a: ");
	        int  a = input.nextInt();

	        System.out.print("Enter the value of b: ");
	        int b = input.nextInt();

	        System.out.print("Enter the value of c: ");
	        int c = input.nextInt();

	        int delta = b * b - 4 * a * c;

	        if (delta < 0) {
	            System.out.println("The equation has no real roots.");
	        } else if (delta == 0) {
	            int root = -b / (2 * a);
	            System.out.println("The equation has one root: " + root);
	        } else {
	            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	            System.out.println("The equation has  roots: " + root1 );
	            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("The equation has  roots: " + root2 );
	        }
	}

}
