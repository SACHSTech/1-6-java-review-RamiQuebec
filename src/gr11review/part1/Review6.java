package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review6 {
    public static void main(String[] args) throws IOException {
        double dblLoopCheck = 1;
        double dblSubtotal = 0;
        double dblTax;
        double dblTotal;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while (dblLoopCheck != 0) {
            System.out.print("Enter the price for an item: ");
            dblLoopCheck = Double.parseDouble(keyboard.readLine());
            dblSubtotal = dblSubtotal + dblLoopCheck;
        }
        
        dblTax = dblSubtotal * 0.13;
        dblTotal = dblSubtotal + dblTax;
        DecimalFormat format = new DecimalFormat("#0.00");


        System.out.println("Subtotal: " + "$" + format.format(dblSubtotal));
        System.out.println("Tax: " + "$" + format.format(dblTax));
        System.out.println("Total: " + "$" + format.format(dblTotal));
    }
}