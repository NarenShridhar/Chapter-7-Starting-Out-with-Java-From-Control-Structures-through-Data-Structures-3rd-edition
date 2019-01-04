import java.util.Scanner;

public class Chapter7Problem6
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] userAnswers = new String[20];

		String answer;

		for(int i = 0; i < userAnswers.length; i++)
		{
			System.out.println("For question " + (i + 1) + " Please enter 20 answers of either A, B, C or D");
			answer = keyboard.nextLine();

			while(!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D"))
			{
				System.out.println("Invalid entry");
				System.out.println("For question " + (i + 1) + " Please enter 20 answers of either A, B, C or D");
				answer = keyboard.nextLine();
			}

			userAnswers[i] = answer;
		}
		
		DriverExam driverExam = new DriverExam(userAnswers);

		display(driverExam);
	}

	public static void display(DriverExam driverExamObject)
	{
		System.out.println("The total amount of correct answers you had was: " + driverExamObject.totalCorrect());
		System.out.println("The total amount of incorrect answers you had was: " + driverExamObject.totalIncorrect());
		System.out.println("The questions you missed were: " + driverExamObject.questionsMissed());
		System.out.println("Ultimately, with your results...");
		if(driverExamObject.passed() == true)
		{
			System.out.println("You passed! Great Job! Drive safe out there!");
		}
		else
		{
			System.out.println("You failed unfortunately. Keep studying and it will pay off!");
		}
	}
}