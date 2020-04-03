package com.javaTutorials.switchCases;

public class Driver {

	public static void main(String[] args) {
		
		
		System.out.println("how cold is it?");	
		int temp = 75;
		char letter = 'T';
		String s = "h";
		
		switch(s) {
		case "h":
			System.out.println("shorts and t-shirt should be fine. Pretty warm");
			break;
		case "m":
			System.out.println("Its pretty chilly outside");
			break;
			default:
				System.out.println("Entered a wrong input");
		}
				
				
		

	}

}
