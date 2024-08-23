/*1. Write a program using method  that will prompts from the user length and width of a rectangle.
Compute the area and the parameter. Test your result  by adding "Press 1-continue, 0-exit".
@Author: Espedillon Melchor
@Date: March 24, 2023
@Rectangle.java
*/
//class
public class Rectangle{
	//method with return value type that will return the value of parameter
	public static int para(int length,int width){
	return (length + width) * 2;
}
	//method with return value type that will return the value of area
public static int area(int length1, int width1){
	return length1 * width1;
}
//main class
	public static void main(String rectangle[]){
		//local varible dec that will accept the condition of do while loop
		int dec;
		//looping structure
		do{
			//prompts the user to enter the letght of the traingle
		System.out.print("Enter the length: ");
		//store the data inputed
		int l=Mel.readInt();
			//prompts the user to enter the width of the traingle
		System.out.print("Enter the width: ");
			//store the data inputed
		int w=Mel.readInt();
		//calling the method of parameter and display it
		System.out.println("Parameter= " + l + " + " + w + " * " + " 2 " + " = " + para(l,w));
		//calling the method of area and display it
		System.out.println("Area= " + l + " * " + w + " = " + area(l,w));
		//prompts the user to continue or not
		System.out.println("Enter 1-Continue, 0-Exit");
		//stores the data
		dec=Mel.readInt();
		//conditio of the loop structure
	}while(dec!=0);
	}
}
//terminate