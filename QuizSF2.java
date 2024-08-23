public class QuizSF2{
	public static void main(String args[]){
		//declare 2d array of tickets sold a day
			int[][] daySales = {{23, 14}, {31, 22},{46, 28}, {39, 32}, {22, 56}};
			//one dimensional array for prices
	    	int[] prices = {5, 8};
	    	//calling the method to main
	    	totalSales(daySales, prices);
		    }
		    //declaring a method
		public static void totalSales(int[][] daySales, int[] prices) {
			//initializing a array varaible with a size of 10
			 int[] total = new int[5];
			 //intializing a variable
			 int weekTotal=0;  int dayTotal = 0; int dayTotal1 = 0;
			 //a nested for loops that will get the sales
			 for (int i = 0; i < daySales.length; i++) {
				 dayTotal1=daySales[i][0]*prices[0];
			        for (int j = 0; j < daySales[i].length; j++) {
			            dayTotal = daySales[i][j] * prices[1];
				}
			        total[i] = dayTotal + dayTotal1;
			       weekTotal +=  total[i];
			    }
			    //an array that have a string of characters inside it
			    String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
			    //print message
			   for(int i=0; i<day.length; i++){
				   System.out.println("Day total sales " + day[i] + ": " + total[i]);
		   }
		   //total sales of the week
		   System.out.println("Total sales [Week]: " + weekTotal);
			System.out.println();
		}
}

