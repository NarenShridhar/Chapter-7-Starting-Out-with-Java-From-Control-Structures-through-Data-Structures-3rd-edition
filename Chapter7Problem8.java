import java.util.Scanner;

public class Chapter7Problem8
{
	public static void main (String[] args)
	{
		// Created a GradeBook class object called studentGrades
		GradeBook studentGrades = new GradeBook();

		// Created an array to hold all the students names
		String[] allStudentNames = new String[5];

		

		processStudentNames(allStudentNames);


	}

	public static void processStudentNames(String[] allStudentNamesGiven)
	{
		// Created a scanner object called keyboard to take in the user's values
		Scanner keyboard = new Scanner(System.in);

		// Created a String variable to hold the users' input for student names
		String studentName;

		// Created a String array to hold the values input by this method
		String[] studentNames = new String[allStudentNamesGiven.length];

		// For loop which asks the user to enter a student name for each student, and stores it in an arry
		for(int index = 0; index < allStudentNamesGiven.length; index++)
		{
			System.out.println("User, please enter a student name for student " + (index + 1));
			allStudentNamesGiven[index] = keyboard.nextLine();
		}
	}

	public static void processStudentGrades()
}