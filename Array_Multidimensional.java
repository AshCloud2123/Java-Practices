import java.util.Scanner;

public class Array_Multidimensional
{
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int col =  input.nextInt();

        int[][] yourArray = new int[row][col];

        valueInput(row, col, yourArray);
        display(yourArray);
    }
    public static void valueInput(int row, int col, int[][] yourArray)
    {
        Scanner input = new Scanner(System.in);

        for (int i = 0 ; i < row ; i++)
        {
            for (int j = 0 ; j < col ; j++)
            {
                System.out.print("Enter a number: ");
                yourArray[i][j] = input.nextInt();
            }
        }
        System.out.println();
    }
    public static void display(int[][] array)
    {
        for (int[] eachGroup : array)
        {
            for (int eachValue : eachGroup)
                System.out.print(eachValue + "\t");

            System.out.println();
        }
    }
}