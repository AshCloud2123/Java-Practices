import java.io.*;
import java.text.*;
public class Mel {
	public static String readString(){
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in),1);
		String s= " ";
		try
		{
			s=rb.readLine();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
			return s;
		}
		public static int readInt(){
			return Integer.parseInt(readString());
		}
		public static float readFloat(){
			return Float.parseFloat(readString());
		}
		public static double readDouble(){
			return Double.parseDouble(readString());
		}
		public static String formatString(double num)
		{
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(2);
			nf.setMinimumFractionDigits(2);
			String Stnum = nf.format(num);
			return Stnum;
	}
}