import java.util.Scanner;

public class Chapter7Problem7
{
	public static void main (String[] args)
	{
		// Final integer variable reflecting the 6 divisions the problem mentions
		final int DIVISIONS = 6;

		// Final integer variable reflecting the 4 quarterly sales figures the problem mentions
		final int QUARTERLY_SALES = 4;

		double[] totalQuarterlySales;

		/*
			Created a 2-D double array that uses the final variables declared in prevous statements
			to create an array that will store 24 total values in a 4 x 6 array. 
		*/

		double[][] sales = new double[DIVISIONS][QUARTERLY_SALES];

		// Call the displayIntroduction method created below to display the initial introduction
		displayIntroduction();

		// Call the enterSalesFigures method created below to prompt the user to input sales values
		enterSalesFigures(sales);

		// Call the listSalesFigures method created below
		listSalesFigures(sales);

		totalQuarterlySales = calculateTotalQuarterSales(sales, QUARTERLY_SALES);

		calculateAverageQuarterlySales(totalQuarterlySales, DIVISIONS);

		findHighestSales(sales);
	}

	/*
		Created a static void method called displayIntroduction, which prepares the user, in this case the company owner, 
		on what this program will do. It ends by letting the user know that they will be required to make inputs for the
		values of sales for each divion etc...
	*/

	public static void displayIntroduction()
	{
		System.out.println("This program will calculate the following: ");
		System.out.println("1) A list of the sales figures by division");
		System.out.println("2) Each division's increase or decrease in sales from the previous quarter (1st quarter change not displayed");
		System.out.println("3) The total sales for the quarter");
		System.out.println("4) The company's total increase or decrease from the previous quarter (1st quarter change not displayed");
		System.out.println("5) The average sales for all divisions that quarter");
		System.out.println("6: The division with the highest sales for each quarter");
		System.out.println("Now this program will require inputs from you, the company owner, in order to calculate these totals...");
		System.out.println();
	}

	/*
		Created a static void method called enterSalesFigures which prompts the user to enter the sales figure for each of the 
		quarters and each of the divisions. Note how this method requires the user to pass in a double array, that is where the
		array that I created initially will be passed into, to have values assigned to its fields. 
	*/

	public static void enterSalesFigures(double[][] companyInfo)
	{
		// Created a scanner object called keyboard to take in the user's values.
		Scanner keyboard = new Scanner(System.in);

		// These nested loops are used to fill the array with the quartlery sales figures for each division
		for(int div = 0; div < companyInfo.length; div++)
		{

			for(int qtr = 0; qtr < companyInfo[div].length; qtr++ )
			{
			System.out.println("Please enter the sales for: ");
			System.out.printf("Division %d, Quarter %d $", (div + 1), (qtr + 1));
			companyInfo[div][qtr] = keyboard.nextDouble();
			}
		// Printed an additional line for spacing
		System.out.println();
		}
	}

	/*
		Created a static void method called listSalesFigures which will list the sales figures for each division, 
		along with thte difference in each division from the previous quarter. 
	*/

	public static void listSalesFigures(double[][] companyInfo)
	{
		double difference;

		for(int divisionIndex = 0; divisionIndex < companyInfo.length; divisionIndex++)
		{
			difference = 0;

			//System.out.printf("[Division %d]\t", (divisionIndex + 1));

			for(int quarterIndex = 0; quarterIndex < companyInfo[0].length; quarterIndex++)
			{

				if(quarterIndex >= 1)
				{
					difference = companyInfo[divisionIndex][quarterIndex] - companyInfo[divisionIndex][quarterIndex - 1]; 
				}

			System.out.printf("[Quarter %d]: $%,.2f (%,.2f)\t", quarterIndex + 1,
			companyInfo[divisionIndex][quarterIndex], difference);

			}
			// Printed an additional line for spacing
			System.out.println();
		}
	}

	/*
		Created a static void method called calculateTotalQuarterSales, which takes in a double array and an
		integer number of quarters as arguments. 
	*/

	public static double[] calculateTotalQuarterSales(double[][] companyInfo, int numberOfQuarters)
	{
		
		// Accumulator
		double totalQuarterlySales;

		// Set a new double array with a length equal to the number of quarters you will input as the argument.
		double[] totalQuarterlySalesArray = new double[numberOfQuarters];

		double difference = 0;

		for(int quarterIndex = 0; quarterIndex < companyInfo[0].length; quarterIndex++)
		{
			totalQuarterlySales = 0;

			for(int divisionIndex = 0; divisionIndex < companyInfo.length; divisionIndex++)
			{
				totalQuarterlySales += companyInfo[divisionIndex][quarterIndex];
			}

			// Set the values of the totalQuarterlySalesArray array with the totalQuarterly Sales for that quarter
			totalQuarterlySalesArray[quarterIndex] = totalQuarterlySales;

			if(quarterIndex >= 1)
			{
				difference = totalQuarterlySalesArray[quarterIndex] - totalQuarterlySalesArray[quarterIndex - 1];
			}

			// Display
			System.out.printf("Quarter %d Total: $%,.2f( %.2f )\n", quarterIndex + 1, totalQuarterlySalesArray[quarterIndex], difference);
		}

		return totalQuarterlySalesArray;
		// Printed an additional line for spacing

	}

	public static void calculateAverageQuarterlySales(double[] totalQuarterlySales, int numberOfDivisions)
	{
		System.out.println();
		for(int quarterlySalesIndex = 0; quarterlySalesIndex < totalQuarterlySales.length; quarterlySalesIndex++)
		{
			System.out.printf("Quarter %d Average: $%,.2f\n", quarterlySalesIndex + 1, totalQuarterlySales[quarterlySalesIndex]/numberOfDivisions);
		}
	}

	public static void findHighestSales(double[][] companyInfo)
	{
		double highestSale;
		int highestSaleDivisionIndex;

		System.out.println();

		for(int quarterIndex = 0; quarterIndex < companyInfo[0].length; quarterIndex++)
		{
			highestSale = 0;
			highestSaleDivisionIndex = 0;

			for(int divisionIndex = 0; divisionIndex < companyInfo.length; divisionIndex++)
			{
				if(companyInfo[divisionIndex][quarterIndex] > highestSale)
				{
					highestSale = companyInfo[divisionIndex][quarterIndex];
					highestSaleDivisionIndex = divisionIndex;
				}
			}

			System.out.printf("For Quarter %d, division %d had the highest sales: $%,.2f\n", quarterIndex + 1,
				highestSaleDivisionIndex + 1, highestSale);
		}
	}
}