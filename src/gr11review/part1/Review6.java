package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program to calculate total cost w/ tax from user input on items and their cost but it asks
* for an infinite number of items' costs until input of 0 is given, displays to user using decimal format
* @author: Rami Kabak
*
*/
public class Review6 {
    public static void main(String[] args) throws IOException {

        // Declare variables
        double dblLoopCheck = 1;
        double dblSubtotal = 0;
        double dblTax;
        double dblTotal;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // While loop with user input on item cost & breaks if input is 0
        while (dblLoopCheck != 0) {
            System.out.print("Enter the price for an item: ");
            dblLoopCheck = Double.parseDouble(keyboard.readLine());
            dblSubtotal = dblSubtotal + dblLoopCheck;
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