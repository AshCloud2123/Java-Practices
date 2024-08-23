/*Problem 2: Create a program that will require the user
to input Product number, Description, Quantity and Unit Price
and would compute the discount amount of the product based on the
following rate table:
Quantity Rate
Less than or equal 5 but not zero 3%
over 5 but not over 10 5%
over 10 but not over 15 7%
over 15 10%
Compute the Total amount, Discount Amount, Net Payable, and
display. Use NESTED IF
Author: Espedillon Melchor
Date Started: March 8, 2023
Date Finished: March 8, 2023
@Product.java
*/
public class Product{
	public static void main(String args[]){
		System.out.print("Enter Product number: ");
		        Integer pNum = Mel.readInt();
		System.out.print("Enter Description: ");
				String descrip = Mel.readString();
		System.out.print("Enter Quantity: ");
				Integer quanti = Mel.readInt();
		System.out.print("Enter Unit Price: ");
				Double unPrice = Mel.readDouble();
			System.out.print("\n\n");
						double uPrice = 0;
	  if(quanti > 0 && quanti <= 5){
		System.out.println("Product number: " + pNum);
		System.out.println("Description: " + descrip);
		System.out.println("Quantity: " + quanti);
		System.out.println("Unit Price " + unPrice);
	    System.out.println("Total = " + (unPrice * quanti));
	    System.out.println("Discount = " + (unPrice * 0.03) * quanti);
	    System.out.println("Payable Amount = " + (unPrice - (unPrice * 0.03)) * quanti);
	}
	  else if(quanti > 5 && quanti <=10){
		 System.out.println("Product number: " + pNum);
		 System.out.println("Description: " + descrip);
		 System.out.println("Quantity: " + quanti);
		System.out.println("Unit Price " + unPrice);
	    System.out.println("Total = " + (unPrice * quanti));
	    System.out.println("Discount = " + (unPrice * 0.05) * quanti);
	    System.out.println("Payable Amount = " + (unPrice - (unPrice * 0.05)) * quanti);
	}
	  else if(quanti > 10 && quanti <=15){
		System.out.println("Product number: " + pNum);
		System.out.println("Description: " + descrip);
		System.out.println("Quantity: " + quanti);
		System.out.println("Unit Price " + unPrice);
	    System.out.println("Total = " + (unPrice * quanti));
	    System.out.println("Discount = " + (unPrice * 0.07) * quanti);
	    System.out.println("Payable Amount = " + (unPrice - (unPrice * 0.07)) * quanti);
	}
	    else if(quanti > 15){
		System.out.println("Product number: " + pNum);
	    System.out.println("Description: " + descrip);
		System.out.println("Quantity: " + quanti);
		System.out.println("Unit Price " + unPrice);
	    System.out.println("Total = " + (unPrice * quanti));
	    System.out.println("Discount = " + (unPrice * 0.10) * quanti);
	    System.out.println("Payable Amount = " + (unPrice - (unPrice * 0.10)) * quanti);
}
	}
	}