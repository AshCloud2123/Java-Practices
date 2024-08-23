import java.util.Scanner;

public class Constructor1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Tell me your favorite food: ");
        String faveFood1 = input.nextLine();

        System.out.print("Tell me your other favorite food: ");
        String faveFood2 = input.nextLine();

        // pass an argument
        Constructor2 yourFood = new Constructor2(faveFood1);
        Constructor2 yourFood2 = new Constructor2(faveFood2);

        yourFood.message1();
        yourFood2.message2();
    }
}