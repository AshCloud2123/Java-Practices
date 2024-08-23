import java.io.*;
public class PracticeLang{
	public static void CreateFile(String newFile){
		try{
			File myobj=new File(newFile);
			if (myobj.createNewFile()){
				System.out.println("File created" + myobj.getName());
			}
			else{
				System.out.println("File already exist");
			}
		}catch (IOException e){
			System.out.println("An error has occured!");
		}
}
public static void main(String args[]){
		System.out.print("Create new file: ");
		String newFile=Mel.readString();
		CreateFile(newFile);
	  }
}
