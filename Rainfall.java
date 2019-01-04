public class Rainfall
{
	// Array for the monthly rainfall.
	private double[] monthlyRainfall;

	// This constructor copies the elements in an array to the monthlyRainfall array. @param monthlyRainfallGiven is the array to copy.
	public Rainfall(double[] monthlyRainfallGiven)
	{
		// Create a new array as large as monthlyRainfallGiven.
		monthlyRainfall = new double[monthlyRainfallGiven.length];

		// Copy the elements from monthlyRainfallGiven to monthlyRainfall.
		for(int index = 0; index < monthlyRainfallGiven.length; index++)
		{
			monthlyRainfall[index] = monthlyRainfallGiven[index];
		}
	}

	/*
		getTotalRainfall method
		@return the total of the elements in the monthlyRainfall array.
	*/

	public double getTotalRainfall()
	{
		// Accumulator
		double totalRainfall = 0.0;

		// Accumulate the sum of the elements in the monthlyRainfall array.
		for(int index = 0; index < monthlyRainfall.length; index++)
		{
			totalRainfall += monthlyRainfall[index];
		}

		// Return the total.
		return totalRainfall;
	}

	/*
		getAverageRainfall method
		@return the average of the elements in the monthlyRainfall array
	*/

	public double getAverageRainfall()
	{
		return getTotalRainfall()/monthlyRainfall.length;
	}

	/*
		getHighestRainfall method
		@return the month that has the highest of the elements in the monthlyRainfall array
	*/

	public int getHighestRainfall()
	{
		/* 
			Created a highestRainfall variable to compare each sequential monthlyRainfall index value to,
			in order to return the highest element at the end of the method. Start with index element 0 
			because that is the first element of the index, and thus logically makes sense to start with. 
		*/
		double highestRainfall = monthlyRainfall[0];

		/*
			Created an integer variable called mostRainMonth to ultimately store the month with the most rain.
			Important to note that this variable MUST be initialized!
		*/

		int mostRainMonth = 1;

		/*
			If the current index of monthly rainfall is higher than the highest element so far, set it to the highest, 
			and repeat till the entire array is searched in this manner.
		*/
		for(int index = 0; index < monthlyRainfall.length; index++)
		{
			if(monthlyRainfall[index] > highestRainfall)
			{
				highestRainfall = monthlyRainfall[index];

				/*
					Once the highestRainfall element is identified, it is important to remember that the months start at 1
					while the index starts at 0. Thus, the mostRainMonth should be index + 1, not solely index.
				*/
				mostRainMonth = index + 1;
			}
		}

		// Return the highest element
		return mostRainMonth;
	}

	/*
		getLowestRainfall method
		@return the month that has lowest of the elements in the monthlyRainfall array
	*/

	public int getLowestRainfall()
	{
		/*
		Created a lowestRainfall variable to compare each sequential monthlyRainfall index value to,
		in order to return the lowest element at the end of the method. 
		*/
		double lowestRainfall = monthlyRainfall[0];

		/*
			Created an integer variable called least RainMonth to ultimately store the month with the least rain.
			Important to note that this variable MUST be initialized!
		*/

		int leastRainMonth = 1;

		/*
		If the current index of monthly rainfall is lower than the lowest element so far, set it to the lowest, 
		and repeat till the entire array is searched in this manner.
		*/

		for(int index = 0; index < monthlyRainfall.length; index++)
		{
			if(monthlyRainfall[index] < lowestRainfall)
			{
				lowestRainfall = monthlyRainfall[index];

				/*
					Once the lowestRainfall element is identified, it is important to remember that the months start at 1
					while the index starts at 0. Thus, the leastRainMonth should be index + 1, not solely index.
				*/
				leastRainMonth = index + 1;
			}
		}

		// Return the lowest element
		return leastRainMonth;
	}
}