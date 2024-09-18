package gr11review.part1;
import java.io.*;

/**
* A program to calculate the number of days it has been in a year given the number of months and days
* @author: Rami Kabak
*
*/
public class Review1 {
    public static void main(String args[]) throws IOException {
        
        // Declare Variables
        int intMonthNumber;
        int intDayNumber;
        int intAnswer = 0;
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // User input for # of months & days
        System.out.print("Enter the month number: ");
        intMonthNumber = Integer.parseInt(keyboard.readLine());
        System.out.print("Enter the day number: ");
        intDayNumber = Integer.parseInt(keyboard.readLine());
        
        // For loop to add days from array
        for (int i = 0; i < intMonthNumber - 1; i++) {
            intAnswer = intAnswer + monthDays[i];
        }

        // Print total # of days
        System.out.println(intAnswer+intDayNumber);
    }
}