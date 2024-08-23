/*1. Write a program using method  that will prompts from the user product number, name, quality, quantity and unit price
of the product. Compute the total amount, discount amount, and the Net payable of the purchase product . Test your result
by adding "Press 1-continue, 0-exit".

Quantity				Rate
1-3						2%
4-7						5%
8-12				   10%
More than 			12%

@Author: Espedillon Melchor
@Date: March 24, 2023
@Product.java
*/
//class
public class Products{
	//method that will calculate the discount
	public static double disc(double quan, double price)
	{
		//formula in getting the dicount with flow control structure and returns the value of discount
		double disc=0.0;
				if(quan>1 && quan<=3)
				return  disc = (price * 0.02)* quan;
				else if(quan>3 && quan<=7)
				return disc = (price * 0.05)* quan;
				else if(quan>7 && quan<=12)
				return disc =  (price * 0.10)* quan;
				else if(quan>12)
				return disc =  (price * 0.12)* quan;
				return disc;
}
//computes the total amount with return type
public static double total(double price, double quan)
{
	return price * quan;
}
//compute the payable amount with return type
public static double pay(double price, double quan)
{
	double pay = total(price, quan) - disc(quan,price);
	return pay;
}
   //main class
	public static void main(String product[]){
	int dec;
	do{
	//prompts the user to input the data required and store the data into the variable declared
    System.out.print("Enter product number: ");
    Integer pNum = Mel.readInt();
	System.out.print("Enter name: ");
	String name = Mel.readString();
	System.out.print("Enter quality: ");
	String qual = Mel.readString();
	System.out.print("Enter Quantity: ");
	double quan = Mel.readDouble();
	System.out.print("Enter Unit Price: ");
	Double price = Mel.readDouble();
    //display the output
	System.out.println("Product number: " + pNum);
	System.out.println("Product name: " + name);
	System.out.println("Product quality: " + qual);
	System.out.println("Product quantity: " + quan);
	System.out.println("Product price: " + price);
	System.out.println("Total: " + total(price,quan));
	System.out.println("Discount: " + disc(quan,price));
	System.out.println("Payable: " + pay(price,quan));
	System.out.print("Enter 1-Continue, 0-Exit");
	dec=Mel.readInt();
}while(dec!=0);
	}
}