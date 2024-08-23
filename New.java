import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
public class New{
	public static void main(String args[]){
		byte [] array = new byte[100];
		try{
			InputStream input = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\JavaFile\\NewFile.text");
			System.out.println("Available space inside th array: " + input.available());
			System.out.println("Mark: " + input.mark(array));

			input.read(array);
			System.out.println("Data read from the file: ");

			String data = new String(array);
			System.out.print(data);

			input.close();
		}catch(IOException e){
			e.getStackTrace();
		}
  }
}