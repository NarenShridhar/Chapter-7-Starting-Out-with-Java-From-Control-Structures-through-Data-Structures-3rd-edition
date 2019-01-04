import java.util.Random;

public class Lottery
{
	/**
		Created an integer array named lotteryNumbers and set its size to 5.
	*/

	private static int[] lotteryNumbers = new int[5];

	/**
		Constructor - The constructor uses the Random class to generate a random
		number in the range of 0 - 9 for each element in the array created above. 
	*/

	public Lottery()
	{
		/**
			Created an object of the Random class called rand. 
		*/

		Random rand = new Random();

		/**
			For loop assigns random numbers in the range of 0-9 to each element
			in the array. 
		*/

		for(int i = 0; i < lotteryNumbers.length; i++)
		{
			lotteryNumbers[i] = rand.nextInt(10);
		}
	}

	/**
		Created an int method called similarNumbers which accepts an array
		of five integers that represent a person's lottery picks. The method 
		then compares the corresponding elements of the two arrays and returns
		the number of digits that match. 
	*/

	public int similarNumbers(int[] userLotteryArrayGiven)
	{
		/**
			Created an integer variable similarNumberAmount to hold the number
			of similar numbers between the two arrays that will be returned
			at the end of this method. Initialize this variable to 0 
			because before running this method, there are no similar numbers
			between the 2 arrays. 
		*/

		int similarNumbers = 0;

		/**
			Created a Lottery class object called randomLottery. Because of the 
			nature of the constructor, this object has already been assigned 
			with 5 random values for each of its elements. 
		*/

		// Lottery randomLottery = new Lottery();

		/**
			For loop increments the index of the userLotteryArrayGiven.
		*/

		for(int i = 0; i < userLotteryArrayGiven.length; i++)
		{

			/**
				For loop increments the index of the lotteryNumbers array.
			*/

			//for(int j = 0; j < lotteryNumbers.length; j++)
			//{

				/**
					If the value of the userLotteryArrayGiven at this index, is the same as
					the value of the lotteryNumber array at this index...
				*/

				if(userLotteryArrayGiven[i] == lotteryNumbers[i])
				{
					similarNumbers++;
				}

					/**
						Then increment similarNumbers by 1. 
					*/	
			//}
			
		}

		/**
			Return how many similarNumbers there are. 
		*/

		return similarNumbers;
	}

	public static void getLotteryNumbers()
	{
		for(int i = 0; i < lotteryNumbers.length; i++)
		{
			System.out.println(lotteryNumbers[i]);
		}
	}
}