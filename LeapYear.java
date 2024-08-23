/*
/*2. A year is a leap year if it is divisible by 4. However, if a year is divisible by 100,
It must be divisible by 400 for it to be a leap year. Hence, 2000 is a leap year,
but 1900 is not. Make a program that will input a vale for year (int) ant output whether it is a "Leap Year" or "Not a Leap Year". Use if statement

/**@ LeapYear.java
/* @Author: Espedillon Melchor
/* @Date Started: Mach 10, 2023
/*@Date Finished: March 13, 2023 /*@ver 1.0

*/
//the class
public class LeapYear{
	//main class
	public static void main(String []args){
		//prompts the user to enter a year
		System.out.print("Enter a year: ");
		//store the year into the variable
		Integer year = Mel.readInt();

		//using a control structure if the year inputed satisfy the codition declare a  it will print the year is a leap year
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		  System.out.println("It is a leap year");
		  //using a control structure if the year inputed doesn't satisfy the codition declare a  it will print the year is not a leap year
		else
		   System.out.println("It is not a leap year");
	}
	}