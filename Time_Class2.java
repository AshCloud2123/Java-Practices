public class Time_Class2
{
    private int hour, mins, secs;

    public void setTime(int h, int m, int s)
    {
        hour = ((h >= 0 && h < 24) ? h : 0);
        mins = ((m >= 0 && m < 60) ? m : 0);
        secs = ((s >= 0 && s < 60) ? s : 0);
    }

    public String militaryTime()
    {
        return String.format("%02d:%02d:%02d", hour, mins, secs);
    }

    public String regularTime()
    {
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, mins, secs, (hour < 12 ? "AM" : "PM"));
    }
}