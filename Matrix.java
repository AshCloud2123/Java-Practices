// Initialize two square matrices and implements the following methods.
//public static void display(int[][] m1, int[][] m2);
//public static int[][] multiplyM(int[][] m1, int[][] m2);
//public static int[][] addM(int[][] m1, int[][] m2);
//public static int[][] DiffM(int[][] m1, int[][] m2);
//public static int determinant(int[][] matrix);
//Matrix.java
//Author: Espedillon Melchor
public class Matrix{
	    public static int [][] first = {{1,2,3},{4,5,6}, {6,9,10}};
		public static int [][] second = {{3,3,1},{8,2,6},{3,1,9}}; //declaration of matrices
	public static void main(String args[]){
		display(first,second); //calling the display method
  }
  public static void display(int[][] m1, int[][] m2){
	  System.out.println("\t"+"Firts matrix: ");
	  	int [][] arr = new int[5][5];
	  		for(int i=0; i<m1.length; i++){
	  		   for(int j=0; j<m2[0].length; j++){ //printing out the first matrix
	  		   arr[i][j] = m1[i][j];
	  		    System.out.print("\t" + arr[i][j]);
	       }
	       System.out.println();
    }
    System.out.println("\tSecond matrix: ");
    int [][] arr1 = new int[5][5];
		  		for(int i=0; i<m1.length; i++){
		  		   for(int j=0; j<m2[0].length; j++){ //printing out the second matrix
		  		   arr[i][j] = m2[i][j];
		  		    System.out.print("\t" + arr[i][j]);
		       }
		       System.out.println();
    }
    System.out.println();
    System.out.println("\tMatrix after Multiplying: ");
    multiplyM(m1,m2);
    System.out.println();
	System.out.println("\tMatrix after Adding: ");              //Displaying matrices after apllying multi,sub,add, and deter
    addM(m1,m2);
    System.out.println();
	System.out.println("\tMatrix after Subtracting: ");
    DiffM(m1,m2);
    System.out.println();
	System.out.println("\tFirst matrix Determinant: " +determinant(m1));
    System.out.println();
	System.out.println("\tSecond matrix Determinant: " + determinant(m2));
  }

 public static int[][] multiplyM(int[][] m1, int[][] m2){
	 	int [][] arr = new int[3][3];
	 for(int i=0; i<3; i++){
	 	for(int j=0; j<3; j++){ //method of getting matrices after multiplying
	 arr[i][j] = 0;
	 	  for(int k=0; k<3; k++){
			  arr[i][j] += m1[i][k] * m2[k][j];
		   }
		   System.out.print(" \t" + arr[i][j] + "  ");
	     }
	      System.out.println();
    }
    return arr;
  }
  public static int[][] addM(int[][] m1, int[][] m2){
	  int [][] arr = new int[3][3];
	  	 for(int i=0; i<3; i++){ //method of getting matrices after Adding
	  	 		   for(int j=0; j<3; j++){
	  	 		   arr[i][j] = m1[i][j] + m2[i][j];
	  	 		    System.out.print("\t"+arr[i][j] + "  ");
	  	      }
	  	      System.out.println();
	      }
    return arr;
  }
  public static int[][] DiffM(int[][] m1, int[][] m2){
	    int [][] arr = new int[3][3];
	  	  	 for(int i=0; i<3; i++){
	  	  	 		   for(int j=0; j<3; j++){ //method of getting matrices after subtracting
	  	  	 		   arr[i][j] = m1[i][j] - m2[i][j];
	  	  	 		    System.out.print("\t"+arr[i][j] + "  ");
	  	  	      }
	  	  	      System.out.println();
	  	      }
    return arr;
}
  public static int determinant(int[][] matrix) {//Determinants of Matrices
  	        int deter = 0; //initialize variable which will be used to store the determinant value.
  	            for (int j = 0; j < matrix.length; j++) {//code enters into loop that iterates over each column of the matrix.
  	            										 //For each column, a submatrix is created by removing the first row and the current column.
  	                int[][] submatrix = new int[matrix.length - 1][matrix.length - 1];
  	                for (int i = 1; i < matrix.length; i++) {
  	                    for (int k = 0; k < matrix.length; k++) { //method for getting the determinant
  	                        if (k < j) {
  	                            submatrix[i - 1][k] = matrix[i][k];
  	                        } else if (k > j) {
  	                            submatrix[i - 1][k - 1] = matrix[i][k];
  	                        }
  	                    }
  	                }//determinant of this submatrix is recursively calculated by calling the same function again.
  	                int sign = (j % 2 == 0) ? 1 : -1;//The final determinant value is calculated by summing up the product of the current element of the first row of the matrix
  	                deter += sign * matrix[0][j] * determinant(submatrix);
  	            }
  	        return deter;
	        }
}
