import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        final int SIZE = 100;
        double itemPrice = 0;
        int itemCount = 0;
        double sum = 0;
        double[] itemPrices = new double[SIZE];
        boolean done = false;
        Scanner in = new Scanner(System.in);

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item: ", 0.50, 10.00);
            itemPrices[itemCount] = itemPrice;
            itemCount++;

            done = SafeInput.getYNConfirm(in, "Are you done?");

        } while (!done);

        for (int r = 0; r < itemCount; r++)
            sum += itemPrices[r];
        System.out.printf("\nThe total is %8.2f", sum);
        int r;
        for (r = 0; r < itemCount; r++)
            System.out.printf("\n%f8.2", itemPrices[r]);

        System.out.printf("\nThe total is %8.2f", sum);


    }
}
