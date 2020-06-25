package kelvintoCelsius;

import java.util.Scanner;

//Java program to convert temperature  
//from kelvin to degree Celsius 

public class KelvintoCelsius {

	public static void main(String arg[]) {

		// variable to hold scanner input
		float a;

		// calling the scanner object
		Scanner sc = new Scanner(System.in);

		// function to prompt user input
		System.out.print("Enter  Kelvin temperature:");
		a = sc.nextFloat();

		// function to print out already converted celsius temperature
		System.out.println("Celsius temperature is = " + celsius(a));
	}

	// function to convert temperature
	// from Kelvin to degree Celsius
	static float celsius(float kelvin) {

		return kelvin - 273.15F;
	}
}
