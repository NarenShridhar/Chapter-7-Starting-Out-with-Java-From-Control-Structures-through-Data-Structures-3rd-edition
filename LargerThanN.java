import java.util.Scanner;

public class LargerThanN
{
	/*
		Created an integer array with 10 numbers to serve as the array that when the user enters
		a number, the number they enter will be compared to the numbers in this array.
	*/

	private int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	/*
		Created a void instance method that will determine if how many numbers in the array are larger
		than the number the user enters. 
	*/ 

	public LargerThanN()
	{
		
	}

	public void largerThanN(int[] arrayGiven, int n)
	{
		// Created a scanner object called keyboard to take in the user's values.
		Scanner keyboard = new Scanner(System.in);

		// Created an integer variable to hold the user's input number.
		int userNumberEntered;

		// Asking the user to enter a number from 1-10
		System.out.println("User, please enter a number from 1-10");
		userNumberEntered = keyboard.nextInt();

		// Input validation that the user enters such a number
		while(userNumberEntered < 1 || userNumberEntered > 10)
		{
			System.out.println("Invalid entry. You entered a number that was lower than 1 or greater than 10.");
			System.out.println("User, please enter a number from 1-10");
			userNumberEntered = keyboard.nextInt();
		}

		System.out.println("The numbers in the array greater than " + userNumberEntered + " are: ");

		// For loop printing the numbers in the array that are greater than the number the user entered. 
		for(int index = 0; index < array1.length; index++)
		{
			if(array1[index] > userNumberEntered)
			{
				System.out.println(array1[index]);
			}
		}
	}
}