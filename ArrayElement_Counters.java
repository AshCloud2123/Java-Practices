import java.util.Random;

public class ArrayElement_Counters
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] freq = new int[6];

        for(int roll = 0; roll <= 100; roll++)
        {
            freq[rand.nextInt(6)]++;
        }

        System.out.println("Roll\tFrequency");
        System.out.println("--\t\t-------");

        for(int face = 0; face < freq.length; face++)
        {
            System.out.println((face + 1) + "\t\t" + freq[face]);
        }
    }
}