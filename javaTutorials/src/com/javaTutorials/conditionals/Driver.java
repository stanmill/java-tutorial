package com.javaTutorials.conditionals;

public class Driver {

	public static void main(String[] args) {
		
		double temp = 91;
		
		if(temp > 70) {
			if(temp > 90) {
				System.out.println("its too hot i'm gonna stay indoors");
			}
			else{System.out.println("Its summer time");}
			
		} else if(temp == 50) {
			System.out.println("Its almost summer");
		}else if( temp == 60) {
			System.out.println(" 60 is nice");
		}
		
		else {
			System.out.println("its not summer yet");
		}
		
		System.out.println("hello");

	}

}
