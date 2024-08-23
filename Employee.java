/*1. Create a program of an hourly employee that will require the user to input Employee number, Name, Hours work
and Rate per hour and would compute the amount of tax that the employee would have to pay based on the following
tax rate table: Use any control structures.

Taxable income
Less than or equal 50,000
over 50,000 but not over 100,000 over 100,000 but not over 200,000
over 200,000
Tax Due
10% of income
5,000 + 15% of excess over 50,000 15,000+ 20% of excess over 100,000 25% of income
Compute the Salary, Withholding Tax, Gross Salary, and display.

@Author: Espedillon Melchor A.
@Date Started: Mach 10, 2023 @Date Finished: March 10, 2023
@Employee.java
*/

//this is our class
public class Employee{
	//the main class
	public static void main(String []args){
		//prompts the user to input
		System.out.println("Enter Employee number: ");
		//stores the data into the variable declared
		Integer emploNum = Mel.readInt();
		//prompts the user to input
		System.out.println("Enter Employee name: ");
		//stores the data into the variable declared
		String name = Mel.readString();
		//prompts the user to input n
		System.out.println("Enter hours of work: ");
		//stores the data into the variable declared
		Double hWork = Mel.readDouble();
		//prompts the user to input
		System.out.println("Enter rate per hour: ");
		//stores the data into the variable declared
		Double rPerHour = Mel.readDouble();

		//formulas in calculating the salary
		double salary = hWork * rPerHour;
		double income = 0;
		double income1 = 0;

		//if the salary of the user is less than 50,000 this control structore will be executed
		if(salary <= 50000)
		{
			//first we will get the amount of tax we are going to deduct to user salary
		  income = (salary * 0.10);
		  //this will show the salary after the tax deduction
		  income1 = salary - income;
	  }
	  //if the salary of the user is greater than 50,000 but less than or equal to 100,000 this control structore will be executed
		else if(salary > 50000 && salary<=100000)
		{
			//first we will get the amount of tax we are going to deduct to user salary
		   income = (((salary - 50000) * 0.15) + 5000);
		    //this will show the salary after the tax deduction
		   income1 = salary - income;
	   }
	   //if the salary of the user is greater than 100,000 but less than or equal to 200,000 this control structore will be executed
		else if(salary>100000 && salary<=200000)
		{
			//first we will get the amount of tax we are going to deduct to user salary
		  income = (((salary - 100000) * 0.20) + 15000);
		   //this will show the salary after the tax deduction
		  income1 = salary - income;
	    }
	    //if the salary of the user is greater than 2000,000 this control structore will be executed
		else if(salary>200000)
		{
			//first we will get the amount of tax we are going to deduct to user salary
		    income = (salary * 0.25);
		     //this will show the salary after the tax deduction
		    income1 = salary - income;
	    }

	    //display the output on the screen for the user to see his salary before and after deduction
	     System.out.println("\n\nYour Name is = " + name);
	     System.out.println("Your Employee number is = " + emploNum);
		 System.out.println("Your Gross Salary is = " + salary);
		 System.out.println("Your With Holding Tax is = " + income);
		 System.out.println("Your Salary After Deduction is = " + income1);

	}
	}