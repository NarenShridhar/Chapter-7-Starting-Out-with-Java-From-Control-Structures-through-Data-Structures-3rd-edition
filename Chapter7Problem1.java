import java.util.Scanner;

/*
	This program gathers rainfall amounts for each month in a year.
	It uses the Rainfall class to display the total, average, 
	highest, and lowest rainfall amounts in the array.
*/

public class Chapter7Problem1
{
	public static void main (String[] args)
	{
		// Number of elements, in this case, 12 months in 1 year.
		final int ONE_YEAR = 12;

		// Created an array to hold the rainfall amounts for 1 year.
		double[] monthlyRainfall = new double[ONE_YEAR];

		// Get the montly rainfall totals using the getRainfallValues method I created below.
		getRainfallValues(monthlyRainfall);

		/*
			Created a Rainfall object initialized with the monthlyRainfall figures
			that were input by the user in the previously called getRainfallValues method.
		*/

		Rainfall rainfallData = new Rainfall(monthlyRainfall);

		// Displayed the total, average, highest, and lowest rainfall amounts within this 12 month span.

		/*
			Here, used the %f has a placeholder for the floating point values that will replace it later. 
			More specifically, what replaces it are the arguments (in this case plural) that come after
			the comma. 

			Additionally, the %d is used as a placeholder for the integer values that will be returned in 
			the highest and lowest months of rainfall sections.

			The .2 in this case means that I want the decimal formatted to 2 decimal places. If for example
			I had entered .3 instead, it would format the decimal to 3 places as opposed to the 2 that 
			I am using in this program. 
		*/
		System.out.printf("Total Rainfall: %.2f\nAverage Rainfall: %.2f " + 
			"\nMonth with the most rain: %d\nMonth with the least rain: %d", 
			rainfallData.getTotalRainfall(),
			rainfallData.getAverageRainfall(),
			rainfallData.getHighestRainfall(),
			rainfallData.getLowestRainfall());

		/*
			This prints an extra line at the end of the method, casuing the program to end 
			in a way that allows the next line of terminal to be freed up. It makes the most sense. 
			I tested the program with and without this println, and found it needed. 
		*/
		System.out.println();
	}

	/*
		The getRainfallValues method asks the user to enter rainfall values 
		for each element in the array (the 12 months of the year). 
		@param rainfallArray is the array to store the values in.
	*/

	public static void getRainfallValues(double[] rainfallArray)
	{
		// Created a scanner object called keyboard to take in the user's values.
		Scanner keyboard = new Scanner(System.in);

		// Get the rainfall for each month of the year
		for(int index = 0; index < rainfallArray.length; index++)
		{
			/* 
				Remember, since the index elements start at 0, the months will need
				to display starting from 1, thus it should be printed as index + 1
				as shown below.
			*/
			System.out.println("Enter the rainfall in month: " + (index + 1));
			rainfallArray[index] = keyboard.nextDouble();

			/*
				Created input validation so that negative values of rainfall will not be
				accepted, and the user will be asked to reenter a value that makes sense.
			*/
			while(rainfallArray[index] < 0)
			{
				System.out.println("Invalid entry, enter a non negative number for monthly rainfall.");
				System.out.println("Enter the rainfall in month: " + (index + 1));
				rainfallArray[index] = keyboard.nextDouble();
			}
		}
	}
}