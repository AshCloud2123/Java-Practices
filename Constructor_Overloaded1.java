public class Constructor_Overloaded1
{
    public static void main(String[] args)
    {
        Constructor_Overloaded2 getTime1 = new Constructor_Overloaded2();
        Constructor_Overloaded2 getTime2 = new Constructor_Overloaded2(7);
        Constructor_Overloaded2 getTime3 = new Constructor_Overloaded2(2, 39);
        Constructor_Overloaded2 getTime4 = new Constructor_Overloaded2(8, 16, 54);

        System.out.println(getTime1.timeResult());
        System.out.println(getTime2.timeResult());
        System.out.println(getTime3.timeResult());
        System.out.println(getTime4.timeResult());
    }
}