package gr11review.part1;
import java.io.*;

/**
* A program to calculate how long it will take for an investment to reach a target amount
* @author: Rami Kabak
*
*/
public class Review5 {
    public static void main(String[] args) throws IOException {

        // Declare variables
        double dblYearlyAmount;
        double dblCompoundInterestRate;
        double dblTargetAmount;
        double dblTotalAmount = 0;
        int intYear = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // User input for invested amount, interest rate and target amount
        System.out.print("Enter the yearly invested amount: ");
        dblYearlyAmount = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblCompoundInterestRate = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(keyboard.readLine());

        // While loop increasing years until the amount reaches the target amount
        while (dblTargetAmount > dblTotalAmount) {
            dblTotalAmount = dblTotalAmount + dblYearlyAmount;
            dblTotalAmount = dblTotalAmount + (dblTotalAmount * (dblCompoundInterestRate / 100));
            intYear = intYear + 1;
        }

        // Print the number of years it will take
        System.out.println("The target amount will be earned in " + intYear + " years.");
    }
}