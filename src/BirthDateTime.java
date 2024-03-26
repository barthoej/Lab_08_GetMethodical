import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        Scanner in = new Scanner(System.in);

        year = SafeInput.getRangedInt(in, "What year were you born?", 1950, 2015);
        month = SafeInput.getRangedInt(in, "What month were you born?", 1, 12);
        day = SafeInput.getDay(in, month);
        hour = SafeInput.getRangedInt(in, "What hour were you born?", 1, 24);
        min = SafeInput.getRangedInt(in, "What minute were you born?", 1, 59);

        System.out.println("Birth Date and Time: " + month + "/" + day + "/" + year + " " + hour + ":" + min);
    }
}