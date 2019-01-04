public class Payroll
{
	/*
		Created an integer array called employeeId that holds seven employee identification numbers
		for seven employees. Note, this array is already initialized with values. 
	*/

	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

	/*
		Created a final integer variable called numberOfEmployees which reflects the seven employees
		(in this case using the previously initialized array) using the length method. 
	*/
	private final int numberOfEmployees = employeeId.length;

	/*
		Created an integer array called hours to hold the hours that will hold the number of hours worked 
		by each of the seven employees. Note, this array IS NOT initialized, meaning it will need
		to have values assigned to it at a later stage. 
	*/

	private int[] hours;

	/*
		Created a double array called payRate to hold the pay rate of each of the seven employees. Note, this array
		IS NOT initialized, meaning it will need to have values assigned to it at a later stage. 
	*/

	private double[] payRate;

	/*
		Created a double array called wages to hold the gross wages of each of the seven employees. Note, 
		this array is NOT initialized, meaning it will need to have values assigned to it at a later stage.
	*/

	private double[] wages;

	/*
		Constructor - used here to set the size of the arrays that were not initialized.

		In this constructor, I have initialzied the 3 previously uninitialized arrays, giving them a defined
		number of elements. In this case, equal to the value of the final int variable numberOfEmployees, 7.
	*/

	public Payroll()
	{
		hours = new int[numberOfEmployees];
		payRate = new double[numberOfEmployees];
		wages = new double[numberOfEmployees];
	}

	/*
		Created a void instance method called calculateWages to calculate the total gross wages for each of the seven employees

		Instance method means that this method directly affects the field of an object created in this class. Instance methods 
		do not have the keyword static.
	*/

	public void calculateWages()
	{
		/*
			Created a for loop that will track the index as it increments from 0 - 6 (employees 1-7), so that I 
			can calculate the gross wages for each of those employees, base on their corresponding pay rate
			and hourly wages.
		*/

		for(int employeeIndex = 0; employeeIndex < numberOfEmployees; employeeIndex++ )
		{
			/*
				The wages will be calculated by multiplying the hours of the employee at that index, by 
				the pay rate of the employee at that index.
			*/

			wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
		}
	}

	/*
		Created a double instance method called getEmployeeWagesById which accepts as an argument, the employee's
		ID number. 
		@return the employee wages based on the id number that was provided into the argument.
	*/

	public double getEmployeeWagesById(int employeeIdGiven)
	{
		/*
			Created a for loop that will track the index as it increments from 0 - 6 (employees 1-7), so that I 
			can calculate the gross wages for each of those employees, base on their corresponding pay rate
			and hourly wages.
		*/

		for(int employeeIndex = 0; employeeIndex < numberOfEmployees; employeeIndex++ )
		{
			/*
				While the for loop is incrementing, I created an if block that states, if the current employee ID
				at each element of the employee index has the same value (note the double == sign) as the 
				employee ID that was given, then return the wages based on that emplyee Index. 
			*/
			if(employeeId[employeeIndex] == employeeIdGiven)
			{
				return wages[employeeIndex];
			}
		}

		/*
			If none of the values in the employeeId array match the value that was input by the user into 
			employeeIdGiven, I have selected -1 to be the return value because -1 is not in bounds of what 
			an index holds. Index starts from 0 - end element, thus returning a value like -1 makes sense
			to show that the value the user entered does not exist in the already initialzied employeeId array.
		*/
		return -1;
	}

	/*
		Created an int array instance method called getAllEmployeeIds which is the getter method for 
		returning the integer values of all the employee Id numbers.
	*/

	public int[] getAllEmployeeIds()
	{
		return employeeId;
	}

	/* 
		Created a void instance method called setEmployeeHours which is the setter method for 
		setting the employee hours for each employee. This method takes in two arguments, first the int value
		of the employee's hours, and secondly, the index to store the hours in.
	*/

	public void setEmployeeHours(int employeeHoursGiven, int employeeIndexGiven)
	{
		// In this particular index given of the hours array, I am storing the employee hours that was given by the user.
		hours[employeeIndexGiven] = employeeHoursGiven;
	}

	/*
		Created an int array instance method called getAllEmployeeHours which is the getter method for returning the
		integer values of hours that the employees worked for.
	*/

	public int[] getAllEmployeeHours()
	{
		return hours;
	}

	/*
		Created a void instance method call setEmployeePayRate which is the setter method for settting the employee
		pay rates for each employee. This method takes in 
	*/

	public void setEmployeePayRate(double employeePayRateGiven, int employeeIndexGiven)
	{
		// In this particular index given of the payRate array, I am storing the pay rate that was given by the user.
		payRate[employeeIndexGiven] = employeePayRateGiven;
	}

	/*
		Created a double array instance method called getAllEmployeePayRates which is the getter method for returning the
		double values of the pay rates of the employees. 
	*/

	public double[] getAllEmployeePayRates()
	{
		return payRate;
	}

	/*
		Created a double array instance method called getAllEmployeeWages which is the getter method for returning the 
		double values of the wages of the employees. 
	*/

	public double[] getAllEmployeeWages()
	{
		return wages;
	}
}