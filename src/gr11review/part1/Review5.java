package gr11review.part1;
import java.io.*;

public class Review5 {
    public static void main(String[] args) throws IOException {
        double dblYearlyAmount;
        double dblCompoundInterestRate;
        double dblTargetAmount;
        int intYear = 0;
        double dblTotalAmount = 0;
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the yearly invested amount: ");
        dblYearlyAmount = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblCompoundInterestRate = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(keyboard.readLine());

        while (dblTargetAmount > dblTotalAmount) {
            dblTotalAmount = dblTotalAmount + dblYearlyAmount;
            dblTotalAmount = dblTotalAmount + (dblTotalAmount * (dblCompoundInterestRate/100));
            intYear = intYear + 1;
        }

        System.out.println("The target amount will be earned in " + intYear + " years.");
    }
}