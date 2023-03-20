package com.bridgelabz.FunctionalProgramingProblems;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int numberone = 100;
		int numbertwo = 200;
		int newnumber = numberone + numbertwo ;
		numberone = newnumber - numberone;
		numbertwo = newnumber - numbertwo;
		System.out.println("After swaping the numberone is :" + numberone);
		System.out.println("After swaping the numbertwo is :" + numbertwo);
				


	}

}
