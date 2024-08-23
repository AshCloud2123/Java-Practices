public class New2{
	public static void main(String args[]){

		        int[][] sales={{23,14},{31,22},{46,28},{39,32},{22,56}};
		        int[] prices={5,8};
		        Output(sales,prices);
		    }
 public static void Output(int[][] sales, int[] prices){
		        int totali=0, total=0, totalj=0;
		        for(int i=0; i<sales.length; i++){
		             totali+=sales[i][0]*prices[0];
		            for(int j=0;j<sales[i].length; j++){
		                 totalj+=sales[i][j]*prices[1];
		                //System.out.print(sales[i][j]+"\t");
		            }
		            total=totali+totalj;
		            System.out.print("Total sales: "+total+"\n");

		        }
			}

}