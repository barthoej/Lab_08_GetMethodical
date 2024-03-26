import java.util.Scanner;

public class SafeInput
{
    /**
     * Get a string which contains at least one character
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0); // until we have characters

        return retString;
    }

    /**
     * Get an int value within a specified numeric range
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - int value within the inclusive range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);

        return retVal;

    }

    /**
     * Get an int value with no constraints
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("/n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get a double value within a specified numeric range
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - int value within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an double " + trash);
            }
        } while (!done);

        return retVal;

    }


    /**
     * Get a double value with no constraints
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("/n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double: " + trash);
            }
        }while(!done);

        return retVal;
    }


        /**
         * Get a [Y/N] confirmation from the user
         * @param pipe - Scanner instance to read the data System.in in most cases
         * @param prompt - Input prompt msg for user does not need [Y/N]
         * @return - true for yes false for no
         */
        public static boolean getYNConfirm(Scanner pipe, String prompt)
        {
            boolean retVal = true;
            String response = "";
            boolean gotAVal = false;

            do {
                System.out.println("\n" + prompt + " [Y/N] ");
                response = pipe.nextLine();
                if (response.equalsIgnoreCase("Y")) {
                    gotAVal = true;
                    retVal = true;
                } else if (response.equalsIgnoreCase("N")) {
                    gotAVal = true;
                    retVal = false;
                } else {
                    System.out.println("You must answer [Y/N]! " + response);
                }
            } while (!gotAVal);

            return retVal;
        }


    /**
     * Get a String that matches a RegEx pattern! This is a very powerful method
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - prompt for user
     * @param regExPattern - java style RegEx pattern to constrain the input
     * @return a string that matches the RegEx pattern supplied
     */

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.println("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern))
            {
                gotAVal = true;
            }
            else
            {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }
        }while(!gotAVal);

        return response;
    }
    public static int getDay(Scanner in, int month) {
        int maxDay;
        switch (month) {
            case 2: // February
                maxDay = 29; // Assuming leap year is handled elsewhere
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                maxDay = 30;
                break;
            default:
                maxDay = 31;
        }
        return SafeInput.getRangedInt(in, "Enter the day of birth (1-" + maxDay + "): ", 1, maxDay);
    }
}


