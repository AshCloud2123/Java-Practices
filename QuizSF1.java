public class QuizSF1{
	public static double [][]  healthy, sick, carrier;
		public static void display() {
			 System.out.println("Healthy males and Female: " + (healthy[0][0] + healthy[1][0]));
		     System.out.println("Sick males and Female: " + (sick[0][0] + sick[1][0]));
		     System.out.println("Carrier males and Female: " + (carrier[0][0] + carrier[1][0]));

	}
	public static void main(String args[]){
	        double[][] num = {{100, 120}, {80, 100}};
	        double[][] hPer = {{0.15, 0.15}, {0.25, 0.25}};
	        double[][] sPer = {{0.35, 0.35}, {0.3, 0.3}};
	        double[][] cPer = {{0.5, 0.5}, {0.45, 0.45}};

	       healthy = multiplyMatrices(num, hPer);
	       sick = multiplyMatrices(num, sPer);
	       carrier = multiplyMatrices(num, cPer);
	       display();
	    }

    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
	        int m = a.length;
	        int n = b[0].length;
	        int p = b.length;
	        double[][] t = new double[m][n];

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                double sum = 0.0;
	                for (int k = 0; k < p; k++) {
	                    sum += a[i][k] * b[k][j];
	                }
	                t[i][j] = sum;
	            }
	        }
	        return c;
	    }
	}


