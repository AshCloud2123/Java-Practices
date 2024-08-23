import java.io.*;
public class BubbleSort
{
    public static void OpenFile (String myFile)
    {
		File myObj=new File (myFile);
		try{
			 String myReader=Mel.readString(myObj);
			 System.out.println ("====== File Content=======");
			 while ( myReader.hasNextLine ())
			 {
				 String data=myReader.nextLine ();
				  System.out.print (data);
			  }
		}
           catch (FileNotFoundException e)
           {
			   System.out.println ("FILE NOT FOUND ");
		   }
	}
    public static void main (String args [])
    {
		System.out.println ("What file you want to open?");
		String myFile = Mel.readString();

		OpenFile(myFile);
	}
}