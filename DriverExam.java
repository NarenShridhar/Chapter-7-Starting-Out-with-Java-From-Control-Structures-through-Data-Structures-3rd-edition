public class DriverExam
{
	/*
		Created an array of String values called answerKey which holds the correct answers
		to the driver's license exam.
	*/

	private String[] answerKey = {"B", "D", "A", "A", "C",
								  "A", "B", "A", "C", "D", 
								  "B", "C", "D", "A", "D",
								  "C", "C", "B", "D", "A"};

	/*
		Created a final int variable called userAnswersLength and defined it as the length of 
		the answerKey array previously created. This makes sense because the array holding the values
		the user enters should be of the same length as the array of the answer key. Instead of just 
		declaring the statement as:

		private final int userAnswersLength = 20;

		I felt the declaration shown below is better, and reinforced the knowledge I have been learning.
	*/
	private final int userAnswersLength = answerKey.length;


	// Array to hold the user's answers. This array is not initialized, and must be done so later. 
    private String[] userAnswers;

    // Integer variable to hold the number of correct user answers
    private int correctAnswers = 0;

    // Integer variable to hold the number of incorrect user answers
    private int incorecctAnswers = 0;

    /*
		Constructor  - default version

		Here I have initialized the previously uninitialized array userAnswers. I have defined it as a String
		array with a length of 20, defined using the variable userAnswersLength, which is explained above. 
    */

    public DriverExam()
    {
    	userAnswers = new String[userAnswersLength];
    	for(int i = 0; i < userAnswersLength; i++)
    	{
    		userAnswers[i] = "";
    	}
    }

    /*
		This is the parametized constructor shown below. This constructor requires as an argument for the user to 
		pass in a string Array. This constructor allows me to transfer the values from the student, to the array
		that was designed for this purpose!
    */

	public DriverExam(String[] userAnswersGiven)
	{
		userAnswers = new String[userAnswersGiven.length];
		for(int i = 0; i < userAnswersGiven.length; i++)
		{
			userAnswers[i] = userAnswersGiven[i];
		}
	}

    /*
		Created a boolean instance method called passed which will return true if the student passed the exam, 
		and false if the student failed the exam. 
    */

    public boolean passed()
    {
    	if(correctAnswers >= 15)
    	{
    		return true;
    	}

    	else
    	{
    		return false;
    	}
    }

    /*
		Created an int instance method called totalCorrect which will return the total number of correctly answered
		questions. 
    */

	public int totalCorrect()
	{
		for(int i = 0; i < userAnswersLength; i++)
		{
			if(userAnswers[i].equalsIgnoreCase(answerKey[i]))
			{
				correctAnswers++;
			}
		}

		return correctAnswers;
	}

	/*
		Created an int instance method called totalIncorrect which will return the total number of incorrectly 
		answered questions.
	*/

	public int totalIncorrect()
	{
		for(int i = 0; i < userAnswersLength; i++)
		{
			if(!userAnswers[i].equalsIgnoreCase(answerKey[i]))
			{
				incorecctAnswers++;
			}
		}

		return incorecctAnswers;
	}

	/*
		Created an int array instance method that will print out each incorrect question that the user entered.
	*/

	public int[] questionsMissed()
	{
		int missedCount = totalIncorrect();
		int[] missed = new int[missedCount];
		for(int i = 0, j = 0; i < userAnswersLength; i++)
		{
			if(!userAnswers[i].equalsIgnoreCase(answerKey[i]))
			{
				missed[j] = (i + 1);
			}
		}

		return missed;
	}
}