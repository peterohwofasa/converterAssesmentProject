package poundsTokilograms;

import java.util.Scanner;

//A java based console  program to convert pounds  
//to Kilograms 
public class PoundsTokilograms {

	public static void main(String[] Strings) {

		// calling the scanner object
		Scanner input = new Scanner(System.in);

		// prompting user input
		System.out.print("Enter a number in pounds: ");

		// variable to hold scanner input
		float pounds = input.nextFloat();
		float kilograms = poundsToKilos(pounds);

		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}

	// function to convert from pounds to Kilograms
	private static float poundsToKilos(float pounds) {
		float kilograms = (float) (pounds * 0.454);
		return kilograms;
	}

}
