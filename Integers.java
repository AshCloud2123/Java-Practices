/* Make a program that would input number integers and
output:
a. Their total
b. Average
c. The largest
d. The smallest
e. The total of all positive numbers
f. The total of all negative numbers
g. How many negative numbers were entered
Note: Don't use arrays on this problem.
Sample:
How many integers: 5
Enter number 1:
Enter number 2:
Enter number 3:
Enter number 4:
Enter number 5:
/**@ Integers.java
/* @Author: Your name here
/* @Date: March 20, 2023
/*@ver 1.0
*/
//class
public class Integers{
	//main method
	public static void main(String args[]){
		//variables declared
		int total=0;
		float average=0;
		int nega=0;
		int posit=0;
		int largest=0;
		int j=0;
		//prompts the user to enter number of integer he/she wants
		System.out.print("Enter number of Integers: ");
		//store the input into a variable
        int parameter = Mel.readInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //repetitive structure that will execurte over and over again until we get the number of integers the user inputed
				for(int i=0;i<parameter;i++)
				{
					//promts the user to enter the integers
					System.out.println("Enter Number " + (i+1));
					//store the inputs
					int number = Mel.readInt();
					//every time the user input another integer the value will be added
			        total +=number;
			        //computes the average
			        average= (total)/(parameter);
			        //a conditional statement that will control the flow of the program
			        if(number<0){//if the user enter a number that is below zero then it is a negative number
						nega+=number;//it will be added together
					}
					//if the integer is not less than zero
					else{
					   posit+=number;//it wii be added together and determine as positive integers
				   }
				   //a conditional statement that will control the flow of the program
				   //determine the number if it is the higest  integer
                   if(min >= number){
                    min = number;
                     } //determine the lowest integer
                  if(max <= number){
                      max = number;
                     }
                   if(number<0){//if the user enter a negative number it will be counted
					   j+=1;
			      	 }
		         }
		         //shows the output of the program
		         System.out.println("Their total is = " + total);
				 System.out.println("The average  = "  + average);
				 System.out.println("The largest number  = " + max);
                 System.out.println("The smallest number = " + min);
                 System.out.println("The total of all positive numbers = " + posit);
                 System.out.println("The total of all negative numbers = " + nega);
                 System.out.println("How many negative numbers were entered = " + j);

	}
}
//terminate