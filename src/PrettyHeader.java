public class PrettyHeader
{
    public static void main(String[] args) {
        prettyHeader("Hello");
    }
    public static void prettyHeader(String msg)
    {
        int totalWidth = 60;
        int msgLength = msg.length();
        int starsLength = (totalWidth - msgLength - 6) / 2;

        for (int row = 0; row < totalWidth; row++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("***");
        for (int row = 0; row < starsLength; row++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int row = 0; row < starsLength; row++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom row of stars
        for (int row = 0; row < totalWidth; row++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
