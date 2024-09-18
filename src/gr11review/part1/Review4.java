package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program to calculate total cost w/ tax from user input on items and their cost
* @author: Rami Kabak
*
*/
public class Review4 {
    public static void main(String[] args) throws IOException {

        // Declare variables
        int intNumItems;
        double dblSubtotal = 0;
        double dblTax;
        double dblTotal;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // User input
        System.out.print("How many items do you want to buy? ");
        intNumItems = Integer.parseInt(keyboard.readLine());

        // For loop with user input on number of items and their cost
        for (int i = 1; i < intNumItems + 1; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblSubtotal = dblSubtotal + Double.parseDouble(keyboard.readLine());
        }

        // Calculate tax and total cost, use DecimalFormat to use custom format
        dblTax = dblSubtotal * 0.13;
        dblTotal = dblSubtotal + dblTax;
        DecimalFormat format = new DecimalFormat("#0.00");

        // Print information w/ Subtotal, tax, and total using custom format
        System.out.println("Subtotal: " + "$" + format.format(dblSubtotal));
        System.out.println("Tax: " + "$" + format.format(dblTax));
        System.out.println("Total: " + "$" + format.format(dblTotal));
    }
}