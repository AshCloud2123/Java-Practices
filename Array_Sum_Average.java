import java.util.Scanner;

public class Array_Sum_Average
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter a value at index " + i + ": ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        System.out.println();
        System.out.print("Values inputted: ");
        for (int list : arr)
        {
            System.out.print(list + " ");
        }

        System.out.println();
        System.out.println("Total sum: " + sum);

        double avg = (double)sum/arr.length;
        System.out.println("Average: " + avg);

        input.close();
    }
}