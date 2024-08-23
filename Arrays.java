import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the capacity of the array: ");
        int capacity = input.nextInt();
        int[] arr = new int[capacity];

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter a value at index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Index\tValue");

        for (int j = 0 ; j < arr.length ; j++)
        {
            System.out.println(j + "\t\t" + arr[j]);
        }
        input.close();
    }
}