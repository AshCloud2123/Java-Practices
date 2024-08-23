/*Problem: Write a program that prompts the user to enter two integer, perform  all the Operator
Author: Espedillon Melchor A.
Date Started: February 22, 2023
Date Submitted: February 22, 2023
@BasicAndRelationalOperator.java
*/
public class BasicAndRelationalOperator{
	public static void main(String args[]){
	System.out.println("Enter First Number:");
	  int num1=Mel.readInt();
	  System.out.println("Enter Second Number:");
	  int num2=Mel.readInt();
	  //Mathematical Operators
	  int sum=num1+num2;//Computeting The Sum
	  System.out.println(num1+ " + " +num2+ " = " +sum);

	 int sub=num1 - num2;//Computeting The Difference
	 System.out.println(num1+ " - " + num2 + " = " + sub);

	int mult=num1*num2;//Computeting The Product
	 System.out.println(num1+ " * " +num2+ " = " +mult);

	 float div=num1/num2;//Computeting The Quotient
	 System.out.println(num1+ " / " +num2+ " = " +div);

	 int mod=num1%num2;//Computeting The Modulos
	 System.out.println(num1+ " % " +num2+ " = " +mod);

	 System.out.println(num1 + " ^ " + num2 + " = " + (long)Math.pow(num1, num2));

	 //Relational Operators

	 boolean eq=num1==num2;//Display Equal Value
	 System.out.println(num1+ " == " +num2+ " = " +eq);

	 boolean neq= num1!=num2;//Display Not Equal Value
	 System.out.println(num1+ " != " +num2+ " = " +neq);

	 boolean great = num1>num2;//Display Greater Than Value
	 System.out.println(num1+ " > " +num2+ " = " +great);

	 boolean less= num1<num2;//Display Lesser Than Value
	 System.out.println(num1+ " < " +num2+ " = " +less);

	 boolean geq= num1>=num2;//Display Greater Than Equal Value
	 System.out.println(num1+ " >= " +num2+ " = " +geq);

	 boolean leq= num1<=num2;//Display Lesser Than Equal Value
 System.out.println(num1+ " {}= " +num2+ " = " +leq);

	}
}