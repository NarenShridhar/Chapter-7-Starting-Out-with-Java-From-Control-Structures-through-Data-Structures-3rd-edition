public class GradeBook
{
	// Created a final integer variable called totalStudentNames equal to the five students in this problem

	private final int totalStudentNames = 5;

	// Created a final integer variable called totalStudentTests equal to the four tests the students take in this problem

	private final int totalStudentTests = 4;

	// Created a String array called studentNames to hold the five students' names
	private String[] studentNames = new String[totalStudentNames]; 

	// Created a char array called studentLetterGrades to hold the five students' letter grades
	private char[] studentLetterGrades = new char[totalStudentNames];

	// Created a double array for the first student's score
	private double[] student1Scores = new double[totalStudentTests];

	// Created a double array for the second student's score
	private double[] student2Scores = new double[totalStudentTests];

	// Created a double array for the third student's score
	private double[] student3Scores = new double[totalStudentTests];

	// Created a double array for the fourth student's score
	private double[] student4Scores = new double[totalStudentTests];

	// Created a double array for the fifth student's score
	private double[] student5Scores = new double[totalStudentTests];

	// Created a String variable called studentName to hold the user's input for each student's name
	private String studentName;

	/*
		Constructor 

		In this constructor I set the array sizes of the arrays declared in this class. No argument for the constructor.
	*/

	public GradeBook()
	{

	}

	// This Constructor holds the arguments
	public GradeBook(String[] studentNamesGiven, double[] student1ScoresGiven, double[] student2ScoresGiven, double[] student3ScoresGiven,
		double[] student4ScoresGiven, double[] student5ScoresGiven)
	{
		studentNames = studentNamesGiven;
		student1Scores = student1ScoresGiven;
		student2Scores = student2ScoresGiven;
		student3Scores = student3ScoresGiven;
		student4Scores = student4ScoresGiven;
		student5Scores = student5ScoresGiven;
	}

	/*
		Created a String method called setStudentName which will be used to set the student name based on the user's input.
		Notice how the method requires a String argument, in this case called studentNameGiven. This means the method
		must accept an argument in order to work. 
	*/

	public void setStudentName(String studentNameGiven)
	{
		
		studentName = studentNameGiven;
	}

	// Corresponding getter method to retrieve the students name for use later on
	public String getStudentName()
	{
		// Return the studentName for use later on
		return studentName;
	}

	/*
		Created a double method called getTotalScores which is used to calculate the total of the scores within 
		an array. This will be useful because it can be used in combination with the getAverageTestScore method
		in order to return the average of the array. 
	*/

	public double getTotalScores(double[] studentScoresGiven)
	{
		// Accumulator
		double total = 0.0;

		// For loop accumulates the sum of the elements in the studentScoresGiven array
		for(int index = 0; index < studentScoresGiven.length; index++)
		{
			// The total variable is now equal to the value at each iteration of the index, plus the other values before it
			total += studentScoresGiven[index];
		}

		// Return this total value for use in calculating the average of the array
		return total;
	}

	/*
		Created a double method called getAverageTestScore which will be used to return the average testscore of each student.
		Notice how this method accepts a double array. That is because the student's scores will be stored into arrays, and these
		arrays will be passed into the getAverageTestScore method in order to return their average, which will be a singular double value. 
	*/

	public double getAverageTestScore(double[] studentScoresGiven)
	{
		return getTotalScores(studentScoresGiven)/studentScoresGiven.length;
	}

	/*
		Created a char method called getLetterGrade which returns a lettergrade based on the average value
		of the students' tests as given in the studentScoresGiven array. 
	*/

	public char getLetterGrade(double[] studentScoresGiven)
	{
		if(getAverageTestScore(studentScoresGiven) >= 90.0 && getAverageTestScore(studentScoresGiven) <= 100.0)
		{
			return 'A';
		}

		else if(getAverageTestScore(studentScoresGiven) >= 80.0 && getAverageTestScore(studentScoresGiven) <= 89.0)
		{
			return 'B';
		}

		else if(getAverageTestScore(studentScoresGiven) >= 70.0 && getAverageTestScore(studentScoresGiven) <= 79.0)
		{
			return 'C';
		}

		else if(getAverageTestScore(studentScoresGiven) >= 60.0 && getAverageTestScore(studentScoresGiven) <= 69.0)
		{
			return 'D';
		}

		else if(getAverageTestScore(studentScoresGiven) >= 0.0 && getAverageTestScore(studentScoresGiven) <= 59.0)
		{
			return 'F';
		}

		return 'Z';
	}
}