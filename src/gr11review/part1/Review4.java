package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review4 {
    public static void main(String[] args) throws IOException {
        int intNumItems;
        double dblSubtotal = 0;
        double dblTax;
        double dblTotal;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many items do you want to buy? ");
        intNumItems = Integer.parseInt(keyboard.readLine());
        
        for (int i = 1; i < intNumItems + 1; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblSubtotal = dblSubtotal + Double.parseDouble(keyboard.readLine());
        }

        dblTax = dblSubtotal * 0.13;
        dblTotal = dblSubtotal + dblTax;
        DecimalFormat format = new DecimalFormat("#0.00");

        System.out.println("Subtotal: " + "$" + format.format(dblSubtotal));
        System.out.println("Tax: " + "$" + format.format(dblTax));
        System.out.println("Total: " + "$" + format.format(dblTotal));
    }
}