/*Problem 1: Create a program that will accept a number. Read and
determine the number "Positive Even number", "Positive Odd
number", "Negative Even number", "Negative Odd number" using if-
else without using the logical operator (&& and ||) and you may or
may not use a ternary operator.
@DetermineANumber.java
Author: Your name here!
Date started: March 7, 2023
Date Submitted: March 8, 2023
*/
public class DetermineANumber{
	public static void main(String args[]){
		System.out.print("Enter an integer: ");
				int number = Mel.readInt();
					   if (number>=0)
					   {
						   String result = number%2==0 ? "Even" : "Odd";
						   System.out.print("The Number "+number+" is a Positive "+result+ " number");
					   }
					   if (number<0)
					   {
						   String result = number%2==0 ? "Even" : "Odd";
				   System.out.print("The Number "+number+" is a Negative "+result+ " number");
	                  }
}
}

