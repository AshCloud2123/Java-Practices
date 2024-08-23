public class New1
{
	public static void main(String[] args)
	{
	//Main Method
			// Number of tickets sold each day in 2D array
			int[][] TicketSales = {{23, 14}, //Monday
									{31, 22}, //Tuesday
								  	{46, 28}, //Wednesday
								  	{39, 32}, //Thursday
								  	{22, 56}}; //Friday
	    	int[] prices = {5, 8}; // Prices for each ticket in 1D array
	    	Display(TicketSales, prices); //Call method in main
		    }
		public static void Display(int[][] TicketSales, int[] prices) { //Display Method
			 int[] total = new int[5]; //Creating and initializing a new integer array for total
			 int grandtotal=0;  int dayTotal = 0; //Create a variable to hold the total sales for the current day
			 for (int i = 0; i < TicketSales.length; i++) {
			        for (int j = 0; j < TicketSales[i].length; j++) {
			            dayTotal += TicketSales[i][j] * prices[j]; //Formula for number of tickets sold each day
			        }
			        total[i] = dayTotal; // Add the day's total sales to the array
			         grandtotal +=  total[i]; //Formula to add the total sales in week
			    }
			    //Display the total sales for each day and the week
			    System.out.println("Total sales [Monday]: " + total[0]);
			    System.out.println("Total sales [Tuesday]: " + total[1]);
			    System.out.println("Total sales [Wednesday]: " + total[2]);
			    System.out.println("Total sales [Thursday]: " + total[3]);
			    System.out.println("Total sales [Friday]: " + total[4]);
			    System.out.println("Total sales [Week]: " + grandtotal);
			    System.out.println();
	}
}