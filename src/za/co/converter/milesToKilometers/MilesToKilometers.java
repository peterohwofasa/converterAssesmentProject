package milesToKilometers;

import java.util.Scanner;

// A java based console  program to convert miles
//to kilometers 

public class MilesToKilometers {

	public static void main(String[] Strings) {

		// calling the scanner object
	    Scanner input = new Scanner(System.in);
	  
	 // prompting user input
	    System.out.print("Enter a number in Miles: ");

	 // variable to hold scanner input
	    float miles = input.nextFloat();
	    float kilometers = milesToKilos(miles);

	    System.out.println(miles + " Miles is " + kilometers + " kilometers.");
	}

	// function to convert  from Miles  to Kilometers
	private static float milesToKilos(float miles) {
	    float kilometers = miles * 1.609344f;
	    return kilometers;
	}
	
}
