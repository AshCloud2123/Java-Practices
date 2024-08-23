public class Constructor_Overloaded2
{
    private int hour, mins, secs;

    public Constructor_Overloaded2() // constructor for 0 arguments, 0 is default for no input
    {
        this(0, 0, 0);
    }
    public Constructor_Overloaded2(int h) // this constructor will be used if there's 1 argument
    {
        this(h, 0, 0);
    }
    public Constructor_Overloaded2(int h, int m) // this constructor will be used if there's 2 arguments
    {
        this(h, m, 0);
    }

    // this constructor will be used if there's 3 arguments
    // all previous constructors ends up here before going to the setTime method
    public Constructor_Overloaded2(int h, int m, int s)
    {
        setTime(h, m, s);
    }

    // checking each values
    public void setTime(int h, int m, int s)
    {
        hour = ((h >= 0 && h < 24) ? h : 0);
        mins = ((m >= 0 && m < 60) ? m : 0);
        secs = ((s >= 0 && s < 60) ? s : 0);
    }
    public String timeResult()
    {
        return String.format("%02d:%02d:%02d", hour, mins, secs);
    }

}