package com.bridgelabz.FunctionalProgramingProblems;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner alphabit = new Scanner(System.in);
		System.out.println("Enter the Alphabit :");
		 char value = alphabit.next().charAt(0);
         if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
        	 System.out.println("The given Alphabit is vowel");
        	 
         }else {
        	 System.out.println("The given Alphabit is consonant");
         }
		    
	}

}
