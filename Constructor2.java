public class Constructor2
{
    private final String food;

    // Constructors allows variable initializing as soon as the object is created
    // Create a constructor with the same class name and pass the String variable 'food'
    public Constructor2 (String food)
    {
        this.food = food;
    }
    public void message1()
    {
        System.out.println();
        System.out.printf("Your favorite food is %s!\n", returnFood());
    }
    public void message2()
    {
        System.out.printf("Your other favorite food is %s!\n", returnFood());
    }
    public String returnFood()
    {
        return food;
    }
}