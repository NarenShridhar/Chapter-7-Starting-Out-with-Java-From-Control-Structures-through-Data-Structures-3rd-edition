import java.util.Scanner;

public class Chapter7Problem10
{
	public static void main (String[] args)
	{
		int[] userArray = new int[5];

		Scanner keyboard = new Scanner(System.in);

		for(int i = 0; i < userArray.length; i++)
		{
			System.out.println("User, please enter a lottery number for slot " + (i + 1));
			userArray[i] = keyboard.nextInt();
		}

		Lottery lotteryObject = new Lottery();

		Lottery.getLotteryNumbers();

		System.out.println("You matched " + lotteryObject.similarNumbers(userArray) + " numbers on your ticket");

		
	}
}