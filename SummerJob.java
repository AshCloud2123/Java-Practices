/*1. You found and exciting summer job for five weeks . It pays 15.50 per hours. Suppose that the total tax you pay on your summer
job income is 14%. Afterpaying the taxes, you spend 10% of your net income  to buy new clothes and other accessories for the next school
year and 1% to buy school supplies. After buying clothes and school supplies, you use 25% of the remaining money to buy savongs bonds.
For each you spend to buy saving bonds, your parents spend 0.50 to buy additional saving bonds for you. Write a program that prompts the
user to pay rate for an hour and the number of hours you worked each week. THe program then outputs the following:

A. Your income before and after taxes from summer job.
B. The money you spend on clothes and other accessories.
C. The money you spend on school supplies.
D. The money you spend to buy the saving bonds.
E. The money your parents spend to buy additional savong bonds for you
@Author: Espedillon Melchor A.
@SummerJob.java
*/
public class SummerJob{
	public static void main(String []args){
		//prompts the user to enter the rate per hour
		System.out.print("Enter the pay rate per hour: ");
		//the input will go to the variable rHour
		Double rHour = Mel.readDouble();
		//prompts again the user to enter the total hours he/she work in a week
		System.out.print("Enter the number of hours worked each week: ");
		//the input will go to the variable wHour
		Double wHour = Mel.readDouble();
		//formula in getting the total income before the tax
		Double income_before_taxes = rHour * (wHour * 5);
		//display an output of the total income of the whole summer job duration
		System.out.println("Income before taxes: " +  "Php " + income_before_taxes);
		//formula in getting the total income after the tax
	    Double income_after_taxes = income_before_taxes - (income_before_taxes  * 0.14);
	    //display an output of the total income after deducted with taxes
		System.out.println("Income after taxes: " + "Php " +  income_after_taxes);
		//formula in getting the money spent on  clothes and accessories
		Double clothes_accessories = (income_after_taxes  * 0.10);
		//display the total money spent on the clothes and accessorries
		System.out.println("Spent money on clothes and accessories: " + "Php " + clothes_accessories);
		//formula in getting the total money spent on school supplies
		Double schoolSupplies = (income_after_taxes  * 0.01);;
		//print out the message of how much the user spend on school supplies
		System.out.println("Spent money on school supplies " + "Php " + schoolSupplies);
		//formula in getting the total money spent on saving bonds
		Double moneyAfterDeduct =income_after_taxes - (clothes_accessories + schoolSupplies);
		Double moneyAfterDeduct2 = moneyAfterDeduct * .25;
		//display the message of the total money spent on saving bonds
		System.out.println("Spent money on savings bonds: " + "Php " + moneyAfterDeduct2);
		//formula in getting the additional saving bonds
		Double add_savingBonds = moneyAfterDeduct2* 0.50;
		//prints the output of the additional saving bonds
		System.out.println("Money parents spent on additional savings bonds " + "Php " + add_savingBonds);

	}
}