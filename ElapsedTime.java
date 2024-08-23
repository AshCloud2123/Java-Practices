/*Write a program that prompts the user to input the elapsed time for and event  in hours, minutes, and seconds (integer).
The program then outputs the elapsed time in seconds and output the total seconds.

@Author: Espedillon Melchor A.
@ElapsedTime.java
*/
public class ElapsedTime{
	public static void main(String []args){
		//prompts the user to enter the number of hours
		System.out.print("Enter the numbers of hours: ");
		//stores the input into the variable the variable declared
		Integer hours = Mel.readInt();
		//prompts the user to enter the minutes
		System.out.print("Enter the numbers of minutes: ");
		//store the inoput into the variable declared
		Integer minutes = Mel.readInt();
		//prompts the user to enter the seconds
		System.out.print("Enter the numbers of seconds: ");
		//store the inoput into the variable declared
		Integer seconds = Mel.readInt();

		//formula in getting the elapsed seconds
		int  elapsed_hours = hours * 3600;
		int elapsed_minutes = minutes * 60;
        int elapsed_sec= elapsed_hours + elapsed_minutes + seconds;

        //display the result on the console
        System.out.print(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds " + "is " + elapsed_sec + " total seconds \n");
	}
}