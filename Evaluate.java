/*Make a program using methods that would input N number integers and output:
a.Their total
b.Their largest
c.The smallest
d.The total of all positive numbers
e.The total of all negative numbers
f.How many between 50 to 100
public static void Total(int x)
public static Output(int number)
public static void display(int number)
and so o..
Note: Don't use arrays on this problem
@Evaluate.java
@Author: Espedillon Melchor
@Date: March 24, 2023
@ver.1.0
*/
//class
public class Evaluate{
	//global variables
public static int SumPos=0,SumNeg=0,total=0,Large=Integer.MIN_VALUE,Small=Integer.MAX_VALUE,Between=0;
//method for getting the total
	public static int total(int num)
	{
		return total+=num;
	}
	//method for getting the Largest integer
 static void computeLarge(int num){
        if (num > Large) {
            Large = num;
        }
    }
    	//method for getting the Smallest integer
	 static void computeSmall(int num){
	        if (num < Small) {
	            Small = num;
	        }
   }
	//method for getting the positive integer
public static int computePositive(int num)
{
		if(num>0)
	    SumPos++;
	    return SumPos;
	}
	//method for getting the negative integer
	public static int computeNegative(int num)
	{
		if(num<0)
		SumNeg++;
		return SumNeg;
    }
    //method for getting the number between 50-100 integer
   public static int computeBetween(int num)
   {
   		if(num>50 && num<100)
   		Between++;
   		return Between;
   }
   //method of display
static void display()
{
        System.out.println("\nTotal of all numbers = "+total);
        System.out.println("Largest integer = "+Large);
        System.out.println("Smallest integer = "+Small);
        System.out.println("Total of all positive numbers: "+SumPos);
        System.out.println("Total of all negative numbers: "+SumNeg);
        System.out.println("Numbers between 50-100: "+Between);
}
//method for output
public static void output(int num)
{
        total(num);
        computeLarge(num);
        computeSmall(num);
        computePositive(num);
        computeNegative(num);
        computeBetween(num);
}
//main method
public static void main(String evaluate[]){
	//prompts the user to inter number of integer he/she want
	 System.out.print("Enter number of integer: ");
	 //store the data
	int par=Mel.readInt();
	//loop
	 for(int i=0; i<par; i++){
	System.out.println("Enter number: ");
	 int number=Mel.readInt();
	 output(number);
	}
	display();
  }
}
//terminate