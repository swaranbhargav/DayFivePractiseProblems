package com.bridgelabz.FunctionalProgramingProblems;
import java.util.Scanner;

public class LargestAmongThreeNUmbers {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int numberone = number.nextInt();
		System.out.println("Enter the second number :");
		int numbertwo = number.nextInt();
		System.out.println("Enter the third number :");
		int numberthree = number.nextInt();
		if (numberone > numbertwo && numberone > numberthree) {
			System.out.println("The first number is the Largest Number .");
			
		}else if (numbertwo > numberone && numbertwo > numberthree) {
			System.out.println("The second number is the Largest Number .");
		}else {
			System.out.println("The third number is the Largest Number .");
		}
		
		
		

	}

}
