import java.util.Scanner;

public class ArrayMethods
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5};

        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size ; i++)
        {
            System.out.print("Enter the value at index " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Total sum: " + sum(arr));
        System.out.println();
        input.close();
    }
    public static int sum(int[] arr)
    {
        int sum = 0;

        for (int numList : arr)
            sum += numList;

        return sum;
    }
}