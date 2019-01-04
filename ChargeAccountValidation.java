import java.io.*;
import java.util.Scanner;

public class ChargeAccountValidation
{
	/*
		Created an array that holds the charge account numbers
	*/

	private int[] accountValidation = {};

	public ChargeAccountValidation() throws IOException
	{
		accountValidation = new int[20];
		String inputFile = ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterSevenProgrammingChallenges/ChargeAccountNumbers.txt");

		File file = new File(inputFile);

		Scanner input = new Scanner(file);

		int index = 0;

		while(input.hasNext())
		{
			accountValidation[index] = input.nextInt();
			index++;
		}
		input.close();
	}

	/*
		Created a boolean instance method that takes in as an argument an integer representing
		a potential employee charge account number. It will return true if the number exists in the
		previously created accountValidation array, and return false if the number does not
		exist in the object. 
	*/

	public boolean testChargeAccountNumber(int employeeNumberGiven)
	{
		// Loop control variable
		int index = 0;

		// Flag indicating search results
		boolean found = false;

		// Search the array list object using sequential search
		while(!found && index < accountValidation.length)
		{
			if(accountValidation[index] == employeeNumberGiven)
			{
				found = true;
			}

			else
			{
				index++;
			}
		}

		/*
			Sometimes a problem will ask the program to return an element using sequential search. In 
			this case, the problem is asking the program to return just true or false depending on 
			whether or not the number appears in the array list object. For that reason the method I have
			created is boolen, and returns true or false based on the user number entered. 
		*/
		return found;
	}
}