package com.bridgelabz.FunctionalProgramingProblems;
import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the Number :");
		 int Number = number.nextInt();
		 if (Number % 2 == 0) {
			 System.out.println("Its an Even Number");
		 }else {
			 System.out.println("its an odd Number");
		 }
		 

	}

}
