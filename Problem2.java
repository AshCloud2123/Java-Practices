/*Problem 2: Write a program that accept an integer representing the total number of seconds and output the equivalent tine in
hours, minutes, and seconds.
Problem2@HoursMinutesSeconds.java
Author: Espedillon Melchor A.
Date: March 1, 2023
ver 1.0
*/
public class Problem2{
	public static void main(String []args){
		System.out.print("Enter number in seconds: ");
		Integer seconds = Mel.readInt();

		int hour = (seconds / 3600);
		int minutes = (seconds - (3600 * hour)) / 60;
		int sec = (seconds - (3600 * hour) - (minutes * 60) );

		System.out.println(seconds + " seconds is " + hour  + " hours " +  + minutes + " minutes " +  + sec + " seconds ");
	}
	}