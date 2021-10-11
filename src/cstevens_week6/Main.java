package cstevens_week6;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 6 Assignment
 * @Date: Jun 27, 2021
 * @Description: Methods
 */
//Imports
import java.util.Scanner;

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        // create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the City Power Bill Calculator!");

        // constants
        final double RATE_A = .0809;
        final double RATE_B = .091;
        final double RATE_C = .109;
        final double RATE_TAX = .0346;

        // declarations
        String again;           //used to run again
        double prev;            //previous reading
        double curr;            //current reading
        double rate;            //determined rate

        // begin DO WHILE loop to re-run the calculator
        do {

            System.out.print("\nPlease enter your previous meter reading: ");

            // take user input for previous meter reading
            prev = sc.nextDouble();

            System.out.print("Please enter your current meter reading: ");

            // take user input for current meter reading
            curr = sc.nextDouble();
            sc.nextLine();

            // report usage
            System.out.printf("\nYour usage was: %.1f KwHs\n",
                    usage(prev, curr));

            // determine rate
            if (usage(prev, curr) <= 500) {
                rate = RATE_A;
            } else if (usage(prev, curr) >= 501 && usage(prev, curr) <= 900) {
                rate = RATE_B;
            } else {
                rate = RATE_C;
            }

            // report rate
            System.out.printf("Your rate was: $%.4f/KwH\n", rate);

            // subtotal
            System.out.printf("Your subtotal is: $%.2f\n",
                    subtotal((usage(prev, curr)), rate));

            // taxes
            System.out.printf("Taxes are: $%.2f\n",
                    taxes(RATE_TAX, subtotal((usage(prev, curr)), rate)));

            // total
            System.out.printf("Your total bill this month is: $%.2f\n",
                    subtotal((usage(prev, curr)), rate)
                    + taxes(RATE_TAX, subtotal((usage(prev, curr)), rate)));

            // ask user if they want to calculate again
            System.out.print("\nWould you like to calculate a new usage?\n"
                    + "(Y for Yes, N to exit): ");

            // take input for continue selection
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.print("\nThank you for using this program! "
                    + "Goodbye!\n\n");
    
    } //End Main Method

    /**
     * Method @usage: Method to calculate usage
     *
     * @param p
     * @param c
     * @return usage
     */
    private static double usage(double p, double c) {
        return (c - p);
    }

    /**
     * Method @taxes: Method to calculate taxes

     * @param t
     * @param s
     * @return
     */
    private static double taxes(double t, double s) {
        return (t * s);
    }

    /**
     * Method @subtotal: Method to calculate subtotal
     *
     * @param u
     * @param r
     * @return subtotal
     */
    private static double subtotal(double u, double r) {
        return (u * r);
    }

} //End Class Main
