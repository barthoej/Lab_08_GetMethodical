import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        String SSN;
        String mNumber;
        String menuChoice;
        String response = "";
        Scanner in = new Scanner(System.in);

        SSN = SafeInput.getRegExString(in, "Enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You said your SSN is " + SSN);

        mNumber = SafeInput.getRegExString(in, "Enter your UC M number: ", "^(M|m)\\d{5}$");
        System.out.println("You said your UC M number is " + mNumber);

        menuChoice = SafeInput.getRegExString(in, "Enter your choice from the menu: O: Open, S: Save, V: View, or Q: Quit ", "^[OoSsVvQq]$");
        System.out.println("You chose " + menuChoice + " from the menu");
    }
}