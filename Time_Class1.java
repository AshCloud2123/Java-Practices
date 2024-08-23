import java.util.Scanner;

public class Time_Class1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Time_Class2 displayTime = new Time_Class2();

        System.out.print("Enter the number of hours: ");
        int hrs = input.nextInt();

        System.out.print("Enter the number of minutes: ");
        int mins = input.nextInt();

        System.out.print("Enter the number of seconds: ");
        int secs = input.nextInt();

        displayTime.setTime(hrs, mins, secs);
        System.out.println();
        System.out.println("Military Time Format: " + displayTime.militaryTime());
        System.out.println("Regular Time Format: " + displayTime.regularTime());
    }
}