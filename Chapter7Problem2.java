import java.util.Scanner;

public class Chapter7Problem2
{
	public static void main (String[] args)
	{
		/*
			Created a Payroll object that has no arguments, since the constructor in the Payroll class
			does not have any arguments.
		*/

		Payroll employeeInfo = new Payroll();

		/*
			Now that the object is created, call the assignEmployeeHoursAndPayRates method designed below
			for the purpose of assigning the hours worked and pay rates for all the employees to the 
			employeeInfo object.
		*/
		assignEmployeeHoursAndPayRates(employeeInfo);

		/*
			Next, calculate the total wages for each employee using the calculateWages method in the Payroll
			class.
		*/

		employeeInfo.calculateWages();

		/*
			Lastly, using the displayEmployeeWages method, pass the employeeInfo object in as the argument, 
			and watch the success occur! :)
		*/

		displayEmployeeWages(employeeInfo);
	}

	/*
		Created a static void method called assignEmployeeHoursAndPayRates which will be used in the main method 
		to assign the user inputs for employee hours worked and employee pay rates, into their correct places in the
		hours and payRate arrays.

		Within thie method I have passed in as an argument a payroll object
	*/

	public static void assignEmployeeHoursAndPayRates(Payroll payrollObject)
	{
		// Created a scanner object called keyboard to take in the user's values.
		Scanner keyboard = new Scanner(System.in);

		// Created an employeeHours variable to hold the user input of each employee's hours.
		int employeeHours;

		// Created an employeePayRate variable to hold the user input of each employee's pay rate.
		double employeePayRate;

		/*
			Created a for loop that will track the index as it increments from 0 - 6 (employees 1-7) so that I can
			assign both the employee hours worked and pay rate to the hours and payRate arrays respectively.

			Notice how I used payrollObject.getAllEmployeedIds().length instead of just saying 7. This is a great way of 
			using the knowledge base I'm building to create a better define code rather than just using an integer value.
		*/

		for(int employeeIndex = 0; employeeIndex < payrollObject.getAllEmployeeIds().length; employeeIndex++)
		{
			/*
				In order to get the ID number of each employee, use the created object, along with the getAllEmployeeIds
				method created in the Payroll class which will return the stored Id number within the employee ID array.

				Note also that I use the employee Index which is looping, to reference which employee ID number will display
				first, second, third, etc... 
			*/

			System.out.println("Please enter the hours for employee " + payrollObject.getAllEmployeeIds()[employeeIndex]);

			// Store the user input into the employeeHours variable that was designed for this purpose.
			employeeHours = keyboard.nextInt();


			/*
				Input validation that prevents the user from entering an hours worked below 0.00. If they do, the error message
				will display and they will be prompted to re-enter a different, valid, hours worked. 
			*/
			while(employeeHours < 0)
			{
				System.out.println("Invalid entry. Please enter an hours worked greater than 0.0");
				System.out.println("Please enter the hours for employee " + payrollObject.getAllEmployeeIds()[employeeIndex]);
				employeeHours = keyboard.nextInt();
			}

			/*
				Now, via the setEmployeeHours method and payRollObject, I pass as arguments the employeeHours entered by the user
				as well as the current employeeIndex value. 
			*/
			payrollObject.setEmployeeHours(employeeHours, employeeIndex);

			// Repeating procedure to set the values of the pay rates.
			System.out.println("Please enter the pay rate for employee " + payrollObject.getAllEmployeeIds()[employeeIndex]);

			// Store the user input into the employeePayRate variable that was designed for this purpose.
			employeePayRate = keyboard.nextDouble();

			/*
				Input validation that prevents the user from entering a pay rate below $6.00. If they do, the error message
				will display and they will be prompted to re-enter a different, valid, pay rate. 
			*/

			while(employeePayRate < 6.0)
			{
				System.out.println("Invalid entry. Please enter a pay rate greater than $6.00");
				System.out.println("Please enter the pay rate for employee " + payrollObject.getAllEmployeeIds()[employeeIndex]);
				employeePayRate = keyboard.nextDouble();
			}

			/*
				Now, via the setEmployeePayRate method and payRollObject, I pass as arguments the employeePayRate entered by the user
				as well as the current employeeIndex value. 
			*/
			payrollObject.setEmployeePayRate(employeePayRate, employeeIndex);
		}
	}

	/*
		Created a static void method called displayEmployeeWages that will be used to print out the final display for the program.
	*/

	public static void displayEmployeeWages(Payroll payrollObject)
	{
		/*
			Something I have struggled with in the past is the most efficient way to display the data in loops. This how...
			I have created the same for loop I have used before to iterate each index element. As the loop iterates, the println's
			are displayed along with them. This results in only one println statement having to be written as opposed to what I 
			was doing which is creating many println statements instead of a simple for loop! Learn from this!
		*/

		for(int employeeIndex = 0; employeeIndex < payrollObject.getAllEmployeeIds().length; employeeIndex++)
		{
			System.out.println("The employee with ID number: " + payrollObject.getAllEmployeeIds()[employeeIndex] + 
				" worked for " + payrollObject.getAllEmployeeHours()[employeeIndex] + 
				" with a payrate of $" + payrollObject.getAllEmployeePayRates()[employeeIndex] +
				" for a total gross pay of $" + payrollObject.getAllEmployeeWages()[employeeIndex]);
		}
	}
}