import java.util.Scanner;
import java.io.*;

public class Chapter7Problem3
{
	public static void main (String[] args) throws IOException
	{
		// Created a scanner object called keyboard to take in the user's values.
		Scanner keyboard = new Scanner(System.in);

		// Created a int variable called userNumberEntered to hold the user's input.
		int userNumberEntered;

		// Created a char variable called repeat to run the program until the user wishes to stop.
		char repeat = 'y';

		do
		{
			ChargeAccountValidation numberValidation = new ChargeAccountValidation();

			System.out.println("Enter a number to see if there is an existing charge account with that number: ");
			userNumberEntered = keyboard.nextInt();

			if(numberValidation.testChargeAccountNumber(userNumberEntered))
			{
				System.out.println("That is a valid number that exists as a charge account.");
			}

			else
			{
				System.out.println("Invalid number, does not exist as a charge account.");
			}

			System.out.println("Do you want to enter another number? Type y if so, or anything else to quit.");
			keyboard.nextLine();
			repeat = keyboard.nextLine().charAt(0);
		} while(repeat == 'y');
	}
}